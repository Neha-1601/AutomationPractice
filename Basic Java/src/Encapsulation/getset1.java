package Encapsulation;

class getset1 { 
	     private int a = 55;
	     private double d=88;
	          
 public int getA() {
    System.out.println("to access private var a:"+a); //55
	System.out.println("to access private var a:"+this.a);//55
	 return a;
  }
 public int getA(int a) {
	System.out.println("to access private var 'a' with use of method overloading:"+a);//11
	System.out.println("to access private var 'a' with use of method overloading:"+(this.a+a));//
	return a;
 }
 public void setA() {
	 
	 System.out.println("updated value of private var:"+this.a); 
		 
 }
public void setA(int a) {
	 
	 System.out.println("updated value of private var a:"+this.a); 
		 
 }
 public double getB() {
	  System.out.println("to aceess private var d:"+d);
	  System.out.println("to access private var 'd' with use of method overloading:"+(this.d+d));
	 return d;
 }
 public void setB(double d) {
	 System.out.println("updated value of private var d:"+d);
	 System.out.println("to access private var 'd' with use of method overloading:"+(this.d+d));
 }
 
public class getset{	     
	public void main(String[] args) {
		getset1 ref=new getset1();
		System.out.println();
		ref.getA();
		ref.setA(11);
		ref.getB();
		ref.setB(67.889);
		
}

}
}