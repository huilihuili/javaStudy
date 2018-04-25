package top.leagle.pattern.proxy.proxy3.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import top.leagle.pattern.proxy.proxy3.state.State;


public interface GumballMachineRemote extends Remote {
	int getCount() throws RemoteException;

	String getLocation() throws RemoteException;

	State getState() throws RemoteException;
}
