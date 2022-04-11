//CLIENT
import java.rmi.*;
public class client{
	public static void main(String[] args){
		try{
			operation opt = (operation)Naming.lookup("rmi://localhost:6007/methods");
			System.out.println(opt.getMessage());
			System.out.println(opt.add(10, 20));
			System.out.println(opt.subtract(10, 20));
			System.out.println(opt.multiply(10, 20));
			System.out.println(opt.divide(10, 20));
		}
		catch(Exception e){
		}
	}
}
