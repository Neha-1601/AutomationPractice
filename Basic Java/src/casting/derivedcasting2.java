package casting;
class JDk{
	void java11(){
		System.out.println("im os of java11");
	}
    void disp1() {
        System.out.println("im displ 1");
	}
}
class LINUX extends JDk{
	 void operatingsystem1() {
		System.out.println("im os of linux"); 
	 }
	 void disp1() {
		 System.out.println("im disp 2 ");
	 }
}
class WINDOWS extends LINUX{
	void operatingsystem2() {
		System.out.println("im os of windows");
	}
	void disp1() {
		System.out.println("im disp 3");
	}
}
public class derivedcasting2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JDk j1=new WINDOWS();  //upcasting-->child class object referred by any of its parent known as up casting
       j1.java11();
       j1.disp1();
      System.out.println("______________-_--_-_________"); 
       //now here downcasting .. i.e--> parent class object referred by any of its child class known as downcasting
 // directly downcasting is not possible in java for tht we take first child n then gives the ref of parent tht is j1 to the both child indivisully
       LINUX l1=(LINUX)j1;  // here we done downcasting
       l1.operatingsystem1();  // parent access the property of linux child
       l1.disp1();
       l1.java11();
       System.out.println("________ access the property of second child is windows");
       WINDOWS w1=(WINDOWS)j1; // adain downcasting
       w1.operatingsystem2();  //windows property
       w1.disp1();
       w1.operatingsystem1(); // linux property
       w1.disp1();
       w1.java11(); // parent self property
       // tht means when parent access lowest child property then in tht we can access all property of all members 
	}

}
