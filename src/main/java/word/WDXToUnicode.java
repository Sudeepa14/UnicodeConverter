package word;

import ConvertionEngine.Engine;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFFooter;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFStyle;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;

import java.io.*;
import java.util.List;

/**
 * Created by gayan@ciperlabs.com on 4/21/18.
 */
public class WDXToUnicode {

    private XWPFDocument docx = null;
    private CTRPr sinhalaUnicodeCTRPr = null;
    private CTRPr tamilUnicodeCTRPr= null;
    private static String sinhalaUnicodeFont = "Iskoola Pota";
    private static String tamilUnicodeFont = "Latha";
    private static String sinhalaExtraFont = "Nirmala UI";
    private static String[] nonStartables = { "ා","ැ","ෑ","ි","ී","ු" ,"ූ","ෘ","ෙ",
            "ේ","ෛ","ො","ෝ","ෞ","ෟ","ෲ","ෳ","්","்","ா","ி","ீ","ே","ெ"};
    private Engine engine;

    private WDXToUnicode(){}                            // Avoid accidental creation of Object without File

    public WDXToUnicode(XWPFDocument docx){
        this.docx = docx;
        sinhalaUnicodeCTRPr =  CTRPr.Factory.newInstance();                        // Set All types of fonts for sinhala types
        CTFonts fonts = CTFonts.Factory.newInstance();
        fonts.setAscii(sinhalaUnicodeFont);
        fonts.setHAnsi(sinhalaUnicodeFont);
        fonts.setCs(sinhalaUnicodeFont);
        sinhalaUnicodeCTRPr.setRFonts(fonts);

        tamilUnicodeCTRPr =  CTRPr.Factory.newInstance();                        // Set All types of fonts for Tamil types
        CTFonts fonts2 = CTFonts.Factory.newInstance();
        fonts2.setAscii(tamilUnicodeFont);
        fonts2.setHAnsi(tamilUnicodeFont);
        fonts2.setCs(tamilUnicodeFont);
        tamilUnicodeCTRPr.setRFonts(fonts2);
        
        this.engine = new Engine();
    }

    public XWPFDocument startConversion() {

        
        convertParagraphs(docx);
        convertFooter(docx);
        convertTables(docx);
        return docx;
    }
    
    private void convertParagraphs(XWPFDocument docx) {
    	List<XWPFParagraph> paragraphs = docx.getParagraphs();
        int paragraphsCount = paragraphs.size();
        int currentParagraphPosition = 0;

        while (currentParagraphPosition<paragraphsCount){

            XWPFParagraph paragraph = paragraphs.get(currentParagraphPosition);
            List<XWPFRun> runs = paragraph.getRuns();
            if (runs != null) {
                int runsLength = runs.size();
                int i = 0;
                while (i < runsLength) {
                    XWPFRun run = runs.get(i);

                    String[] convertedText = engine.toUnicode(run.getText(0),run.getFontFamily());
                    String sConvertedText = convertedText[0];
                    
                    // Fixing broken Word issues 1st attempt
                    for (String nonStartable: nonStartables ) {
                        if(sConvertedText!= null && sConvertedText.startsWith(nonStartable)){
//                            run.setText(text.substring(1),0);
                        	sConvertedText = sConvertedText.substring(1);
                            if(i>0){
                                XWPFRun preRun = runs.get(i-1);
                                preRun.setText(nonStartable,-1);
                            }
                            else if(currentParagraphPosition >0){
                                List<XWPFRun> olderRuns = paragraphs.get(currentParagraphPosition).getRuns();
                                XWPFRun olderRun = olderRuns.get(olderRuns.size()-1);
                                olderRun.setText(nonStartable,-1);
                            }
                        }
                    }
                    
                    //fixing broken word issue 2nd attempt
                    for (String nonStartable: nonStartables ) {
                        if(sConvertedText!= null && sConvertedText.startsWith(nonStartable)){
//                            run.setText(text.substring(1),0);
                        	sConvertedText = sConvertedText.substring(1);
//                            System.out.println(sConvertedText.substring(1)+ " : "+run.getText(0)+nonStartable);
                            if(i>0){
                                XWPFRun preRun = runs.get(i-1);
                                preRun.setText(nonStartable,-1);
                            }
                            else if(currentParagraphPosition >0){
                            	  List<XWPFRun> olderRuns = paragraphs.get(currentParagraphPosition).getRuns();
                                  XWPFRun olderRun = olderRuns.get(olderRuns.size()-1);
                                  olderRun.setText(nonStartable,-1);
                            }
                        }
                    }
                    run.setText(sConvertedText,0);
                    run.setFontFamily(convertedText[1]);


                    if(convertedText[1].equals("SINHALA")){                                 // Setting Font Family
                        run.getCTR().setRPr(sinhalaUnicodeCTRPr);
                    }
                    else if(convertedText[1].equals("TAMIL")){
                        run.getCTR().setRPr(tamilUnicodeCTRPr);
                    }
                    i++;
                }
            }
            currentParagraphPosition++;
        }
    }
    private void convertTables(XWPFDocument docx) {
    	
    	List<XWPFTable> tables = docx.getTables();
 		for(XWPFTable table : tables) {
 			List<XWPFTableRow> rows = table.getRows();
 			for(XWPFTableRow row : rows) {
 				 List<XWPFTableCell> cells = row.getTableCells();
 				 for(XWPFTableCell cell : cells) {
 					 List<XWPFParagraph> cellParagraphs = cell.getParagraphs();
 					 for(XWPFParagraph celssParagraph : cellParagraphs) {
 						 
 						 List<XWPFRun> cellRuns = celssParagraph.getRuns();
 						 
 						 for(XWPFRun footerTableCellRun : cellRuns) {
 							 String[] convertedText = engine.toUnicode(footerTableCellRun.getText(0),footerTableCellRun.getFontFamily());
                              String sConvertedText = convertedText[0];
                              footerTableCellRun.setText(sConvertedText,0);
                              footerTableCellRun.setFontFamily(convertedText[1]);


                              if(convertedText[1].equals("SINHALA")){                                 // Setting Font Family
                             	 footerTableCellRun.getCTR().setRPr(sinhalaUnicodeCTRPr);
                              }
                              else if(convertedText[1].equals("TAMIL")){
                             	 footerTableCellRun.getCTR().setRPr(tamilUnicodeCTRPr);
                              }
 						 }
 						 
 					 }
 					 
 				 }
 				
 			}
 	
 		}
    }
    private void convertFooter(XWPFDocument docx) {
    	
    	 List<XWPFFooter> footers = docx.getFooterList();
         int sizeOfFootersArray = footers.size();
         if(sizeOfFootersArray>0) {
         	System.out.println("Converting Footers...");
         	for(XWPFFooter footer : footers) {
         		// Converting Paragraphs in Footer
         		List<XWPFParagraph> footerParagraphs = footer.getParagraphs();
         		for(XWPFParagraph footerParagraph : footerParagraphs) {
         			System.out.println("Have Footer Paragraphs");
         			List<XWPFRun> footerRuns = footerParagraph.getRuns();
         			for(XWPFRun footerRun : footerRuns) {
         				System.out.println("Have Footer Runs...");
         				 String[] convertedText = engine.toUnicode(footerRun.getText(0),footerRun.getFontFamily());
                          String sConvertedText = convertedText[0];
                          footerRun.setText(sConvertedText,0);
                          System.out.println(sConvertedText);
                          footerRun.setFontFamily(convertedText[1]);


                          if(convertedText[1].equals("SINHALA")){                                 // Setting Font Family
                         	 footerRun.getCTR().setRPr(sinhalaUnicodeCTRPr);
                          }
                          else if(convertedText[1].equals("TAMIL")){
                         	 footerRun.getCTR().setRPr(tamilUnicodeCTRPr);
                          }
         			}
         	
         		}
         	
         		// Converting tables in footer
         		List<XWPFTable> footerTables = footer.getTables();
         		for(XWPFTable footerTable : footerTables) {
         			System.out.println("Have Footer T Paragraphs");
         			List<XWPFTableRow> footerTableRows = footerTable.getRows();
         			for(XWPFTableRow footerTableRow : footerTableRows) {
         				System.out.println("Have Footer T Runs...");
         				 List<XWPFTableCell> footerTableCells = footerTableRow.getTableCells();
         				 for(XWPFTableCell footerTableCell : footerTableCells) {
         					 List<XWPFParagraph> footerTableCellParagraps = footerTableCell.getParagraphs();
         					 for(XWPFParagraph footerTableCellParagraph : footerTableCellParagraps) {
         						 
         						 List<XWPFRun> footerTableCellRuns = footerTableCellParagraph.getRuns();
         						 
         						 for(XWPFRun footerTableCellRun : footerTableCellRuns) {
         							 String[] convertedText = engine.toUnicode(footerTableCellRun.getText(0),footerTableCellRun.getFontFamily());
                                      String sConvertedText = convertedText[0];
                                      footerTableCellRun.setText(sConvertedText,0);
                                      System.out.println(sConvertedText);
                                      footerTableCellRun.setFontFamily(convertedText[1]);


                                      if(convertedText[1].equals("SINHALA")){                                 // Setting Font Family
                                     	 footerTableCellRun.getCTR().setRPr(sinhalaUnicodeCTRPr);
                                      }
                                      else if(convertedText[1].equals("TAMIL")){
                                     	 footerTableCellRun.getCTR().setRPr(tamilUnicodeCTRPr);
                                      }
         						 }
         						 
         					 }
         					 
         				 }
         				
         			}
         	
         		}
         	}
         }
    }

}


