package top.leagle.source.util;

public class ExtendsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Parent parent = new Parent(11, "EagleLi");
		Parent child = new Chind(12, "EagleLi1", 0);

		Parent parentClone = parent.clone();
		Parent childClone = child.clone();
		System.out.println(parentClone);
		System.out.println(childClone);
	}

	public static class Parent implements Cloneable {
		protected int age;
		protected String name;

		public Parent(int age, String name) {
			this.age = age;
			this.name = name;
		}

		@Override
		protected Parent clone() throws CloneNotSupportedException {
			return (Parent) super.clone();
		}

		@Override
		public String toString() {
			return "Parent [age=" + age + ", name=" + name + "]";
		}

	}

	public static class Chind extends Parent {
		private int sex;

		public Chind(int age, String name, int sex) {
			super(age, name);
			this.sex = sex;
		}

		@Override
		public String toString() {
			return "Chind [age=" + age + ", name=" + name + ", sex=" + sex + "]";
		}
	}
}
