package PDF;

import ConvertionEngine.Engine;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.ImageRenderInfo;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextRenderInfo;

import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by gayan on 5/7/18.
 */
public class PDFToUnicodeiText {


    public void startConvertioin(File file){

        XWPFDocument doc = new XWPFDocument();
        String pdf = file.getAbsolutePath();
        Engine convertionEngine = new Engine();
        CTRPr sinhalaUnicodeCTRPr =  CTRPr.Factory.newInstance();                        // Set All types of fonts for sinhala types
        CTFonts fonts = CTFonts.Factory.newInstance();
        fonts.setAscii("Iskoola Pota");
        fonts.setHAnsi("Iskoola Pota");
        fonts.setCs("Iskoola Pota");
        sinhalaUnicodeCTRPr.setRFonts(fonts);

        try {
            PdfReader reader  = new PdfReader(pdf);
            PdfReaderContentParser parser = new PdfReaderContentParser(reader);
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                TextExtractionStrategy strategy =
                        parser.processContent(i, new frontDetecStrategy());
                String text = strategy.getResultantText();
//                String[] convertedText = convertionEngine.toUnicode(text,"FMAbhaya");

                XWPFParagraph p = doc.createParagraph();
                XWPFRun run = p.createRun();
                run.getCTR().setRPr(sinhalaUnicodeCTRPr);
                run.setText(text);
                run.addBreak(BreakType.PAGE);
            }
            FileOutputStream out = new FileOutputStream("pdf1.docx");
            doc.write(out);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class frontDetecStrategy implements TextExtractionStrategy{
    private String combText="";
    private String text;
    private Engine convertionEngine = new Engine();
	@Override
	public void beginTextBlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderText(TextRenderInfo renderInfo) {
		// TODO Auto-generated method stub
		String combinedFont=renderInfo.getFont().getPostscriptFontName();
//		System.out.println(combinedFont);
		String[] fontList=combinedFont.split("\\+");
		String font=fontList[0];
		if(fontList.length>1){
			font=fontList[1];
		}
//		System.out.println(font);
		String text=renderInfo.getText();
		String[] cnvtText=convertionEngine.toUnicode(text,font);
//		System.out.println(cnvtText[0]);
		combText+=cnvtText[0];
	}

	@Override
	public void endTextBlock() {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void renderImage(ImageRenderInfo renderInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getResultantText() {
		// TODO Auto-generated method stub
		String tempText=combText;
		combText="";
//		System.out.println(tempText);
		return tempText;
	}
	
}
