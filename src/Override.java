

	class Thought {
		public void message() {
			System.out.println("I feel like I am diagonally parked in a parallel universe.");
		}
	}
	class Advice1 extends Thought {
		public void message() {
			 System.out.println("Warning: Dates in calendar are closer than they appear.");
		}
	}
	class Advice2 extends Thought {
	      public void message() {
	         System.out.println("Warning: Dates in calendar are far than they appear.");
	         System.out.println("Invoke Parent's Version of Method");
             super.message();  // Invoke parent's version of method.
	      }
	}
	
	public class Override{ 
	public static void main(String arg[]){
		
	  		Thought parking = new Thought();
	  	    parking.message();  // Prints "I feel like I am diagonally parked in a parallel universe."

	  		Thought dates = new Advice2();  // Polymorphism
	  		dates.message();  // Prints "Warning: Dates in calendar are closer than they appear."
	  		}
     }