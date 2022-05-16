package Methods;

public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //System.out.println("to access static method:"+Method4.getaddi(44,5544.9));//
	Method4.getaddi(44,444.88);
//	System.out.println("get result by using datatype double of SM2:"+Method4.getaddi2(22,333.88));
	//Method4.getaddi3(556.882,666.999);
	System.out.println("get result by using datatype double of SM3:"+getaddi3(445.99,333.88));//direct print kel
	System.out.println(".."+Method4.getaddi3(445.99,333.88));// above line access also by using classname.method with parameter
    double sum=getaddi3(22.22,33.33); //here jo returntype ahe tynchy base vr apn ek variable banvla mg tyt apn konte pn operation kru shkto
    System.out.println("result aftewr sum operation:"+sum);  
	double  finalsum=sum*100;  //as above diff opere perform here
	System.out.println("final ans:"+finalsum);
	
	}


 public static void getaddi(int age, double salary) {  // void asel tr tyach println tych method mdy print krych
	 double res=age+salary;
	 System.out.println("result SM:"+res);
	 }
 


 
 public static double getaddi3(double age, double salary) {
	 double res=age+salary;
	 return res;
    }
 
}