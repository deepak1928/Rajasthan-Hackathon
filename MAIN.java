 package agent;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MAIN   {
	FrameWork[] frames=new FrameWork[100];
	int i=0;
	private int prev_hash=0;
	 private List<Dealer> p;
	
	ArrayList<Block1> blockchain=new ArrayList<Block1>();
    
	public static void main(String[] args) {
    MAIN m=new MAIN();
	Scanner s=new Scanner("System.in");
     System.out.println("Menu");
     System.out.println("1.Dealer ");
     System.out.println("2.Dealer Manager");
     System.out.println("3.Dealer Server Manager");
     System.out.println("4.Exit");
     System.out.println("Please enter your choice ");
     int k=s.nextInt();
     switch(k) {
     	case 1:
    	   m.Enter_Dealer();
    	   break;
     	case 2:
    	  m.Enter_DealerManager();
    	   break;
     	case 3:
     		m.Enter_Server();
    	 	break;
     		}
     
    }
 	public void show_record() 
	{ 
 			}
 	public void fun() {
		try {
			FrameWork frame1=new FrameWork();
			frames[i++]=frame1;
			Block1 b=new Block1(prev_hash,frames);
			blockchain.add(b);
			prev_hash=b.Get_Block_hash();
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
	
	public void Enter_Dealer()   {
		Scanner s=new Scanner(System.in);
 		System.out.println("Please enter your name");
 		String r=s.nextLine();
 		
 		
 		 InetAddress localhost = InetAddress.getLocalHost();
         //System.out.println("System IP Address : " +(localhost.getHostAddress()).trim());
 		String Str  = (String)(localhost.getHostAddress()).trim();
 		//}catch(Exception ex) {
 			//ex.printStackTrace();
 		//}
         int port=5000;
         p=new ArrayList<Dealer>();

         Block root=new Block();
 	     Dealer d=new Dealer(r,str,port,root,p);	

	}
	public void Enter_DealerManager() {
        	System.out.println("Sorry you are not ready to manage System");	
		
	}
	public void Enter_Server() {

    	System.out.println("Sorry you are not ready to Server");
	}
}



