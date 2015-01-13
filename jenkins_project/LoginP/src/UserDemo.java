import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;


public class UserDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			fis = new FileInputStream("login.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Login lObj = (Login)ois.readObject();
			
			System.out.println("  Enter User Ide: ");
			String uid = br.readLine();
			System.out.println(" Enter Password: ");
			String pwd = br.readLine();
			
			System.out.println("uid , pwd"+ lObj.getUserID() + " " + lObj.getPassWord());
			
			if ( lObj.getUserID().equalsIgnoreCase(uid)
					&& lObj.getPassWord().equalsIgnoreCase(pwd) )
			{
				System.out.println("Successful login....");
			}
			else
			{
				System.out.println("Invalid user....");
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
