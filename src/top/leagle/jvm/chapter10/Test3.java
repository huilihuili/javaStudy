package top.leagle.jvm.chapter10;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("hello", "���");
		map.put("how are you?", "����û��");
		System.out.println(map.get("hello"));
		System.out.println(map.get("how are you?"));
	}
}
