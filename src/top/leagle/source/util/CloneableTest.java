package top.leagle.source.util;

import java.util.Arrays;

public class CloneableTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneableApp1 cloneableApp1 = new CloneableApp1(2);
		cloneableApp1.elementData[0] = new String("EagleLi");
		cloneableApp1.elementData[1] = new Integer(1);
		CloneableApp1 cloneableApp1Copy = (CloneableApp1) cloneableApp1.clone();
		cloneableApp1Copy.elementData[0] = new String("EagleLi1");
		System.out.println(cloneableApp1);
		System.out.println(cloneableApp1Copy);

		System.out.println("\n--- 分割线 ---\n");

		CloneableApp2 cloneableApp2 = new CloneableApp2(2);
		cloneableApp2.elementData[0] = new String("EagleLi");
		cloneableApp2.elementData[1] = new Integer(1);
		CloneableApp2 cloneableApp2Copy = (CloneableApp2) cloneableApp2.clone();
		cloneableApp2Copy.elementData[0] = new String("EagleLi1");
		System.out.println(cloneableApp2);
		System.out.println(cloneableApp2Copy);
	}

	public static class CloneableApp1 implements Cloneable {
		public Object[] elementData;

		public CloneableApp1(int capacity) {
			elementData = new Object[capacity];
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

		@Override
		public String toString() {
			int length = elementData.length;
			if (length == 0) {
				return "CloneableApp1[]";
			}

			StringBuilder sb = new StringBuilder();
			sb.append("CloneableApp1[");
			int i = 0;
			for (;;) {
				sb.append(elementData[i].toString());
				if (++i >= length) {
					return sb.append(']').toString();
				}
				sb.append(',').append(' ');
			}
		}
	}

	public static class CloneableApp2 implements Cloneable {
		public Object[] elementData;

		public CloneableApp2(int capacity) {
			elementData = new Object[capacity];
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			CloneableApp2 cloneableApp2 = (CloneableApp2) super.clone();
			cloneableApp2.elementData = Arrays.copyOf(elementData, elementData.length);
			return cloneableApp2;
		}

		@Override
		public String toString() {
			int length = elementData.length;
			if (length == 0) {
				return "CloneableApp2[]";
			}

			StringBuilder sb = new StringBuilder();
			sb.append("CloneableApp2[");
			int i = 0;
			for (;;) {
				sb.append(elementData[i].toString());
				if (++i >= length) {
					return sb.append(']').toString();
				}
				sb.append(',').append(' ');
			}
		}
	}
}
