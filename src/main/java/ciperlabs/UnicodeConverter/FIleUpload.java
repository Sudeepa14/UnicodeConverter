package ciperlabs.UnicodeConverter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Random;

import javax.json.Json;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.server.model.ParamQualifier;
import org.glassfish.hk2.utilities.reflection.Logger;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import ConvertionEngine.Engine;
import word.WDXToUnicode;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("fileupload")
public class FIleUpload {
	String rootStorage = "/home/cse14/storage/";
	@POST
	@Path("/docx")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadtest(@FormDataParam("file") InputStream file, @FormDataParam("file") FormDataContentDisposition fileDetail) {
		
		Message mes = new Message();
        Random rand = new Random();
        int randval = rand.nextInt(1000);
		String outPutFileName =rootStorage+"docx/"+randval+"converted"+fileDetail.getFileName();
		
		File theDir = new File(rootStorage+"docx/");

		// if the directory does not exist, create it
		if (!theDir.exists()) {
		    System.out.println("creating directory: " + theDir.getName());
		    boolean result = false;

		    try{
		        theDir.mkdirs();
		        result = true;
		    } 
		    catch(SecurityException se){
		        //handle it
		    	se.printStackTrace();
		    }        
		    if(result) {    
		        System.out.println("DIR created"); 
		        
		    }
		}

            try {
                XWPFDocument docx = new XWPFDocument(file);
                WDXToUnicode docxConverter = new WDXToUnicode(docx);
                XWPFDocument convertedFile = docxConverter.startConversion();
                try {
                	FileOutputStream out = new FileOutputStream(outPutFileName);
                	convertedFile.write(out);
                	
                    mes.setMessage(outPutFileName);

            	   	} catch (IOException e) {
                	e.printStackTrace();
                    mes.setError(true);
                    mes.setMessage("Error! while writing the file.");
                }
            } catch (IOException e) {
                e.printStackTrace();
                mes.setError(true);
                mes.setMessage("Error! Incompatible document");
            }
        
		return Response.ok() //200
				.entity(mes)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.allow("OPTIONS").build();
	}
	
	
	@GET
	@Path("{folder}/{filename}")
	@Produces("application/vnd.ms-word")
	@Consumes(MediaType.TEXT_PLAIN)
	public Response test(@PathParam("folder") String folder, @PathParam("filename") String filename) {
		
      
		String filePath = rootStorage+folder+"/"+filename;
		File file = new File(filePath);
		System.out.println("Downloaading...........");
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename="+filename);
		return response.build();
	}
}
