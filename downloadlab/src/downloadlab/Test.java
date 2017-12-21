package downloadlab;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Test {
	public static void main(String[] args) 
	{
	
		try {
			Enumeration<NetworkInterface> ni=NetworkInterface.getNetworkInterfaces();
			while(ni.hasMoreElements())
			{
			 NetworkInterface n=ni.nextElement();
				System.out.println(n.getName());
			Enumeration<InetAddress> add=n.getInetAddresses();
		System.out.println(n.isUp());
				while(add.hasMoreElements())
				{
					System.out.println("add.:"+add.nextElement().getHostAddress());
					
				}
			
			}
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
