
package Practice;

public class Neha1 {
    static int empID=123;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int age=30;
      System.out.println("age:"+age);
      age=40;
      System.out.println("updated age:"+age);
      System.out.println("empID:"+empID); //direct way to access SGV
      System.out.println("empID:"+Neha1.empID);
      Neha1.empID=456;
      System.out.println("updated SGV:"+empID);
	}

}
