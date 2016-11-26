
public class Overload {

	
	static void buy(int itemId, double amount){
		System.out.println("ID: 1001, Amount: 100");
	}
	static void buy(String name, int numOfItems){
		System.out.println("Brand: 18F, QTY: 1");
	}
	
	public static void main(String arg[]){
		buy(1,100);
		buy("item",3);

		
		//This is new message.
	}
}
