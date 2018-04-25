package top.leagle.pattern.proxy.proxy2.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
	public String sayHello() throws RemoteException;
}
