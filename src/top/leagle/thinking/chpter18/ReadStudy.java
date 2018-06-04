package top.leagle.thinking.chpter18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import org.junit.Test;

public class ReadStudy {

	@Test
	public void memoryInputTest() throws IOException {
		StringReader in = new StringReader("I'm Leagle!");
		int c;
		while ((c = in.read()) != -1) {
			System.out.print((char) c);
		}
		System.out.println();
	}

	@Test
	public void redirectingTest() throws IOException {
		PrintStream console = System.out;
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("in.txt"));
		PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("out.txt")));
		System.setIn(in);
		System.setOut(out);
		System.setErr(out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string;
		while ((string = br.readLine()) != null) {
			System.out.println(string);
		}
		System.out.println("结束了");
		out.close();
		System.setOut(console);
		System.out.println("结束了");
	}

	@Test
	public void commandTest() {
		System.out.println(command("ping www.baidu.com"));
		System.out.println(command("jjj"));
		System.out.println(command("python d:\\error.py"));
	}

	public static boolean command(String command) {
		boolean err = false;
		try {
			Process process = new ProcessBuilder(command.split(" ")).start();
			BufferedReader results = new BufferedReader(
					new InputStreamReader(process.getInputStream(), Charset.forName("GBK")));
			String s;
			while ((s = results.readLine()) != null) {
				System.out.println(s);
			}

			BufferedReader errors = new BufferedReader(new InputStreamReader(process.getErrorStream(), Charset.forName("GBK")));
			while ((s = errors.readLine()) != null) {
				System.out.println(s);
				err = true;
			}
		} catch (Exception e) {
			if (!command.equals("CMD /C")) {
				command("CMD /C " + command);
			} else {
				throw new RuntimeException(e);
			}
		}
		return err;
	}
}
