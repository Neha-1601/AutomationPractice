package condition;

public class ifelseifladder {

	public static void main(String[] args) {

		int marks=50; 
		if(marks<50){  //false
			System.out.println("fail");  
		}        				
		else if(marks>=50 && marks<60){   //true  true===true
			System.out.println("D grade");  
		}  
		else if(marks>=60 && marks<70){  // true  true===true
			System.out.println("C grade");  
		}  
		else if(marks>=70 && marks<80){  // true true==true
			System.out.println("B grade");  
		}  						
		else if(marks>=80 && marks<90){  //true treu===true
			System.out.println("A grade");  
		}else if(marks>=90 && marks<100){  //true true==true
			System.out.println("A+ grade");  
		}else{  
			System.out.println("Invalid!");  
		}  
	}

}
