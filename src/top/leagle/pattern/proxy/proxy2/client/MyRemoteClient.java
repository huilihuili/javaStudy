package top.leagle.pattern.proxy.proxy2.client;

import java.rmi.Naming;

import top.leagle.pattern.proxy.proxy2.service.MyRemote;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	public void go() {
		try {
			MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			String string = myRemote.sayHello();
			System.out.println(string);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
