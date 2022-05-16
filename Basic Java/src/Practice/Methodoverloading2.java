package Practice;

public class Methodoverloading2 {

	public static void main(String[] args) {
		// creat obj for nsm overloading
		Methodoverloading2 abc=new Methodoverloading2();
		abc.rucha();
		abc.rucha(44,44999);
        abc.rucha('p');
        abc.gaurang(999,88);
        System.out.println("addition of gaurang int:"+abc.gaurang(999,88));
        abc.gaurang(346,7799);
        System.out.println("substraction of gaurang double:"+abc.gaurang(346,7799));
	}
 
	void rucha() { //nsm overloading
  	  System.out.println("no paramet");
   }
  void rucha(int age,double salary) {  // rucha over
	  double res=age+salary;
	  System.out.println("add result:"+res);
  }
  void rucha(char p) {  // rucha over
	  System.out.println("show char:"+p);   
  }
  int gaurang(int num1,int num2) {  // nsm gaurang overloading yasathi pn rucha cha kelela obj creat kela refer line no11
	   return num1+num2;
  }
  double gaurang(double var1,double var2) { // gaurang overloading same as above line referline                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               no 11
	  var1=80;
	  var2=5000;
	 return var1-var2;
  }
  
}