package ConvertionEngine;

import ConvertionEngine.LegacyToUnicodeFontMappings.Symbol;
import ConvertionEngine.LegacyToUnicodeFontMappings.Sinhala.*;
import ConvertionEngine.LegacyToUnicodeFontMappings.Tamil.Bamini;
import ConvertionEngine.LegacyToUnicodeFontMappings.Tamil.Kalaham;
import ConvertionEngine.LegacyToUnicodeFontMappings.Tamil.Nallur;

/**
 * Created by gayan@ciperlabs.com on 4/21/18.
 */
public class Engine {
    private static String sinhalaUnicodeFont = "SINHALA";
    private static String tamilUnicodeFont = "TAMIL";
    private static String lastFont = "";
    private static boolean sinhalaLastCharError;
    private static boolean tamilLastCharError1;
    private static boolean tamilLastCharError2;



    public Engine(){
        lastFont = "";
        sinhalaLastCharError = false;
        tamilLastCharError1 = false;
        tamilLastCharError2 = false;

    }
    public String[] toUnicode(String text, String font){
        String unicodeText = text;
        String newFont = null;
        if(font == null){
            font = "";
        }
        else {
            lastFont=font;
        }
        if (text == null){

            return new String[]{text,sinhalaUnicodeFont};
        }
        if(lastFont.equals("LTRL") && font.equals("")){
            font="LTRL";
            lastFont=font;
            //System.out.println("LTRL : "+text);

        }
        else if(lastFont.equals("LTRL") && font.equalsIgnoreCase("Arial")){
            font="LTRL";
            lastFont="LTRL";
            //System.out.println("Arial : "+text);

        }

        /*
            Starts font mappings
         */
        if (font.equals("Thibus16STru")|| font.equals("Thibus15STru") || font.equals("Thibus02S")
                || font.equals("Thibus02STru")|| font.equals("Thibus05STru")){

            tamilLastCharError1 = false;
            tamilLastCharError2 = false;
            if(Thibus.lastCharError(text)){
                sinhalaLastCharError = true;
                text = text.substring(0,text.length()-1);
            }
            if(sinhalaLastCharError){
                sinhalaLastCharError = false;
                text = Thibus.fixLastCharError(text);
            }

            unicodeText = Thibus.convert(text);

            return new String[]{unicodeText,sinhalaUnicodeFont};

        }
        else if (font.equals("FMAbhaya")|| font.equals("FMAbabld") ){

            tamilLastCharError1 = false;
            tamilLastCharError2 = false;
            if(FMAbhaya.lastCharError(text)){
                sinhalaLastCharError = true;
                text = text.substring(0,text.length()-1);
            }
            if(sinhalaLastCharError){
                sinhalaLastCharError = false;
                text = FMAbhaya.fixLastCharError(text);
            }

            unicodeText = FMAbhaya.convert(text);

            return new String[]{unicodeText,sinhalaUnicodeFont};

        }
        else if (font.equals("DL-Manel-bold")|| font.equals("DL-Manel") || font.equals("DL-Manel-bold.")
                ){

            tamilLastCharError1 = false;
            tamilLastCharError2 = false;
            if(DLManel.lastCharError(text)){
                sinhalaLastCharError = true;
                text = text.substring(0,text.length()-1);
            }
            if(sinhalaLastCharError){
                sinhalaLastCharError = false;
                text = DLManel.fixLastCharError(text);
            }

            unicodeText = DLManel.convert(text);

            return new String[]{unicodeText,sinhalaUnicodeFont};

        }
        else if (font.equals("mutu kata")){

            tamilLastCharError1 = false;
            tamilLastCharError2 = false;
            if(MutuKata.lastCharError(text)){
                sinhalaLastCharError = true;
                text = text.substring(0,text.length()-1);
            }
            if(sinhalaLastCharError){
                sinhalaLastCharError = false;
                text = MutuKata.fixLastCharError(text);
            }

            unicodeText = MutuKata.convert(text);

            return new String[]{unicodeText,sinhalaUnicodeFont};

        }
        else if (font.equals("Sinhala INetFont")){

            tamilLastCharError1 = false;
            tamilLastCharError2 = false;
            if(SinhalaINet.lastCharError(text)){
                sinhalaLastCharError = true;
                text = text.substring(0,text.length()-1);
            }
            if(sinhalaLastCharError){
                sinhalaLastCharError = false;
                text = SinhalaINet.fixLastCharError(text);
            }

            unicodeText = SinhalaINet.convert(text);

            return new String[]{unicodeText,sinhalaUnicodeFont};

        }
        else if(font.equals("LTRL")|| font.equals("Arial")){                // Checking arial is not correct but not incorrect either

            unicodeText = LTRL.convert(text);
            return new String[]{unicodeText,sinhalaUnicodeFont};
        }
        else if (font.equals("T06ThibusTru")|| font.equals("T02Thibus") || font.equals("T04ThibusTru")
                ){

            sinhalaLastCharError = false;
            if(ConvertionEngine.LegacyToUnicodeFontMappings.Tamil.Thibus.lastCharError(text)){
                text = text.substring(0,text.length()-1);
                tamilLastCharError1=true;
            }
            else if(ConvertionEngine.LegacyToUnicodeFontMappings.Tamil.Thibus.lastCharError2(text)){
                text = text.substring(0,text.length()-1);
                tamilLastCharError2=true;
            }
            if(tamilLastCharError1){
                tamilLastCharError1 = false;
                text = ConvertionEngine.LegacyToUnicodeFontMappings.Tamil.Thibus.fixLastCharError(text);
            }
            else if(tamilLastCharError2){
                tamilLastCharError2 = false;
                text = ConvertionEngine.LegacyToUnicodeFontMappings.Tamil.Thibus.fixLastCharError2(text);
            }

            unicodeText = ConvertionEngine.LegacyToUnicodeFontMappings.Tamil.Thibus.convert(text);

            return new String[]{unicodeText,tamilUnicodeFont};

        }
        else if (font.equals("Kalaham")){

            sinhalaLastCharError = false;
            if(Kalaham.lastCharError(text)){
                text = text.substring(0,text.length()-1);
                tamilLastCharError1=true;
            }
            else if(Kalaham.lastCharError2(text)){
                text = text.substring(0,text.length()-1);
                tamilLastCharError2=true;
            }
            if(tamilLastCharError1){
                tamilLastCharError1 = false;
                text = Kalaham.fixLastCharError(text);
            }
            else if(tamilLastCharError2){
                tamilLastCharError2 = false;
                text = Kalaham.fixLastCharError2(text);
            }

            unicodeText = Kalaham.convert(text);

            return new String[]{unicodeText,tamilUnicodeFont};

        }
        else if (font.equals("Nallur")){

            sinhalaLastCharError = false;
            if(Nallur.lastCharError(text)){
                text = text.substring(0,text.length()-1);
                tamilLastCharError1=true;
            }
            else if(Nallur.lastCharError2(text)){
                text = text.substring(0,text.length()-1);
                tamilLastCharError2=true;
            }
            if(tamilLastCharError1){
                tamilLastCharError1 = false;
                text = Nallur.fixLastCharError(text);
            }
            else if(tamilLastCharError2){
                tamilLastCharError2 = false;
                text = Nallur.fixLastCharError2(text);
            }

            unicodeText = Nallur.convert(text);

            return new String[]{unicodeText,tamilUnicodeFont};

        }
        else if (font.equals("Baamini") || font.equals("Bamini")){

            sinhalaLastCharError = false;
            if(Bamini.lastCharError(text)){
                text = text.substring(0,text.length()-1);
                tamilLastCharError1=true;
            }
            else if(Bamini.lastCharError2(text)){
                text = text.substring(0,text.length()-1);
                tamilLastCharError2=true;
            }
            if(tamilLastCharError1){
                tamilLastCharError1 = false;
                text = Bamini.fixLastCharError(text);
            }
            else if(tamilLastCharError2){
                tamilLastCharError2 = false;
                text = Bamini.fixLastCharError2(text);
            }

            unicodeText = Bamini.convert(text);

            return new String[]{unicodeText,tamilUnicodeFont};

        }
        else if(font.equals("Symbol")) {
        	
        	unicodeText = Symbol.convert(text);
        	return new String[]{unicodeText,sinhalaUnicodeFont};
        }

        else if(font.equals("")){					// Just in case for any left Overs - This should be removed from production
        	unicodeText = LTRL.convert(text);
            return new String[]{unicodeText,sinhalaUnicodeFont};
       } 
        else {
        	return new String[] {text,font};
        }
    }
}
