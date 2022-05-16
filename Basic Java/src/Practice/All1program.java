package Practice;

public class All1program {
    int age=25; // non static gv
    static double salary=50000;  // static gv
    
    
	public static void main(String[] args) {
		
      int age=30;   // local variable
      double salary=80000;  // local variable
      System.out.println("my age:"+age);   //30
      System.out.println( "my salary:"+salary);  //80000.0
      All1program ref=new All1program();   
      System.out.println("2nd my age:"+ref.age);  //25
      System.out.println("2nd salary:"+All1program.salary);   //50000.0
      neha(27, 70.20);  // static method la main method mdy CALL kel with paramaeter
      neha(20.20,20);   // this also SM
      System.out.println("addition result:"+neha(20.20,20));  // this statment for display 2nd SM output
      ref.neha(2,2);   // (line no.35)creat obj for NSM neha
      System.out.println("NSM neha:"+ref.neha(2,2));
      ref.neha(500.50, 100.10);
      System.out.println("NSM neha:"+ref.neha(500.50, 100.10));
     
      
      
	}
 

      static void neha(int age,double salary) {    //STATIC METHOD (method overloading'neha')
      System.out.println("age:"+age);
      System.out.println("salary:"+salary); 
     
      
}
      static double neha(double num1,int num2) {    //  again we creat STATIC METHOD (method overloading'neha')
    	  double result=num1+num2;
    	  return result;
      }
      
      int neha (int num1,int num2) {   // NON STATIC METHOD  (method overloading'neha')
    	  int result = num1*num2;     // here NSM for this we creat object in main method(num1=2,num2=2)
    	  return result;         //4
    	
    }
      
      double  neha(double num1,double num2) {  // NON STATIC METHOD
    	  double result=num1-num2;    // we hv,num1=500.50 & num2=100.10--( we considr here double for tht we use fractional no.)
    	  return result;  // result is 400.4
    	  
      }
   
}
 //IN METHOD OVERLOADING---
 //1)we creat more than method in a one class body with diff set of parameter
 // this is-- type of parameter
       //    -- no. of argument of parameter
         //  --position of arg/parameter
      