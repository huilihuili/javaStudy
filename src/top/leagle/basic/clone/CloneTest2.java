package top.leagle.basic.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

class Inner implements Serializable {
	private static final long serialVersionUID = 872390113109L; // 最好是显式声明ID
	public String name = "";

	public Inner(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Inner的name值为：" + name;
	}
}

class Outer implements Serializable {
	private static final long serialVersionUID = 369285298572941L; // 最好是显式声明ID
	public Inner inner;

	public Outer myclone() {
		Outer outer = null;
		try { // 将该对象序列化成流,因为写在流里的是对象的一个拷贝，而原对象仍然存在于JVM里面。所以利用这个特性可以实现对象的深拷贝
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			outer = (Outer) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return outer;
	}
}

public class CloneTest2 {

	@Test
	public void test1() {
		Outer outer1 = new Outer();
		outer1.inner = new Inner("hello");
		Outer outer2 = outer1.myclone();
		System.out.println(outer1.inner.toString());
		System.out.println(outer2.inner.toString());

		outer2.inner.name = "hello2";
		System.out.println(outer1.inner.toString());
		System.out.println(outer2.inner.toString());
	}
}
