package ServerPart;

/*import java.io.*;
import java.net.*;


public class Server {

	  public static void main(String[] args) throws IOException {
	    System.out.println("Welcome to Server side");
	    BufferedReader in = null;
	    PrintWriter    out= null;

	    ServerSocket servers = null;
	    Socket       fromclient = null;

	    // create server socket
	    try {
	      servers = new ServerSocket(4444);
	    } catch (IOException e) {
	      System.out.println("Couldn't listen to port 4444");
	      System.exit(-1);
	    }

	    try {
	     // System.out.print("Waiting for a client...");
	      fromclient= servers.accept();
	      System.out.println("Client connected");
	    } catch (IOException e) {
	      System.out.println("Can't accept");
	      System.exit(-1);
	    }

	    
	    in  = new BufferedReader(new 
	     InputStreamReader(fromclient.getInputStream()));
	    out = new PrintWriter(fromclient.getOutputStream(),true);
	    String         input;

	    
	    System.out.println("Wait for messages");
	    while ((input = in.readLine()) != null) {
	     if (input.equalsIgnoreCase("exit")) break;
	     out.println("S ::: "+input);
	     System.out.println(input);
	    }
	    out.close();
	    in.close();
	    fromclient.close();
	    servers.close();
	  }
	}*/

import java.io.*; 
import java.net.*; 
class Server {    
	public static void main(String args[]) throws Exception{         
		DatagramSocket serverSocket = new DatagramSocket(9876);             
		byte[] receiveData = new byte[1024];             
		byte[] sendData = new byte[1024];             
		while(true) {                   
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			serverSocket.receive(receivePacket);  
			String sentence = new String( receivePacket.getData());   
			System.out.println("RECEIVED: " + sentence);          
			InetAddress IPAddress = receivePacket.getAddress();   
			int port = receivePacket.getPort();            
			String capitalizedSentence = sentence.toUpperCase();   
			sendData = capitalizedSentence.getBytes();             
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);    
			serverSocket.send(sendPacket);              
			}     
		} 
	}