package ConvertionEngine.LegacyToUnicodeFontMappings.Tamil;

/**
 * Created by gayan@ciperlabs.com on 4/21/18.
 */
public class Kalaham {
    
    public static String convert(String text){
    text = text;
    if(text.contains("A+")){
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
    text = text.replaceAll(",", "இ");
		/*text = text.replaceAll(",", "இ");
		text = text.replaceAll("‡", "க்ஷ");
		text = text.replaceAll("‡h", "க்ஷா");
		text = text.replaceAll("‡p", "க்ஷி");
		text = text.replaceAll("‡P", "க்ஷீ");
		text = text.replaceAll("‡¤", "க்ஷு");
		text = text.replaceAll("‡¥", "க்ஷூ");
		text = text.replaceAll("n‡", "க்ஷெ");
		text = text.replaceAll("N‡", "க்ஷே");
		text = text.replaceAll("i‡", "க்ஷை");
		text = text.replaceAll("n‡h", "க்ஷொ");
		text = text.replaceAll("N‡h", "க்ஷோ");
		text = text.replaceAll("n‡Ç", "க்ஷௌ");
		text = text.replaceAll("Œ", "க்ஷ்");*/

    text = text.replaceAll("nfs", "கௌ");
    text = text.replaceAll("Nfh", "கோ");
    // text = text.replaceAll("n¸h", "கொ");
    text = text.replaceAll("fh", "கா");
    text = text.replaceAll("fp", "கி");
    text = text.replaceAll("fP", "கீ");
    text = text.replaceAll("F", "கு");
    text = text.replaceAll("\\$", "கூ");
    text = text.replaceAll("nf", "கெ");
    text = text.replaceAll("Nf", "கே");
    text = text.replaceAll("if", "கை");
    text = text.replaceAll("nfh", "கொ");
    text = text.replaceAll("f;", "க்");
    text = text.replaceAll("f", "க");

    text = text.replaceAll("nqs", "ஙௌ");
    text = text.replaceAll("Nqh", "ஙோ");
    text = text.replaceAll("nqh", "ஙொ");
    text = text.replaceAll("qh", "ஙா");
    text = text.replaceAll("qp", "ஙி");
    text = text.replaceAll("qP", "ஙீ");
    text = text.replaceAll("™", "ஙு");
    text = text.replaceAll("q\\+", "ஙூ");
    text = text.replaceAll("nq", "ஙெ");
    text = text.replaceAll("Nq", "ஙே");
    text = text.replaceAll("iq", "ஙை");
    text = text.replaceAll("nqh", "ஙொ");
    text = text.replaceAll("q;", "ங்");
    text = text.replaceAll("q", "ங");

    text = text.replaceAll("nrs", "சௌ");
    text = text.replaceAll("Nrh", "சோ");
    text = text.replaceAll("nrh", "சொ");
    text = text.replaceAll("rh", "சா");
    text = text.replaceAll("rp", "சி");
    text = text.replaceAll("rP", "சீ");
    text = text.replaceAll("R", "சு");
    text = text.replaceAll("#", "சூ");
    text = text.replaceAll("nr", "செ");
    text = text.replaceAll("Nr", "சே");
    text = text.replaceAll("ir", "சை");
    // text = text.replaceAll("nºh", "சொ")
    text = text.replaceAll("r;", "ச்");
    text = text.replaceAll("r", "ச");

    text = text.replaceAll("n\\[s", "ஜௌ");
    text = text.replaceAll("N\\[h", "ஜோ");
    text = text.replaceAll("n\\[h", "ஜொ");
    text = text.replaceAll("\\[h", "ஜா");
    text = text.replaceAll("\\[p", "ஜி");
    text = text.replaceAll("\\[P", "ஜீ");
    text = text.replaceAll("\\[\\{p", "ஜூ"); //not sure
        text = text.replaceAll("\\[\\{", "ஜு");  // not sure
            text = text.replaceAll("n\\[", "ஜெ");
            text = text.replaceAll("N\\[", "ஜே");
            text = text.replaceAll("i\\[", "ஜை");
            text = text.replaceAll("\\[;", "ஜ்");
            text = text.replaceAll("\\[", "ஜ");
            text = text.replaceAll("nQs", "ஞௌ");
            text = text.replaceAll("NQh", "ஞோ");
            text = text.replaceAll("nQh", "ஞொ");
            text = text.replaceAll("Qh", "ஞா");
            text = text.replaceAll("Qp", "ஞி");
            text = text.replaceAll("QP", "ஞீ");
            text = text.replaceAll("Q", "ஞு"); // not sure 	
            text = text.replaceAll("œ", "ஞூ"); // not sure
            text = text.replaceAll("nQ", "ஞெ");
            text = text.replaceAll("NQ", "ஞே");
            text = text.replaceAll("iQ", "ஞை");
            text = text.replaceAll("nQh", "ஞொ");
            text = text.replaceAll("Q;", "ஞ்");
            text = text.replaceAll("Q", "ஞ");

            text = text.replaceAll("nls", "டௌ");
            text = text.replaceAll("Nlh", "டோ");
            text = text.replaceAll("nlh", "டொ");
            text = text.replaceAll("lh", "டா");
            text = text.replaceAll("b", "டி");
            text = text.replaceAll("B", "டீ");
            text = text.replaceAll("L", "டு");
            text = text.replaceAll("\\^", "டூ");
            text = text.replaceAll("nl", "டெ");
            text = text.replaceAll("Nl", "டே");
            text = text.replaceAll("il", "டை");
            text = text.replaceAll("nlh", "டொ");
            text = text.replaceAll("l;", "ட்");
            text = text.replaceAll("l", "ட");
            text = text.replaceAll("nzs", "ணௌ");
            text = text.replaceAll("Nzh", "ணோ");
            text = text.replaceAll("nzh", "ணொ");
            text = text.replaceAll("zh", "ணா");
            text = text.replaceAll("zp", "ணி");
            text = text.replaceAll("zP", "ணீ");
            text = text.replaceAll("Z}", "ணூ"); // not found
        text = text.replaceAll("Z", "ணு");
        text = text.replaceAll("nz", "ணெ");
        text = text.replaceAll("Nz", "ணே");
        text = text.replaceAll("iz", "ணை");
        text = text.replaceAll("nzh", "ணொ");
        text = text.replaceAll("z;", "ண்");
        text = text.replaceAll("z", "ண");


        text = text.replaceAll("njs", "தௌ");
        text = text.replaceAll("Njh", "தோ");
        text = text.replaceAll("njh", "தொ");
        text = text.replaceAll("jh", "தா");
        text = text.replaceAll("jp", "தி");
        text = text.replaceAll("jP", "தீ");
        text = text.replaceAll("J}", "தூ");
    text = text.replaceAll("J", "து");
    text = text.replaceAll("nj", "தெ");
    text = text.replaceAll("Nj", "தே");
    text = text.replaceAll("ij", "தை");
    text = text.replaceAll("njh", "தொ");
    text = text.replaceAll("j;", "த்");
    text = text.replaceAll("j", "த");


    text = text.replaceAll("nes", "நௌ");
    text = text.replaceAll("Neh", "நோ");
    text = text.replaceAll("neh", "நொ");
    text = text.replaceAll("eh", "நா");
    text = text.replaceAll("ep", "நி");
    text = text.replaceAll("eP", "நீ");
    text = text.replaceAll("E}", "நூ");
        text = text.replaceAll("E", "நு");
        text = text.replaceAll("ne", "நெ");
        text = text.replaceAll("Ne", "நே");
        text = text.replaceAll("ie", "நை");
        text = text.replaceAll("neh", "நொ");
        text = text.replaceAll("e;", "ந்");
        text = text.replaceAll("e", "ந");


        text = text.replaceAll("nds", "னௌ");
        text = text.replaceAll("Ndh", "னோ");
        text = text.replaceAll("ndh", "னொ");
        text = text.replaceAll("dh", "னா");
        text = text.replaceAll("dp", "னி");
        text = text.replaceAll("dP", "னீ");
        text = text.replaceAll("D\\}", "னூ");
        text = text.replaceAll("D", "னு");
        text = text.replaceAll("nd", "னெ");
        text = text.replaceAll("Nd", "னே");
        text = text.replaceAll("id", "னை");
        text = text.replaceAll("ndh", "னொ");
        text = text.replaceAll("d;", "ன்");
        text = text.replaceAll("d", "ன");

        text = text.replaceAll("ngs", "பௌ");
        text = text.replaceAll("Ngh", "போ");
        text = text.replaceAll("ngh", "பொ");
        text = text.replaceAll("gh", "பா");
        text = text.replaceAll("gp", "பி");
        text = text.replaceAll("gP", "பீ");
        text = text.replaceAll("G\\+", "பூ");
        text = text.replaceAll("g\\+", "பூ");
        text = text.replaceAll("G", "பு");
        text = text.replaceAll("ng", "பெ");
        text = text.replaceAll("Ng", "பே");
        text = text.replaceAll("ig", "பை");
        text = text.replaceAll("g;", "ப்");
        text = text.replaceAll("g", "ப");

        text = text.replaceAll("nks", "மௌ");
        text = text.replaceAll("Nkh", "மோ");
        text = text.replaceAll("nkh", "மொ");
        text = text.replaceAll("kh", "மா");
        text = text.replaceAll("kp", "மி");
        text = text.replaceAll("kP", "மீ");
        text = text.replaceAll("K", "மு");
        text = text.replaceAll("%", "மூ");
        text = text.replaceAll("nk", "மெ");
        text = text.replaceAll("Nk", "மே");
        text = text.replaceAll("ik", "மை");
        text = text.replaceAll("nkh", "மொ");
        text = text.replaceAll("k;", "ம்");
        text = text.replaceAll("k", "ம");
        text = text.replaceAll("nas", "யௌ");
        text = text.replaceAll("Nah", "யோ");
        text = text.replaceAll("nah", "யொ");
        text = text.replaceAll("ah", "யா");
        text = text.replaceAll("ap", "யி");
        text = text.replaceAll("aP", "யீ");
        text = text.replaceAll("A\\+", "யூ");
        text = text.replaceAll("a\\+", "யூ");
        text = text.replaceAll("A", "யு");
        text = text.replaceAll("na", "யெ");
        text = text.replaceAll("Na", "யே");
        text = text.replaceAll("ia", "யை");

        text = text.replaceAll("a;", "ய்");
        text = text.replaceAll("a", "ய");

        text = text.replaceAll("nus", "ரௌ");
        text = text.replaceAll("Nuh", "ரோ");
        text = text.replaceAll("nuh", "ரொ");
        text = text.replaceAll("uh", "ரா");
        text = text.replaceAll("up", "ரி");
        text = text.replaceAll("uP", "ரீ");
        text = text.replaceAll("U", "ரு");
        text = text.replaceAll("&", "ரூ");
        text = text.replaceAll("nu", "ரெ");
        text = text.replaceAll("Nu", "ரே");
        text = text.replaceAll("iu", "ரை");
        text = text.replaceAll("u;", "ர்");
        text = text.replaceAll("u", "ர");

        text = text.replaceAll("nys", "லௌ");
        text = text.replaceAll("Nyh", "லோ");
        text = text.replaceAll("nyh", "லொ");
        text = text.replaceAll("yh", "லா");
        text = text.replaceAll("yp", "லி");
        text = text.replaceAll("yP", "லீ");
        text = text.replaceAll("Y}", "லூ");
        text = text.replaceAll("Y", "லு");
        text = text.replaceAll("ny", "லெ");
        text = text.replaceAll("Ny", "லே");
        text = text.replaceAll("iy", "லை");
        text = text.replaceAll("nyh", "லொ");
        text = text.replaceAll("y;", "ல்");
        text = text.replaceAll("y", "ல");

        text = text.replaceAll("nss", "ளௌ");
        text = text.replaceAll("Nsh", "ளோ");
        text = text.replaceAll("nsh", "ளொ");
        text = text.replaceAll("sh", "ளா");
        text = text.replaceAll("sp", "ளி");
        text = text.replaceAll("sP", "ளீ");
        text = text.replaceAll("S", "ளு");
        text = text.replaceAll("é", "ளூ");  //not found
        text = text.replaceAll("ns", "ளெ");
        text = text.replaceAll("Ns", "ளே");
        text = text.replaceAll("is", "ளை");

        text = text.replaceAll("s;", "ள்");
        text = text.replaceAll("s", "ள");
        text = text.replaceAll("nts", "வௌ");
        text = text.replaceAll("Nth", "வோ");
        text = text.replaceAll("nth", "வொ");
        text = text.replaceAll("th", "வா");
        text = text.replaceAll("tp", "வி");
        text = text.replaceAll("tP", "வீ");
        text = text.replaceAll("T\\+", "வூ");
        text = text.replaceAll("t\\+", "வூ");
        text = text.replaceAll("T", "வு");
        text = text.replaceAll("nt", "வெ");
        text = text.replaceAll("Nt", "வே");
        text = text.replaceAll("it", "வை");
        text = text.replaceAll("nth", "வொ");
        text = text.replaceAll("t;", "வ்");
        text = text.replaceAll("t", "வ");


        text = text.replaceAll("nos", "ழௌ");
        text = text.replaceAll("Noh", "ழோ");
        text = text.replaceAll("noh", "ழொ");
        text = text.replaceAll("oh", "ழா");
        text = text.replaceAll("op", "ழி");
        text = text.replaceAll("oP", "ழீ");
        text = text.replaceAll("O", "ழு");
        text = text.replaceAll("\\*", "ழூ");
        text = text.replaceAll("no", "ழெ");
        text = text.replaceAll("No", "ழே");
        text = text.replaceAll("io", "ழை");
        text = text.replaceAll("noh", "ழொ");
        text = text.replaceAll("o;", "ழ்");
        text = text.replaceAll("o", "ழ");

        text = text.replaceAll("nws", "றௌ");
        text = text.replaceAll("Nwh", "றோ");
        text = text.replaceAll("nwh", "றொ");
        text = text.replaceAll("wh", "றா");
        text = text.replaceAll("wp", "றி");
        text = text.replaceAll("wP", "றீ");
        text = text.replaceAll("W\\}", "றூ");
        text = text.replaceAll("W", "று");
        text = text.replaceAll("nw", "றெ");
        text = text.replaceAll("Nw", "றே");
        text = text.replaceAll("iw", "றை");
        text = text.replaceAll("nwh", "றொ");
        text = text.replaceAll("w;", "ற்");
        text = text.replaceAll("w", "ற");

        text = text.replaceAll("n`s", "ஹௌ");
        text = text.replaceAll("N`h", "ஹோ");
        text = text.replaceAll("n`h", "ஹொ");
        text = text.replaceAll("`h", "ஹா");
        text = text.replaceAll("`p", "ஹி");
        text = text.replaceAll("`P", "ஹீ");
        text = text.replaceAll("n`", "ஹெ");
        text = text.replaceAll("N`", "ஹே");
        text = text.replaceAll("i`", "ஹை");
        text = text.replaceAll("n`h", "ஹொ");
        text = text.replaceAll("`;", "ஹ்");
        text = text.replaceAll("`", "ஹ");


        text = text.replaceAll("nbs", "ஷௌ");
        text = text.replaceAll("Nbh", "ஷோ");
        text = text.replaceAll("nbh", "ஷொ");
        text = text.replaceAll("bh", "ஷா");
        text = text.replaceAll("\\\\h", "ஷா");
        text = text.replaceAll("bp", "ஷி");
        text = text.replaceAll("bP", "ஷீ");
        text = text.replaceAll("nb", "ஷெ");
        text = text.replaceAll("Nb", "ஷே");
        text = text.replaceAll("ib", "ஷை");
        text = text.replaceAll("nbh", "ஷொ");
        text = text.replaceAll("b;", "ஷ்");
        text = text.replaceAll("b", "ஷ");




        text = text.replaceAll("n]s", "ஸௌ");
        text = text.replaceAll("N]h", "ஸோ");
        text = text.replaceAll("n]h", "ஸொ");
        text = text.replaceAll("]h", "ஸா");
        text = text.replaceAll("]p", "ஸி");
        text = text.replaceAll("]P", "ஸீ");
        text = text.replaceAll("n]", "ஸெ");
        text = text.replaceAll("N]", "ஸே");
        text = text.replaceAll("i]", "ஸை");
        text = text.replaceAll("n]h", "ஸொ");
        text = text.replaceAll("];", "ஸ்");
        text = text.replaceAll("]", "ஸ");




        text = text.replaceAll("m", "அ");
        text = text.replaceAll("M", "ஆ");
        text = text.replaceAll("<", "ஈ");
        text = text.replaceAll("c", "உ");
        text = text.replaceAll("C", "ஊ");
        text = text.replaceAll("v", "எ");
        text = text.replaceAll("V", "ஏ");
        text = text.replaceAll("I", "ஐ");
        text = text.replaceAll("x", "ஒ");
        text = text.replaceAll("X", "ஓ");
        text = text.replaceAll("xh", "ஔ");



        text = text.replaceAll("\\/", "ஃ");

        text = text.replaceAll("f", "௧");
        text = text.replaceAll("c", "௨");

        text = text.replaceAll("", "௩");    // this part not sure 
        text = text.replaceAll("", "௪");
        text = text.replaceAll("", "௫");
        text = text.replaceAll("", "௰");
        text = text.replaceAll("", "௱");
        text = text.replaceAll("Ÿ", "௲");
        text = text.replaceAll("", "௯");
        text = text.replaceAll("", "௭");
        text = text.replaceAll("", "௮");
        text = text.replaceAll("", "௬");
        text = text.replaceAll("‚", "ஸ்ரீ");

        text = text.replaceAll("h", "ா");					// if ா came in a separate tag.
        text =text.replaceAll(">", ",");

        text = text.replaceAll("h;","ர்");
        text = text.replaceAll("H", "ர்");				//@Gayan don't know why but doesn't get replaceAlld. 
        text = text.replaceAll("sp", "ளி");
        text = text.replaceAll("hp", "ரி");
        text = text.replaceAll("hP", "ரீ");
        text = text.replaceAll("uP", "ரீ");
        text = text.replaceAll("hh","ரா");
        text = text.replaceAll("u;", "ர்");
        text = text.replaceAll(";", "்");					//@Gayan don't know why but doesn't get replaceAlld.
        text = text.replaceAll("h", "ா");				//@Gayan don't know why but doesn't get replaceAlld. 
        text = text.replaceAll("p", "ி");
        text = text.replaceAll("P", "ீ");
        text = text.replaceAll("N", "ே");
        text = text.replaceAll("n", "ெ");
        text = text.replaceAll("}","ா");
        text = text.replaceAll("i","ை");
        return text;
        }
    public static boolean lastCharError(String text){
        if(text.endsWith("n")){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean lastCharError2(String text){
        if(text.endsWith("N")){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean lastCharError3(String text){
        if(text.endsWith("i")){
            return true;
        }
        else{
            return false;
        }
    }
    public static String fixLastCharError(String text){
        return "n"+text;
    }
    public static String fixLastCharError2(String text){
        return "N"+text;
    }
    public static String fixLastCharError3(String text){
        return "i"+text;
    }

}
