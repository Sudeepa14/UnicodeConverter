package ConvertionEngine.LegacyToUnicodeFontMappings.Tamil;

/**
 * Created by gayan@ciperlabs.com on 4/21/18.
 */
public class Nallur {
    
    public static String convert(String text){
        text= text.replaceAll("nQs", "ஞௌ");
        text = text.replaceAll("NQh", "ஞோ");
        text = text.replaceAll("nQh", "ஞொ");
        text= text.replaceAll("iQ", "ஞை");
        text = text.replaceAll("NQ", "ஞே");
        text = text.replaceAll("nQ", "ஞெ");
        text = text.replaceAll("njuu", "ஞூ");      // not found
        text = text.replaceAll("Q\\}", "ஞு");      //not found
        text = text.replaceAll("QP", "ஞீ");
        text = text.replaceAll("Qp", "ஞி");
        text = text.replaceAll("Qh", "ஞா");    
        text = text.replaceAll("Q;", "ஞ்");
        text = text.replaceAll("Q", "ஞ");

//Q; Q Qh Qp  QP       nQ NQ iQ nQh NQh nQs
        text= text.replaceAll("nqs", "ஙௌ");
        text = text.replaceAll("Nqh", "ஙோ");
        text = text.replaceAll("nqh", "ஙொ");
        text= text.replaceAll("iq", "ஙை");
        text = text.replaceAll("Nq", "ஙே");
        text = text.replaceAll("nq", "ஙெ");
        text = text.replaceAll("q\\}", "ஙூ");      //not found
        text = text.replaceAll("Q\\}", "ஙு");      //not found
        text = text.replaceAll("qP", "ஙீ");
        text = text.replaceAll("qp", "ஙி");
        text = text.replaceAll("qh", "ஙா");
        text = text.replaceAll("q;", "ங்");
        text = text.replaceAll("q", "ங");


        text = text.replaceAll("n\\s", "ஷௌ");
        text = text.replaceAll("i\\\\", "ஷை");
        text = text.replaceAll("N\\\\", "ஷே");
        text = text.replaceAll("N\\\\h", "ஷோ");
        text = text.replaceAll("\\\\h", "ஷா");
        text = text.replaceAll("\\\\_", "ஷூ");
        text = text.replaceAll("\\\\\\{", "ஷீ");
        text = text.replaceAll("\\\\p", "ஷி");
        text = text.replaceAll("\\\\P", "ஷீ");
        text = text.replaceAll("\\\\h", "ஷா");
        text = text.replaceAll("n\\\\", "ஷெ");
        text = text.replaceAll("n\\\\h", "ஷொ");
        text = text.replaceAll("\\\\P", "ஷு");
        text = text.replaceAll("\\\\;", "ஷ்");
        text = text.replaceAll("\\\\", "ஷ");


        text = text.replaceAll(" nes", " நௌ");
        text = text.replaceAll("ie", " நை");
        text = text.replaceAll("Ne", " நே");
        text = text.replaceAll("Neh", " நோ");
        text = text.replaceAll("eh", " நா");
        text = text.replaceAll("eP", " நீ");
        text = text.replaceAll("ep", " நி");
        text = text.replaceAll("ne", " நெ");
        text = text.replaceAll("Ne", " நே");
        text = text.replaceAll("neh", " நொ");
        text = text.replaceAll("E", " நு");
        text = text.replaceAll("E\\}", " நூ");
        text = text.replaceAll("e;", " ந்");
        text = text.replaceAll("e", " ந");


        text = text.replaceAll("njs", "தௌ");
        text = text.replaceAll("ij", "தை");
        text = text.replaceAll("Nj", "தே");
        text = text.replaceAll("Njh", "தோ");
        text = text.replaceAll("jh", "தா");
        text = text.replaceAll("jP", "தீ");
        text = text.replaceAll("jp", "தி");
        text = text.replaceAll("nj", "தெ");
        text = text.replaceAll("Nj", "தே");
        text = text.replaceAll("njh", "தொ");
        text = text.replaceAll("Njh", "தோ");
        text = text.replaceAll("J", "து");
        text = text.replaceAll("J\\}", "தூ");
        text = text.replaceAll("j;", "த்");
        text = text.replaceAll("j", "த");


        text = text.replaceAll("nrs", "சௌ");
        text = text.replaceAll("ir", "சை");
        text = text.replaceAll("Nr", "சே");
        text = text.replaceAll("Nrh", "சோ");
        text = text.replaceAll("rh", "சா");
        text = text.replaceAll("rP", "சீ");
        text = text.replaceAll("rp", "சி");
        text = text.replaceAll("rh", "சா");
        text = text.replaceAll("nr", "செ");
        text = text.replaceAll("Nr", "சே");
        text = text.replaceAll("nrh", "சொ");
        text = text.replaceAll("Nrh", "சோ");
        text = text.replaceAll("R", "சு");
        text = text.replaceAll("#", "சூ");
        text = text.replaceAll("r;", "ச்");
        text = text.replaceAll("r", "ச");



        text = text.replaceAll("nos", "ழௌ");
        text = text.replaceAll("io", "ழை");
        text = text.replaceAll("No", "ழே");
        text = text.replaceAll("Noh", "ழோ");
        text = text.replaceAll("oh", "ழா");
        text = text.replaceAll("oP", "ழீ");
        text = text.replaceAll("op", "ழி");
        text = text.replaceAll("oh", "ழா");
        text = text.replaceAll("no", "ழெ");
        text = text.replaceAll("noh", "ழொ");
        text = text.replaceAll("O", "ழு");
        text = text.replaceAll("\\*", "ழூ");
        text = text.replaceAll("o;", "ழ்");
        text = text.replaceAll("o", "ழ");

        text = text.replaceAll("n\\[s", "ஜௌ");
        text = text.replaceAll("i\\[", "ஜை");
        text = text.replaceAll("N\\[", "ஜே");
        text = text.replaceAll("N\\[h", "ஜோ");
        text = text.replaceAll("\\[h", "ஜா");
        text = text.replaceAll("\\[_", "ஜூ");
        text = text.replaceAll("\\[\\{", "ஜு");
        text = text.replaceAll("\\[p", "ஜி");
        text = text.replaceAll("\\[P", "ஜீ");
        text = text.replaceAll("\\[h", "ஜா");
        text = text.replaceAll("n\\[", "ஜெ");
        text = text.replaceAll("N\\[", "ஜே");
        text = text.replaceAll("n\\[h", "ஜொ");
        text = text.replaceAll("N\\[h", "ஜோ");
        text = text.replaceAll("\\[;", "ஜ்");
        text = text.replaceAll("\\[", "ஜ");


        text = text.replaceAll("n`s", "ஹௌ");
        text = text.replaceAll("i`", "ஹை");
        text = text.replaceAll("N`", "ஹே");
        text = text.replaceAll("N`h", "ஹோ");
        text = text.replaceAll("`h", "ஹா");
        text = text.replaceAll("`P", "ஹீ");
        text = text.replaceAll("`p", "ஹி");
        text = text.replaceAll("`h", "ஹா");
        text = text.replaceAll("n`", "ஹெ");
        text = text.replaceAll("N`", "ஹே");
        text = text.replaceAll("n`h", "ஹொ");
        text = text.replaceAll("N`h", "ஹோ");
        text = text.replaceAll("`\\{", "ஹு");
        text = text.replaceAll("`_", "ஹூ");
        text = text.replaceAll("`;", "ஹ்");
        text = text.replaceAll("`", "ஹ");


        text = text.replaceAll("nfs", "கௌ");
        text = text.replaceAll("if", "கை");
        text = text.replaceAll("Nf", "கே");
        text = text.replaceAll("Nfh", "கோ");
        text = text.replaceAll("fh", "கா");
        text = text.replaceAll("fP", "கீ");
        text = text.replaceAll("fp", "கி");
        text = text.replaceAll("fh", "கா");
        text = text.replaceAll("nf", "கெ");
        text = text.replaceAll("Nf", "கே");
        text = text.replaceAll("nfh", "கொ");
        text = text.replaceAll("Nfh", "கோ");
        text = text.replaceAll("F", "கு");
        text = text.replaceAll("\\$", "கூ");
        text = text.replaceAll("f;", "க்");
        text = text.replaceAll("f", "க");


        text = text.replaceAll("n\\]s", "ஸௌ");
        text = text.replaceAll("i\\]", "ஸை");
        text = text.replaceAll("N\\]", "ஸே");
        text = text.replaceAll("N\\]h", "ஸோ");
        text = text.replaceAll("\\]h", "ஸா");
        text = text.replaceAll("\\]P", "ஸீ");
        text = text.replaceAll("\\]p", "ஸி");
        text = text.replaceAll("\\]h", "ஸா");
        text = text.replaceAll("n\\]", "ஸெ");
        text = text.replaceAll("N\\]", "ஸே");
        text = text.replaceAll("n\\]h", "ஸொ");
        text = text.replaceAll("N\\]h", "ஸோ");
        text = text.replaceAll("\\]\\{", "ஸு");
        text = text.replaceAll("\\]_", "ஸூ");
        text = text.replaceAll("\\];", "ஸ்");
        text = text.replaceAll("\\]", "ஸ");


        text = text.replaceAll("nus", "ரௌ");
        text = text.replaceAll("is", "ரை");
        text = text.replaceAll("Nu", "ரே");
        text = text.replaceAll("Nuh", "ரோ");
        text = text.replaceAll("uh", "ரா");
        text = text.replaceAll("uP", "ரீ");
        text = text.replaceAll("up", "ரி");
        text = text.replaceAll("uh", "ரா");
        text = text.replaceAll("nu", "ரெ");
        text = text.replaceAll("Nu", "ரே");
        text = text.replaceAll("nuh", "ரொ");
        text = text.replaceAll("Nuh", "ரோ");
        text = text.replaceAll("U", "ரு");
        text = text.replaceAll("\\&", "ரூ");
        text = text.replaceAll("u;", "ர்");
        text = text.replaceAll("u", "ர");


        text = text.replaceAll("nws", "றௌ");
        text = text.replaceAll("iw", "றை");
        text = text.replaceAll("Nw", "றே");
        text = text.replaceAll("Nwh", "றோ");
        text = text.replaceAll("wh", "றா");
        text = text.replaceAll("wP", "றீ");
        text = text.replaceAll("wp", "றி");
        text = text.replaceAll("wh", "றா");
        text = text.replaceAll("nw", "றெ");
        text = text.replaceAll("Nw", "றே");
        text = text.replaceAll("nwh", "றொ");
        text = text.replaceAll("nwh", "றோ");
        text = text.replaceAll("W", "று");
        text = text.replaceAll("W\\}", "றூ");
        text = text.replaceAll("w;", "ற்");
        text = text.replaceAll("w", "ற");


        text = text.replaceAll("nIs", "டௌ");
        text = text.replaceAll("iI", "டை");
        text = text.replaceAll("NI", "டே");
        text = text.replaceAll("NIh", "டோ");
        text = text.replaceAll("Ih", "டா");
        text = text.replaceAll("IP", "டீ");
        text = text.replaceAll("b", "டி");
        text = text.replaceAll("B", "டீ");
        text = text.replaceAll("Ih", "டா");
        text = text.replaceAll("nI", "டெ");
        text = text.replaceAll("NI", "டே");
        text = text.replaceAll("nIh", "டொ");
        text = text.replaceAll("NIh", "டோ");
        text = text.replaceAll("L", "டு");
        text = text.replaceAll("\\^", "டூ");
        text = text.replaceAll("I;", "ட்");
        text = text.replaceAll("l", "ட");


        text = text.replaceAll("ngs", "பௌ");
        text = text.replaceAll("ig", "பை");
        text = text.replaceAll("Ng", "பே");
        text = text.replaceAll("Ngh", "போ");
        text = text.replaceAll("gh", "பா");
        text = text.replaceAll("gP", "பீ");
        text = text.replaceAll("gp", "பி");
        text = text.replaceAll("gh", "பா");
        text = text.replaceAll("ng", "பெ");
        text = text.replaceAll("Ng", "பே");
        text = text.replaceAll("ngh", "பொ");
        text = text.replaceAll("Ngh", "போ");
        text = text.replaceAll("G\\+", "பூ");
        text = text.replaceAll("G", "பு");
        text = text.replaceAll("g;", "ப்");
        text = text.replaceAll("g", "ப");


        text = text.replaceAll("nks", "மௌ");
        text = text.replaceAll("ik", "மை");
        text = text.replaceAll("Nk", "மே");
        text = text.replaceAll("Nkh", "மோ");
        text = text.replaceAll("kh", "மா");
        text = text.replaceAll("kP", "மீ");
        text = text.replaceAll("kp", "மி");
        text = text.replaceAll("nk", "மெ");
        text = text.replaceAll("Nk", "மே");
        text = text.replaceAll("nkh", "மொ");
        text = text.replaceAll("Nkh", "மோ");
        text = text.replaceAll("K", "மு");
        text = text.replaceAll("%", "மூ");
        text = text.replaceAll("k;", "ம்");
        text = text.replaceAll("k", "ம");


        text = text.replaceAll("nas", "யௌ");
        text = text.replaceAll("ia", "யை");
        text = text.replaceAll("Na", "யே");
        text = text.replaceAll("Nah", "யோ");
        text = text.replaceAll("ah", "யா");
        text = text.replaceAll("aP", "யீ");
        text = text.replaceAll("ap", "யி");
        text = text.replaceAll("na", "யெ");
        text = text.replaceAll("nah", "யொ");
        text = text.replaceAll("yO", "யோ");
        text = text.replaceAll("A\\+", "யூ");
        text = text.replaceAll("A", "யு");
        text = text.replaceAll("a;", "ய்");
        text = text.replaceAll("a", "ய");


        text = text.replaceAll("nds", "னௌ");
        text = text.replaceAll("id", "னை");
        text = text.replaceAll("Nd", "னே");
        text = text.replaceAll("Ndh", "னோ");
        text = text.replaceAll("dh", "னா");
        text = text.replaceAll("dP", "னீ");
        text = text.replaceAll("dp", "னி");
        text = text.replaceAll("dh", "னா");
        text = text.replaceAll("nd", "னெ");
        text = text.replaceAll("Nd", "னே");
        text = text.replaceAll("ndh", "னொ");
        text = text.replaceAll("Ndh", "னோ");
        text = text.replaceAll("D\\}", "னூ");
        text = text.replaceAll("D", "னு");
        text = text.replaceAll("d;", "ன்");
        text = text.replaceAll("d", "ன");


        text = text.replaceAll("nzs", "ணௌ");
        text = text.replaceAll("iz", "ணை");
        text = text.replaceAll("Nz", "ணே");
        text = text.replaceAll("Nzh", "ணோ");
        text = text.replaceAll("zh", "ணா");
        text = text.replaceAll("zP", "ணீ");
        text = text.replaceAll("zp", "ணி");
        text = text.replaceAll("nz", "ணெ");
        text = text.replaceAll("Nz", "ணே");
        text = text.replaceAll("nzh", "ணொ");
        text = text.replaceAll("Nzh", "ணோ");
        text = text.replaceAll("Z\\}", "ணூ");
        text = text.replaceAll("Z", "ணு");
        text = text.replaceAll("z;", "ண்");
        text = text.replaceAll("z", "ண");


        text = text.replaceAll("nys", "லௌ");
        text = text.replaceAll("iy", "லை");
        text = text.replaceAll("Ny", "லே");
        text = text.replaceAll("Nyh", "லோ");
        text = text.replaceAll("yh", "லா");
        text = text.replaceAll("yP", "லீ");
        text = text.replaceAll("yp", "லி");
        text = text.replaceAll("yh", "லா");
        text = text.replaceAll("ny", "லெ");
        text = text.replaceAll("Ny", "லே");
        text = text.replaceAll("nyh", "லொ");
        text = text.replaceAll("Nyh", "லோ");
        text = text.replaceAll("Y\\}", "லூ");
        text = text.replaceAll("Y", "லு");
        text = text.replaceAll("y;", "ல்");
        text = text.replaceAll("y", "ல");


        text = text.replaceAll("nss", "ளௌ");
        text = text.replaceAll("is", "ளை");
        text = text.replaceAll("Ns", "ளே");
        text = text.replaceAll("Nsh", "ளோ");
        text = text.replaceAll("sh", "ளா");
        text = text.replaceAll("sP", "ளீ");
        text = text.replaceAll("sp", "ளி");
        text = text.replaceAll("ns", "ளெ");
        text = text.replaceAll("Ns", "ளே");
        text = text.replaceAll("nsh", "ளொ");
        text = text.replaceAll("Nsh", "ளோ");
        text = text.replaceAll("S", "ளு");
        text = text.replaceAll("LU", "ளூ");
        text = text.replaceAll("s;", "ள்");
        text = text.replaceAll("s", "ள");


        text = text.replaceAll("nts", "வௌ");
        text = text.replaceAll("it", "வை");
        text = text.replaceAll("Nt", "வே");
        text = text.replaceAll("Nth", "வோ");
        text = text.replaceAll("th", "வா");
        text = text.replaceAll("tP", "வீ");
        text = text.replaceAll("tp", "வி");
        text = text.replaceAll("tP", "வீ");
        text = text.replaceAll("th", "வா");
        text = text.replaceAll("nt", "வெ");
        text = text.replaceAll("Nt", "வே");
        text = text.replaceAll("nth", "வொ");
        text = text.replaceAll("Nth", "வோ");
        text = text.replaceAll("T\\+", "வூ");
        text = text.replaceAll("T", "வு");
        text = text.replaceAll("t;", "வ்");
        text = text.replaceAll("t", "வ");

        text = text.replaceAll("xs", "ஔ");
        text = text.replaceAll("I", "ஐ");
        text = text.replaceAll("M", "ஆ");
        text = text.replaceAll("V", "ஏ");
        text = text.replaceAll("<", "ஈ");
        text = text.replaceAll("C", "ஊ");
        text = text.replaceAll("X", "ஓ");
        text = text.replaceAll("m", "அ");
        text = text.replaceAll("v", "எ");
        text = text.replaceAll(",", "இ");
        text = text.replaceAll("c", "உ");
        text = text.replaceAll("x", "ஒ");
        text = text.replaceAll("\\/", "ஃ");


        text = text.replaceAll("hp","ரி");
        text = text.replaceAll("hP","ரீ");
        text = text.replaceAll("Nh","ரே");
        text = text.replaceAll("h;","ர்");
        text = text.replaceAll("hh","ரா");

        text = text.replaceAll("p","ி");
        text = text.replaceAll("P","ீ");
        text = text.replaceAll("N","ே");
        text = text.replaceAll("n","ெ");
        text = text.replaceAll(";","்");
        text = text.replaceAll("h","ா");
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
