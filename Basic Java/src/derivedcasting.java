
class ayur
{
	long mbno;  // long is a variable of this class
	void property() {
		System.out.println("im property of mayur");
	}
	void farm() {
		System.out.println("mayur's farm");
	}
}

class malhar extends ayur{
	void property2() {
		System.out.println("im child property");
	}
}
public class derivedcasting {

	public static void main(String[] args) {
		//creating an obj for malhar
		ayur m1=new malhar();
		m1.mbno=94035145;
		m1.property();
		m1.farm();
		//m1.propert2();   qurry why not access self property
		//malhar n1=new malhar();
		//n1.property2();   // here parent access self proprty bt when obj n ref self asel tr
		
		System.out.println("******now derived/downcasting starts********");
		malhar n2=(malhar)m1;  //downcast to access specific property of child class
		n2.property2();
		n2.property();
		n2.farm();
		System.out.println("mayur mb no:"+n2.mbno);
	//  malhar ref=new ayur();  --->directly downcasting is not possible or invalid	
	}

}
/**
* child class object referred by any of its parent known as up casting

* parent class object referred by any of its child class known as downcasting
  directly downcasting is not possible in java

Child c2=new Parent();//downcasting but not possible in this way

Parent p1=new Child();

Child c1=(Child)p1;//downcasting, as Upcasting object is getting down casted here
 */
