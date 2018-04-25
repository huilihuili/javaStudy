package top.leagle.pattern.proxy.proxy2.service.impl;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import top.leagle.pattern.proxy.proxy2.service.MyRemote;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	private static final long serialVersionUID = 1L;

	protected MyRemoteImpl() throws RemoteException {

	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says, 'Hey'";
	}

	public static void main(String[] args) {
		try {
			MyRemote myRemote = new MyRemoteImpl();
			Naming.rebind("RemoteHello", myRemote);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
