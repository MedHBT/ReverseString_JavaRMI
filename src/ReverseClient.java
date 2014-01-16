import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;


public class ReverseClient {

	public static void main(String[] args) {
		try {
			ReverseInterface reverse = (ReverseInterface)Naming.lookup("rmi://localhost:1099/Reverse");
			Scanner scan = new Scanner(System.in);
			System.out.println("Type the string to reverse :");
			String src = scan.nextLine();
			String srcReversed = reverse.reverseString(src);
			System.out.println("Reversed String :");
			System.out.println(srcReversed);
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
