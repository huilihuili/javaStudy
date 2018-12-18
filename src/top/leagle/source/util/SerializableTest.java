package top.leagle.source.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializableApp serializableApp = new SerializableApp(2);
		serializableApp.elementData[0] = new String("EagleLi");
		serializableApp.elementData[1] = new Integer(1);

		ByteArrayOutputStream buf = new ByteArrayOutputStream();
		ObjectOutputStream o = new ObjectOutputStream(buf);
		o.writeObject(serializableApp);
		ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
		SerializableApp serializableApp2 = (SerializableApp) in.readObject();
		System.out.println(serializableApp);
		System.out.println(serializableApp2);
		
		System.out.println(serializableApp == serializableApp2);
		System.out.println(serializableApp.elementData == serializableApp2.elementData);

	}

	public static class SerializableApp implements Serializable {

		private static final long serialVersionUID = 1L;
		public Object[] elementData;

		public SerializableApp(int capacity) {
			elementData = new Object[capacity];
		}

		@Override
		public String toString() {
			int length = elementData.length;
			if (length == 0) {
				return "SerializableApp[]";
			}
			StringBuilder sb = new StringBuilder();
			sb.append("SerializableApp[");
			int i = 0;
			for (;;) {
				sb.append(elementData[i]);
				if (++i >= length) {
					return sb.append(']').toString();
				}
				sb.append(',').append(' ');
			}
		}

	}
}
