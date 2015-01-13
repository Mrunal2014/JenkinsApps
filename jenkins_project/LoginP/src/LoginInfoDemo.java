import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;


public class LoginInfoDemo {

	public static void main(String[] args)
	{
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try
		{
			fos = new FileOutputStream("login.txt");
			oos = new ObjectOutputStream(fos);

			System.out.println("  Enter User Ide: ");
			String uid = br.readLine();
			System.out.println(" Enter Password: ");
			String pwd = br.readLine();
			
			Login l = new Login(uid, pwd);
			oos.writeObject(l);
			System.out.println("Well All data is written");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
				isr.close();
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
