package ClientPart;

/*import java.io.*;
import java.net.*;

import ClientForm.Controller;


public class Client {
  public static void start() throws IOException {

    System.out.println("Welcome to Client side");

    Socket fromserver = null;

    /*if (args.length==0) {
      System.out.println("use: client hostname");
      System.exit(-1);
    }////

    System.out.println("Connecting to... "+"localhost");

    fromserver = new Socket("localhost",4444);
    BufferedReader in  = new
     BufferedReader(new 
      InputStreamReader(fromserver.getInputStream()));
    PrintWriter    out = new 
     PrintWriter(fromserver.getOutputStream(),true);
   /* BufferedReader inu = new 
     BufferedReader(new InputStreamReader(System.in));////

    String fuser,fserver;

   /* while ((fuser = inu.readLine())!=null) {
      out.println(fuser);
      fserver = in.readLine();
      System.out.println(fserver);
      if (fuser.equalsIgnoreCase("close")) break;
      if (fuser.equalsIgnoreCase("exit")) break;
    }
////
    
    for (int i = 0; i < 64; i++){
    	try {
    	    Thread.sleep(1000);                 //1000 milliseconds is one second.
    	} catch(InterruptedException ex) {
    	    Thread.currentThread().interrupt();
    	}
    	
    	out.println(i);    //send package
        fserver = in.readLine(); // recive package
        //System.out.println(fserver);    //show package	
        Controller.textArea.appendText(fserver + "\n");
    }
    
    
    
    out.close();
    in.close();
   // inu.close();
    fromserver.close();
  }
}*/
    
    import java.io.*; 
    import java.net.*; 
    public class Client {    
    	public static void start() throws Exception    {      
    		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
    		DatagramSocket clientSocket = new DatagramSocket();
    		InetAddress IPAddress = InetAddress.getByName("localhost");
    		byte[] sendData = new byte[1024];
    		byte[] receiveData = new byte[1024];
    		//while (true){
	    		String sentence = inFromUser.readLine();
	    		sendData = sentence.getBytes();  
	    		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876); 
	    		clientSocket.send(sendPacket);  
	    		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
	    		clientSocket.receive(receivePacket);  
	    		String modifiedSentence = new String(receivePacket.getData());
	    		System.out.println("FROM SERVER:" + modifiedSentence); 
    		//}
    		//clientSocket.close(); 
	    		sentence = inFromUser.readLine();
	    		sendData = sentence.getBytes();  
	    		sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876); 
	    		clientSocket.send(sendPacket);  
	    		receivePacket = new DatagramPacket(receiveData, receiveData.length);
	    		clientSocket.receive(receivePacket);  
	    		modifiedSentence = new String(receivePacket.getData());
	    		System.out.println("FROM SERVER:" + modifiedSentence);
    		} 
    }
    
    			
    
