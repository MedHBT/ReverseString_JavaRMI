import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Reverse extends UnicastRemoteObject implements ReverseInterface{

	private static final long serialVersionUID = 1L;

	public Reverse() throws RemoteException {
		super();
	}
	
	public String reverseString(String src) throws RemoteException{
		int length = src.length();
		StringBuffer temp = new StringBuffer();
		for(int i=length;i>0;i--){
			temp.append(src.substring(i-1,i));
		}
		return temp.toString();
	}

}
