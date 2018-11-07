package top.leagle.jvm.chapter3;

public class FinalizeEscapeGC {
	public static FinalizeEscapeGC save_hook = null;

	public void isSave() {
		System.out.println("yes, i am still alive :)");
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method executed!");
		FinalizeEscapeGC.save_hook = this;
	}

	public static void main(String[] args) throws InterruptedException {
		save_hook = new FinalizeEscapeGC();

		save_hook = null;
		System.gc();
		Thread.sleep(500);
		if (save_hook != null) {
			save_hook.isSave();
		} else {
			System.out.println("no, i am dead :(");
		}

		save_hook = null;
		System.gc();
		Thread.sleep(500);
		if (save_hook != null) {
			save_hook.isSave();
		} else {
			System.out.println("no, i am dead :(");
		}
	}
}
