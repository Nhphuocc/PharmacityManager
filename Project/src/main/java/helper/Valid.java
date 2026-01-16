package helper;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid {
	public static String CheckRegex (String Regex,String message) {
		var sc = new Scanner(System.in);
		System.out.println(message);
		while(true) {
			String str = sc.nextLine();
			Pattern pt = Pattern.compile(Regex);
			Matcher mc = pt.matcher(str);
			if(mc.matches()) {
				return str;
			}else {
				System.out.println("error: data invalid!!!");
			}
		}
	}
}
