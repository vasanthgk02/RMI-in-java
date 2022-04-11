//SERVER 
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class server{
	public static void main(String args[]){
		try{
			Registry registry = LocateRegistry.createRegistry(6007);
			operation_impl obj1 = new operation_impl();
			registry.rebind("methods", obj1);
			System.out.println("Server Ready!!");
		}
		catch(Exception e){
		}
	}
}
	
