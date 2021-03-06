package top.leagle.thinking.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class PatternStudy {
	@Test
	public void test1() {
		String s = "Never give up! Never surrender!";

		System.out.println("--- 贪婪型 ---");
		Pattern p = Pattern.compile("Never.*!");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group());
		}

		System.out.println("--- 勉强型 ---");
		p = Pattern.compile("Never.*?!");
		m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group());
		}
	}

	@Test
	public void test2() {
		String s = "I love study!";

		StringBuffer sbuf = new StringBuffer();
		Pattern p = Pattern.compile("[aeiou]");
		Matcher m = p.matcher(s);
		while (m.find()) {
			m.appendReplacement(sbuf, m.group().toUpperCase());
		}
		System.out.println(sbuf);

		sbuf = new StringBuffer();
		p = Pattern.compile("[aeiou]");
		m = p.matcher(s);
		while (m.find()) {
			m.appendReplacement(sbuf, m.group().toUpperCase());
		}
		m.appendTail(sbuf);
		System.out.println(sbuf);
	}

	@Test
	public void test3() {
		String s = "58.27.82.161@02/10/2005";

		Pattern p = Pattern.compile("(\\d+[.]\\d+[.]\\d+[.]\\d+)@(\\d{2}/\\d{2}/\\d{4})");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println("m.group() = " + m.group());
			System.out.println("m.group(1) = " + m.group(1));
			System.out.println("m.group(2) = " + m.group(2));
		}
	}
}
