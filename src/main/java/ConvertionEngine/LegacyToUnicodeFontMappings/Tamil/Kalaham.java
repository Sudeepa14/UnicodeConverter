package ConvertionEngine.LegacyToUnicodeFontMappings.Tamil;

/**
 * Created by gayan@ciperlabs.com on 4/21/18.
 */
public class Kalaham {
    
    public static String convert(String text){
    text = text;

    text = text.replace(",", "இ");
		/*text = text.replace(",", "இ");
		text = text.replace("‡", "க்ஷ");
		text = text.replace("‡h", "க்ஷா");
		text = text.replace("‡p", "க்ஷி");
		text = text.replace("‡P", "க்ஷீ");
		text = text.replace("‡¤", "க்ஷு");
		text = text.replace("‡¥", "க்ஷூ");
		text = text.replace("n‡", "க்ஷெ");
		text = text.replace("N‡", "க்ஷே");
		text = text.replace("i‡", "க்ஷை");
		text = text.replace("n‡h", "க்ஷொ");
		text = text.replace("N‡h", "க்ஷோ");
		text = text.replace("n‡Ç", "க்ஷௌ");
		text = text.replace("Œ", "க்ஷ்");*/

    text = text.replace("nfs", "கௌ");
    text = text.replace("Nfh", "கோ");
    // text = text.replace("n¸h", "கொ");
    text = text.replace("fh", "கா");
    text = text.replace("fp", "கி");
    text = text.replace("fP", "கீ");
    text = text.replace("F", "கு");
    text = text.replace("\\$", "கூ");
    text = text.replace("nf", "கெ");
    text = text.replace("Nf", "கே");
    text = text.replace("if", "கை");
    text = text.replace("nfh", "கொ");
    text = text.replace("f;", "க்");
    text = text.replace("f", "க");

    text = text.replace("nqs", "ஙௌ");
    text = text.replace("Nqh", "ஙோ");
    text = text.replace("nqh", "ஙொ");
    text = text.replace("qh", "ஙா");
    text = text.replace("qp", "ஙி");
    text = text.replace("qP", "ஙீ");
    text = text.replace("™", "ஙு");
    text = text.replace("q\\+", "ஙூ");
    text = text.replace("nq", "ஙெ");
    text = text.replace("Nq", "ஙே");
    text = text.replace("iq", "ஙை");
    text = text.replace("nqh", "ஙொ");
    text = text.replace("q;", "ங்");
    text = text.replace("q", "ங");

    text = text.replace("nrs", "சௌ");
    text = text.replace("Nrh", "சோ");
    text = text.replace("nrh", "சொ");
    text = text.replace("rh", "சா");
    text = text.replace("rp", "சி");
    text = text.replace("rP", "சீ");
    text = text.replace("R", "சு");
    text = text.replace("#", "சூ");
    text = text.replace("nr", "செ");
    text = text.replace("Nr", "சே");
    text = text.replace("ir", "சை");
    // text = text.replace("nºh", "சொ")
    text = text.replace("r;", "ச்");
    text = text.replace("r", "ச");

    text = text.replace("n\\[s", "ஜௌ");
    text = text.replace("N\\[h", "ஜோ");
    text = text.replace("n\\[h", "ஜொ");
    text = text.replace("\\[h", "ஜா");
    text = text.replace("\\[p", "ஜி");
    text = text.replace("\\[P", "ஜீ");
    text = text.replace("\\[{p", "ஜூ"); //not sure
        text = text.replace("\\[{", "ஜு");  // not sure
            text = text.replace("n\\[", "ஜெ");
            text = text.replace("N\\[", "ஜே");
            text = text.replace("i\\[", "ஜை");
            text = text.replace("n\\[h", "ஜொ");
            text = text.replace("\\[;", "ஜ்");
            text = text.replace("\\[", "ஜ");

            text = text.replace("nQs", "ஞௌ");
            text = text.replace("NQh", "ஞோ");
            text = text.replace("nQh", "ஞொ");
            text = text.replace("Qh", "ஞா");
            text = text.replace("Qp", "ஞி");
            text = text.replace("QP", "ஞீ");
            text = text.replace("Q", "ஞு"); // not sure 	
            text = text.replace("œ", "ஞூ"); // not sure
            text = text.replace("nQ", "ஞெ");
            text = text.replace("NQ", "ஞே");
            text = text.replace("iQ", "ஞை");
            text = text.replace("nQh", "ஞொ");
            text = text.replace("Q;", "ஞ்");
            text = text.replace("Q", "ஞ");

            text = text.replace("nls", "டௌ");
            text = text.replace("Nlh", "டோ");
            text = text.replace("nlh", "டொ");
            text = text.replace("lh", "டா");
            text = text.replace("B", "டி");
            text = text.replace("b", "டீ");
            text = text.replace("L", "டு");
            text = text.replace("^", "டூ");
            text = text.replace("nl", "டெ");
            text = text.replace("Nl", "டே");
            text = text.replace("il", "டை");
            text = text.replace("nlh", "டொ");
            text = text.replace("l;", "ட்");
            text = text.replace("l", "ட");
            text = text.replace("nzs", "ணௌ");
            text = text.replace("Nzh", "ணோ");
            text = text.replace("nzh", "ணொ");
            text = text.replace("zh", "ணா");
            text = text.replace("zp", "ணி");
            text = text.replace("zP", "ணீ");
            text = text.replace("Z\\}", "ணூ"); // not found
        text = text.replace("Z", "ணு");
        text = text.replace("nz", "ணெ");
        text = text.replace("Nz", "ணே");
        text = text.replace("iz", "ணை");
        text = text.replace("nzh", "ணொ");
        text = text.replace("z;", "ண்");
        text = text.replace("z", "ண");


        text = text.replace("njs", "தௌ");
        text = text.replace("Njh", "தோ");
        text = text.replace("njh", "தொ");
        text = text.replace("jh", "தா");
        text = text.replace("jp", "தி");
        text = text.replace("jP", "தீ");
        text = text.replace("J\\}", "தூ");
    text = text.replace("J", "து");
    text = text.replace("nj", "தெ");
    text = text.replace("Nj", "தே");
    text = text.replace("ij", "தை");
    text = text.replace("njh", "தொ");
    text = text.replace("j;", "த்");
    text = text.replace("j", "த");


    text = text.replace("nes", "நௌ");
    text = text.replace("Neh", "நோ");
    text = text.replace("neh", "நொ");
    text = text.replace("eh", "நா");
    text = text.replace("ep", "நி");
    text = text.replace("eP", "நீ");
    text = text.replace("E\\}", "நூ");
        text = text.replace("E", "நு");
        text = text.replace("ne", "நெ");
        text = text.replace("Ne", "நே");
        text = text.replace("ie", "நை");
        text = text.replace("neh", "நொ");
        text = text.replace("e;", "ந்");
        text = text.replace("e", "ந");


        text = text.replace("nds", "னௌ");
        text = text.replace("Ndh", "னோ");
        text = text.replace("ndh", "னொ");
        text = text.replace("dh", "னா");
        text = text.replace("dp", "னி");
        text = text.replace("dP", "னீ");
        text = text.replace("D\\}", "னூ");
        text = text.replace("D", "னு");
        text = text.replace("nd", "னெ");
        text = text.replace("Nd", "னே");
        text = text.replace("id", "னை");
        text = text.replace("ndh", "னொ");
        text = text.replace("d;", "ன்");
        text = text.replace("d", "ன");

        text = text.replace("ngs", "பௌ");
        text = text.replace("Ngh", "போ");
        text = text.replace("ngh", "பொ");
        text = text.replace("gh", "பா");
        text = text.replace("gp", "பி");
        text = text.replace("gP", "பீ");
        text = text.replace("G\\+", "பூ");
        text = text.replace("G", "பு");
        text = text.replace("ng", "பெ");
        text = text.replace("Ng", "பே");
        text = text.replace("ig", "பை");
        text = text.replace("ngh", "பொ");
        text = text.replace("g;", "ப்");
        text = text.replace("g", "ப");

        text = text.replace("nks", "மௌ");
        text = text.replace("Nkh", "மோ");
        text = text.replace("nkh", "மொ");
        text = text.replace("kh", "மா");
        text = text.replace("kp", "மி");
        text = text.replace("kP", "மீ");
        text = text.replace("K", "மு");
        text = text.replace("%", "மூ");
        text = text.replace("nk", "மெ");
        text = text.replace("Nk", "மே");
        text = text.replace("ik", "மை");
        text = text.replace("nkh", "மொ");
        text = text.replace("k;", "ம்");
        text = text.replace("k", "ம");
        text = text.replace("nas", "யௌ");
        text = text.replace("Nah", "யோ");
        text = text.replace("nah", "யொ");
        text = text.replace("ah", "யா");
        text = text.replace("ap", "யி");
        text = text.replace("aP", "யீ");
        text = text.replace("A", "யு");
        text = text.replace("A+", "யூ");
        text = text.replace("na", "யெ");
        text = text.replace("Na", "யே");
        text = text.replace("ia", "யை");

        text = text.replace("a;", "ய்");
        text = text.replace("a", "ய");

        text = text.replace("nus", "ரௌ");
        text = text.replace("Nuh", "ரோ");
        text = text.replace("nuh", "ரொ");
        text = text.replace("uh", "ரா");
        text = text.replace("up", "ரி");
        text = text.replace("uP", "ரீ");
        text = text.replace("U", "ரு");
        text = text.replace("&", "ரூ");
        text = text.replace("nu", "ரெ");
        text = text.replace("Nu", "ரே");
        text = text.replace("iu", "ரை");
        text = text.replace("u;", "ர்");
        text = text.replace("u", "ர");

        text = text.replace("nys", "லௌ");
        text = text.replace("Nyh", "லோ");
        text = text.replace("nyh", "லொ");
        text = text.replace("yh", "லா");
        text = text.replace("yp", "லி");
        text = text.replace("yP", "லீ");
        text = text.replace("Y", "லு");
        text = text.replace("Y\\}", "லூ");
        text = text.replace("ny", "லெ");
        text = text.replace("Ny", "லே");
        text = text.replace("iy", "லை");
        text = text.replace("nyh", "லொ");
        text = text.replace("y;", "ல்");
        text = text.replace("y", "ல");

        text = text.replace("nss", "ளௌ");
        text = text.replace("Nsh", "ளோ");
        text = text.replace("nsh", "ளொ");
        text = text.replace("sh", "ளா");
        text = text.replace("sp", "ளி");
        text = text.replace("sP", "ளீ");
        text = text.replace("S", "ளு");
        text = text.replace("é", "ளூ");  //not found
        text = text.replace("ns", "ளெ");
        text = text.replace("Ns", "ளே");
        text = text.replace("is", "ளை");

        text = text.replace("s;", "ள்");
        text = text.replace("s", "ள");
        text = text.replace("nts", "வௌ");
        text = text.replace("Nth", "வோ");
        text = text.replace("nth", "வொ");
        text = text.replace("th", "வா");
        text = text.replace("tp", "வி");
        text = text.replace("tP", "வீ");
        text = text.replace("T", "வு");
        text = text.replace("T\\+", "வூ");
        text = text.replace("nt", "வெ");
        text = text.replace("Nt", "வே");
        text = text.replace("it", "வை");
        text = text.replace("nth", "வொ");
        text = text.replace("t;", "வ்");
        text = text.replace("t", "வ");


        text = text.replace("nos", "ழௌ");
        text = text.replace("Noh", "ழோ");
        text = text.replace("noh", "ழொ");
        text = text.replace("oh", "ழா");
        text = text.replace("op", "ழி");
        text = text.replace("oP", "ழீ");
        text = text.replace("O", "ழு");
        text = text.replace("\\*", "ழூ");
        text = text.replace("no", "ழெ");
        text = text.replace("No", "ழே");
        text = text.replace("io", "ழை");
        text = text.replace("noh", "ழொ");
        text = text.replace("o;", "ழ்");
        text = text.replace("o", "ழ");

        text = text.replace("nws", "றௌ");
        text = text.replace("Nwh", "றோ");
        text = text.replace("nwh", "றொ");
        text = text.replace("wh", "றா");
        text = text.replace("wp", "றி");
        text = text.replace("wP", "றீ");
        text = text.replace("W\\}", "றூ");
        text = text.replace("W", "று");
        text = text.replace("nw", "றெ");
        text = text.replace("Nw", "றே");
        text = text.replace("iw", "றை");
        text = text.replace("nwh", "றொ");
        text = text.replace("w;", "ற்");
        text = text.replace("w", "ற");

        text = text.replace("n`s", "ஹௌ");
        text = text.replace("N`h", "ஹோ");
        text = text.replace("n`h", "ஹொ");
        text = text.replace("`h", "ஹா");
        text = text.replace("`p", "ஹி");
        text = text.replace("`P", "ஹீ");
        text = text.replace("n`", "ஹெ");
        text = text.replace("N`", "ஹே");
        text = text.replace("i`", "ஹை");
        text = text.replace("n`h", "ஹொ");
        text = text.replace("`;", "ஹ்");
        text = text.replace("`", "ஹ");


        text = text.replace("nbs", "ஷௌ");
        text = text.replace("Nbh", "ஷோ");
        text = text.replace("nbh", "ஷொ");
        text = text.replace("bh", "ஷா");
        text = text.replace("bp", "ஷி");
        text = text.replace("bP", "ஷீ");
        text = text.replace("nb", "ஷெ");
        text = text.replace("Nb", "ஷே");
        text = text.replace("ib", "ஷை");
        text = text.replace("nbh", "ஷொ");
        text = text.replace("b;", "ஷ்");
        text = text.replace("b", "ஷ");


        text = text.replace("n]s", "ஸௌ");
        text = text.replace("N]h", "ஸோ");
        text = text.replace("n]h", "ஸொ");
        text = text.replace("]h", "ஸா");
        text = text.replace("]p", "ஸி");
        text = text.replace("]P", "ஸீ");
        text = text.replace("n]", "ஸெ");
        text = text.replace("N]", "ஸே");
        text = text.replace("i]", "ஸை");
        text = text.replace("n]h", "ஸொ");
        text = text.replace("];", "ஸ்");
        text = text.replace("]", "ஸ");




        text = text.replace("m", "அ");
        text = text.replace("M", "ஆ");
        text = text.replace("<", "ஈ");
        text = text.replace("c", "உ");
        text = text.replace("C", "ஊ");
        text = text.replace("v", "எ");
        text = text.replace("V", "ஏ");
        text = text.replace("I", "ஐ");
        text = text.replace("x", "ஒ");
        text = text.replace("X", "ஓ");
        text = text.replace("xh", "ஔ");



        text = text.replace("\\/", "ஃ");

        text = text.replace("f", "௧");
        text = text.replace("c", "௨");

        text = text.replace("", "௩");    // this part not sure 
        text = text.replace("", "௪");
        text = text.replace("", "௫");
        text = text.replace("", "௰");
        text = text.replace("", "௱");
        text = text.replace("Ÿ", "௲");
        text = text.replace("", "௯");
        text = text.replace("", "௭");
        text = text.replace("", "௮");
        text = text.replace("", "௬");
        text = text.replace("‚", "ஸ்ரீ");

        text = text.replace("h", "ா");					// if ா came in a separate tag.
        text =text.replace(">", ",");

        text = text.replace("h;","ர்");
        text = text.replace("H", "ர்");				//@Gayan don't know why but doesn't get replaced. 
        text = text.replace("sp", "ளி");
        text = text.replace("hp", "ரி");
        text = text.replace("hP", "ரீ");
        text = text.replace("uP", "ரீ");
        text = text.replace("hh","ரா");
        text = text.replace("u;", "ர்");
        text = text.replace(";", "்");					//@Gayan don't know why but doesn't get replaced.
        text = text.replace("h", "ா");				//@Gayan don't know why but doesn't get replaced. 
        text = text.replace("p", "ி");
        text = text.replace("P", "ீ");
        text = text.replace("N", "ே");
        text = text.replace("n", "ெ");

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
    public static String fixLastCharError(String text){
        return "n"+text;
    }
    public static String fixLastCharError2(String text){
        return "N"+text;
    }
}
