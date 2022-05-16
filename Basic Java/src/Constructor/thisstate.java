package Constructor;

public class thisstate {

	thisstate(){
		this(45);
		System.out.println("zero para");
	}
	
	thisstate( int age){
		this(77, 'v');
		System.out.println("int para");
		
	}
	
	thisstate(int age, char v){
	
		System.out.println("int,char para");
		
	}
	

	public static void main(String[] args) {
	   thisstate tt=new thisstate();

	}

}
/**
 * this()--> 
 * 			this statement is an instance of current class which is declared inside ths constuctor body 
 * 			its should be first statement inside the constructor body
 * 			its used to call another constructor of the same class based on parameter. 
 * 
 */
