package ciperlabs.UnicodeConverter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Dictionary;
import java.util.HashMap;

import javax.json.Json;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import ConvertionEngine.Engine;
import word.WDXToUnicode;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("fileupload")
public class FIleUpload {

//	@POST
//	@Path("/docx")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Message upload(Message message) {
//		
//		System.out.println(message.getMessage());
//		
//		Message mes = new Message();
//
//        String fileName = message.getMessage();
//        System.out.println(fileName);
//        String[] fnameSplitted = fileName.split("\\.");
//        String outPutFileName="";
//        int i =0;
//        while (i<fnameSplitted.length-1){
//            outPutFileName+=fnameSplitted[i];
//            i++;
//        }
//        outPutFileName += "-converted." + fnameSplitted[fnameSplitted.length-1];
//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream(message.getMessage());
//            try {
//                XWPFDocument docx = new XWPFDocument(fileInputStream);
//                WDXToUnicode docxConverter = new WDXToUnicode(docx);
//                XWPFDocument convertedFile = docxConverter.startConversion();
//                try {
//
//                    convertedFile.write(new FileOutputStream(outPutFileName));
//                    mes.setMessage(outPutFileName);
//                } catch (IOException e) {
//                	e.printStackTrace();
//                    mes.setError(true);
//                    mes.setMessage("Error! while writing the file.");
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//                mes.setError(true);
//                mes.setMessage("Error! Incompatible document");
//          
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            mes.setError(true);
//            mes.setMessage("Error! File Upload haven't completed succeffully !");
//     
//        }
//		return mes;
//	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadtest(@FormDataParam("file") InputStream file, @FormDataParam("file") FormDataContentDisposition fileDetail) {
		
		Message mes = new Message();
		String outPutFileName = "test.docx";
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");
        
//            FileInputStream fileInputStream = file;

//            fileInputStream = new FileInputStream(message.getMessage());
            try {
                XWPFDocument docx = new XWPFDocument(file);
                WDXToUnicode docxConverter = new WDXToUnicode(docx);
                XWPFDocument convertedFile = docxConverter.startConversion();
                try {

                    convertedFile.write(new FileOutputStream(outPutFileName));
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
}
