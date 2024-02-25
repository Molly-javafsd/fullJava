package com.simplilearn.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
public static void main(String[] args) {
	String regex="[+]91[987]{3}[0-9]{7}";
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number");
	String inp=sc.next();
Pattern pattern=Pattern.compile(regex);
Matcher matcher=pattern.matcher(inp);
if(matcher.matches())
	System.out.println("pattern matched");
else
	System.out.println("not matched");
sc.close();

}
}
