package ConvertionEngine.LegacyToUnicodeFontMappings;

public class Symbol {

	public static String convert(String text) {
		text.replaceAll("", "\\]");
		text.replaceAll("", "\\[");
		return text;
	}
}
