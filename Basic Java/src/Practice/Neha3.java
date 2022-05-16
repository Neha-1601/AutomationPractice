package Practice;

public class Neha3 {
    int empID=33; //non static global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Neha3 M1;
		M1=new Neha3(); // to creat Object for non static global variable
    System.out.println("to access NSGV,empID:"+M1.empID);
    	M1.empID=44;
    System.out.println("updated NSGV,empID:"+M1.empID);
        Neha3 M2;
        M2=new Neha3(); // creating again new instance.. as tht type we creat multiple obj..in class
    System.out.println("NSGV empid with  M2 ref:"+M1.empID);
        
	}

}
