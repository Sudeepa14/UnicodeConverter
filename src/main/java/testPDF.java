import PDF.PDFToUnicodePDFBOX;
import PDF.PDFToUnicodeiText;

import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 * Created by gayan@ciperlabs.com on 5/07/18.
 */
public class testPDF {
    public static void main(String[] args) {
        String folderPath = "/Desktop/CiperLabs/UnicodeConverter/docs";
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()+folderPath);

        int returnValue = jfc.showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);
        File file = null;
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            file = jfc.getSelectedFile();
            System.out.println(file.getAbsolutePath());
        }

        String fileName = file.getName();
        System.out.println(fileName);
        String[] fnameSplitted = fileName.split("\\.");
        String outPutFileName="";
        int i =0;
        while (i<fnameSplitted.length-1){
            outPutFileName+=fnameSplitted[i];
            i++;
        }
        outPutFileName += "-converted." + fnameSplitted[fnameSplitted.length-1];
        FileInputStream fileInputStream = null;

            PDFToUnicodePDFBOX pdfToUnicodePDFBOX = new PDFToUnicodePDFBOX();

            pdfToUnicodePDFBOX.startConvertion(file);

//        PDFToUnicodeiText pdfToUnicodeiText = new PDFToUnicodeiText();
//        pdfToUnicodeiText.startConvertioin(file);
    }
}
