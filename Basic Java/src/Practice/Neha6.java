package Practice;

         
public class Neha6 {
	
        int age=123;  //nsm vari
		public static void main(String[] args) {  //to access static method different ways
			System.out.println("Result of addition1: "+getAdditionResult(250.36, 45)); // directly access eith method name  or
			System.out.println("******************************");
			System.out.println("Result of addition2: "+Neha6.getAdditionResult(250.36, 45));  // classname.method
			System.out.println("******************************");
			double sum=getAdditionResult(25, 30);
			System.out.println("Sum of two numbers: "+sum);
			double finalResult =sum*100;
			System.out.println("Result after some operation: "+finalResult);
			Neha6 ref=new Neha6();   //creat obj for nsm
			System.out.println("age"+ref.age);  // access
		}
		/*
		 * accessmodifier:
		 * non-accessmodifier:
		 * return type:
		 * methodName:
		 * argument/parameter: 
		 * return value:
		 */
		
		static double getAdditionResult(double num1,double num2) {  //static method
			System.out.println("Number1 is: "+num1);
			System.out.println("Number2 is: "+num2);
			double res = num1+num2;
			return res;
			}


       public static void getInterest2(int p,double r,int t) {//p=350000,r=5,t=36
	       double res=(p*r*t)/100;
	       System.out.println("Interest is :"+res);
}
}
		

	