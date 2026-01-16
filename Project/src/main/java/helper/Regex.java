package helper;

public class Regex {
	public final static String NUM = "[0-9]+";
	public final static String CHARS = "^[a-zA-Z\\s*]{0,50}$";
	public final static String CHARS_AND_NUMBERS = "^[a-zA-Z0-9\\s*]{0,50}$";
	public final static String GENDER = "^(male|female)$";
	public final static String DATE = "^(?!0000)(?:(?!00)[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01]))$";
	public final static String YESNO = "^(y|n)$";

}
