package unidad3.regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio08 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(
		Ejercicio01.class.getResourceAsStream("/texto.txt")));
		String html = in.readAllAsString();
		Matcher m = Pattern.compile("<uppercase>(.*?)</uppercase>").matcher(html);
		StringBuilder sb = new StringBuilder();
		while (m.find())
			m.appendReplacement(sb, m.group(1).toUpperCase());
		m.appendTail(sb);
		System.out.println(sb);
	}
}
