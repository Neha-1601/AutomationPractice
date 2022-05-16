package Encapsulation;
 
class harshal{
	  private int a  = 55;// this r private var means tht r access within the class only
	  private double d=88;//
   // then to access private var into other class then we use getter n setter concept
public int get1() { // here we apply gettter cocept to the class then following roles follow---
	               // 1. public method declared   2.return type of this method base on private variable  
	 return a;     //3.it should be return priv ate var.
 }

public double get2() {  // here, we declared public method for private var double
	  
	 return d;
 }
//for update private variable then we apply setter concept.. ROLES FOR THT----
public void set1(int a) { //1. public method declared  2.return type of this method 'void'
	this.a=a;  // 3. parameter of tht method setter method should be same as private vari.
	
}
public void set2(double d) {
    this.d=d; // here gives local var value to global var
}
}
public class getset2 {

	public static void main(String[] args) {
		harshal pp=new harshal();
		//pp.get1();  // harshl says return type mdy call krych nhi, println statement mdy call krto .. as given below statement
		//pp.get2();//correct sir also says like harshl
	System.out.println("to access var 'a':"+pp.get1());/// thts here....
	System.out.println("to access var 'd':"+pp.get2());
		pp.set1(4);   // setter updated value i.e LOCAL value(4)
		pp.set2(44.77);// setter updated value i.e LOCAL value(44.77)
	System.out.println("to access var 'a':"+pp.get1());   // always access with "getter method"
	System.out.println("to access var 'd':"+pp.get2());
	}
}

