package Constructor;
 class A{
	 int i;
	 A (){
		 System.out.println("show class A");
		 i=77;
	 }
	 void display() {  // optoinal
		 System.out.println("im display method of class A");
	 }
 }
 class B{
	 int j;
	 B(){
		 System.out.println("show class B");
		 j=99;
	 }
	 void display() {  // optinal
		 System.out.println("im display method of class B");
	 }
 }
public class cons8 {

	public static void main(String[] args) {
		A ss=new A();
		ss.display();
		System.out.println("i:"+ss.i);
		
		B nn=new B();
		nn.display();
		System.out.println("j:"+nn.j);

	}

}
