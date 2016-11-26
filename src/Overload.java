
public class Overload {

	
	static void buy(int itemId, double amount){
		System.out.println("Id: 100, Amount: 100");
	}
	static void buy(String name, int numOfItems){
		System.out.println("ToothBush, 3");
	}
	
	public static void main(String arg[]){
		buy(1,1.0);
		buy("item",3);
		
		//This is new message.
	}
}
