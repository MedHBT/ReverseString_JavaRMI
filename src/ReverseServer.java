import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;


public class ReverseServer {

	public static void main(String[] args) {
		try {
			System.out.println("[Server] Construction and Implementation!");
			Reverse reverse = new Reverse();
			System.out.println("[Server] Bind with RMIregistry!");
			Naming.rebind("rmi://localhost:1099/Reverse", reverse);
			System.out.println("[Server] Wait for Client!");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		

	}

}
