package Practice;

public class Neha {
    static int empId=123;
    public static void main(String[] args) {
		int age=27; //empId=456;
	System.out.println("local var, age:"+age);
	System.out.println("local var, id:"+empId);
	System.out.println("std way to access SGV,empid:"+Neha.empId);
	System.out.println("direct way to access SGV,empid:"+empId);
	age=37;
	System.out.println("updated local var, age:"+age);
	Neha.empId=000;
	System.out.println("updated,id:"+empId);
	

	}

}

