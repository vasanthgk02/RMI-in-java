//INTERFACE
import java.rmi.*;
public interface operation extends Remote{
	public String getMessage() throws Exception;
	public int add(int a, int b) throws Exception;
	public int subtract(int a, int b) throws Exception;
	public int multiply(int a,int b) throws Exception;
	public int divide(int a, int b) throws Exception;
}
