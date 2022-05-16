package Methods;

public class Method5 {

	public static void main(String[] args) {
    Method5 ref=new Method5(); // for access NSM creat an object/instance i.e. classname refvariable=new classname();
    ref.main();  // after access,,for call the NSM i.e. ref variable.methodname();
    
    ref.add(66,77); // here, NSM 'add' for tht we use above ref of NSM 'main'
    
    getinterest(350000,5,36);  //for SM, we access directly  
  
    getaddi2(3883,7700000);
    System.out.println("2nd SM access:"+Method5.getaddi2(3883,7700000)); // refer line no 37
	}
   
	void main(){  // NON STATIC METHOD
	
	System.out.println("HI, GOOD MORNING");

	}
	private double add(int num1,int num2) {  //  'return type' is double, therefore return is moditory
	//num1=66;
	//num2=77;
	int res;
	res=num1+num2;  // in this return is considered in 'int'
	System.out.println("addi of num1+nym2:"+res);
	return res;
	}
	 
	public static void getinterest(int p,double r, int t) { // creat  SM
		double res=(p*r*t)/100;
		System.out.println("interest is:"+res);// void asel tr tyach println tych method mdy print krych
	
}	
	public static double getaddi2(int age, double salary) {  // creat Sm with double data type
		 double res=age+salary;    // so inthis, we println statement in main method
		 return res;
		 }
	
	
	
}
