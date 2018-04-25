package top.leagle.basic.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

class Inner implements Serializable {
	private static final long serialVersionUID = 872390113109L; // �������ʽ����ID
	public String name = "";

	public Inner(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Inner��nameֵΪ��" + name;
	}
}

class Outer implements Serializable {
	private static final long serialVersionUID = 369285298572941L; // �������ʽ����ID
	public Inner inner;

	public Outer myclone() {
		Outer outer = null;
		try { // ���ö������л�����,��Ϊд��������Ƕ����һ����������ԭ������Ȼ������JVM���档��������������Կ���ʵ�ֶ�������
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
