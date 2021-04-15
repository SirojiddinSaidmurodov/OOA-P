package StructuralPatterns.Proxy;

import BehavioralPatterns.State.headfirst.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;

    State getState();
}
