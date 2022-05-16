package condition;

public class ifcond2 {

	public static void main(String[] args) {
		// defining variable
		int num=55;
		//Check if the number is divisible by 2 or not 
		if(num%2==0) {
			//Check if the number is divisible by 2 or not 
			System.out.println("nothing");
		}
		else {
			System.out.println("odd number");
		}
		ifcond2.checkEvenOddNumber(700);
		checkEvenOddNumber(701);
		ifcond2.numisevenodd(77);
		ifcond2.checkEvenOddNumber();
	}
		/**
		 * static method with argument/parameter and return type as void
		 */
		static void checkEvenOddNumber(int num) {//int num=700;
			if(num%2==0){  
				System.out.println("Given number is even number: "+num);  
			}else{  
				System.out.println("Given number is odd number: "+num);  
			}
		}
	/**
	 * static method with argument and return type as boolean
	 */ static boolean numisevenodd(int num) {
		 if(num%2==0) {
			 System.out.println("yes");
			 return true;
		 }
		 else {
			 System.out.println("no");
			 return false;
		 }
	 }
	 /**
		 * static method with no argument and return type as void
		 */
		static void checkEvenOddNumber() {  // we creat method overloading of method checkovenoddnum
			int num=50;
			if(num%2==0){  
				System.out.println("Given number is even number: "+num);  
			}else{  
				System.out.println("Given number is odd number: "+num);  
			}
		}		
		
		
	}


