package core_java1.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R {
	public static void main(String[] args){

		Pattern pattern = Pattern.compile("aptron",Pattern.CASE_INSENSITIVE);

		Matcher matcher = pattern.matcher("Welcome to Aptron Technologies");

		boolean matchFound = matcher.find();

		if(matchFound){
			System.out.println("Match found......");
		}else{
			System.out.println("Match not found.......");
		}
	}
}
