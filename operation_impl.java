//INTERFACE IMPLEMENTATION
import java.rmi.server.*;
import java.rmi.*;
public class operation_impl extends UnicastRemoteObject implements operation{
	public operation_impl() throws Exception{
		super();
	}
	public String getMessage() throws Exception{
		return "Welcome to RMI Implementation";
	}
	public int add(int a, int b) throws Exception{
		return a + b;
	}
	public int subtract(int a, int b) throws Exception{
		return a - b;
	}
	public int multiply(int a,int b) throws Exception{
		return a * b;
	}
	public int divide(int a, int b) throws Exception{
		return a / b;
	}	
}
