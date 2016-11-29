
public class Overload {

	
	static void buy(int itemId, double amount){
		System.out.println("ID: "+itemId+" Amount: "+amount);
	}
	static void buy(String name, int numOfItems){
		System.out.println("Brand: "+name+" QTY: "+numOfItems);
	}
	
	public static void main(String arg[]){
		buy(1001,100);
		buy("18F",3);
		//This is new message.
	}
}
