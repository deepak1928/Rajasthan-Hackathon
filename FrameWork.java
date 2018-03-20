package agent;
import java.util.Scanner;

public class FrameWork {
	private String farmer_id;
	private String dealer_id;
	private String Date;
	private String Time;
	private float price_of_purchase;
	private float quantity_selled;
	
	public FrameWork(){
		Scanner s=new Scanner(System.in);
		System.out.println("Kindly fill all the Details Carefully!!!");
		System.out.println("Enter the Farmer Id");
		farmer_id=s.nextLine();
		System.out.println("Enter the Dealer ID");
		dealer_id=s.nextLine();
		System.out.println("price of purchase");
		price_of_purchase=s.nextFloat();
		System.out.println("Kindly fill all the Details Carefully!!!");
		quantity_selled=s.nextFloat();
		s.close();
		 
	}
	public String Get_Farmerid() {
		return farmer_id;
		
	}
	
	public String Get_DealerId() {
		return dealer_id;
	}
	 
	public String Get_date()
	{
		return Date;
	}
	public String Get_Time() {
		return Time;
	}
	public float Get_price() {
		return price_of_purchase;
	}
	
	public float Get_Quantity(){
		return quantity_selled;
	}
	 
	 public void Show_Details()
	 {
		 System.out.println("Transaction Details   .........");
		 System.out.println("Dealer Id"+dealer_id+"\nFarmers Id :"
		 +farmer_id+"\nPrice of pproduct sold"+price_of_purchase+
		 "\nquantity Selled :"+quantity_selled);
		  
	 }
}
