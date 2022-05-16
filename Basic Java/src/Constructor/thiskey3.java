package Constructor;

class a { 
	void m() {  //nsm
		System.out.println("hello m");
	}
	void n() { //nsm
		System.out.println("hello n");
		this.m();  // bu using "this" keyword we can aslo access other nonstatic member of class then here we cons call m()
	// m();  // or as pn lihu shkto
		}
class thiskey3{ 
	void method1() {
		System.out.println("method1");
	}
	void method2() {
		System.out.println("method2");
	}
}
	public static void main(String[] args) {
		a ref=new a();
		ref.m();
		//thiskey3 obj=new thiskey3();
		//obj.method2();

	}

}
