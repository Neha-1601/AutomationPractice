package casting;
class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune {
	void Kurla() {
		System.out.println("You are in Kurla");
	}
}
public class upcasting extends Mumbai{
	void myCity() {
		System.out.println("You in city");
	}
	public static void main(String[] args) {
		
		upcasting u1=new upcasting();
		Mumbai m1=new upcasting();//auto upcasting or implicit upcasting ie done by java compilere 
		Mumbai m2=u1;//auto upcasting or implicit upcasting
		Pune p1=new upcasting();//auto upcasting or implicit upcasting
		Pune p2=u1;//auto upcasting or implicit upcasting
		
		Mumbai m3=(Mumbai)new upcasting();//explicit upcasting
		Mumbai m4=(Mumbai)u1;//explicit upcasting
		Pune p3=(Pune)new upcasting();//explicit upcasting
		Pune p4=(Pune)u1;//explicit upcasting
		
		
		Pune p5=new Mumbai();//implicit upcasting
		Pune p6=(Pune)new Mumbai();//explicit upcasting
	}

}
