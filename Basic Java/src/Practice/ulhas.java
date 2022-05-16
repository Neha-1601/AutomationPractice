package Practice;

class mayur {
        int age=28;
        double salary=80000.00;
  mayur(int a) {
  int id=77;
      System.out.println("i am 1st constructor of mayur class");
	  System.out.println(id);
	  System.out.println(this.age);
}
  void callme() {
		System.out.println("i am display method from mayur class with no parameter");
		System.out.println(age);
		System.out.println(salary);

	}
  void callme(int a) {
		double age = 30.55;
		System.out.println("i am display method from mayur class with parameter");
		System.out.println(age);
		System.out.println(this.age);
  }
 }
class neha extends mayur{
     int age=26;
     double salary=60000.00;
  neha(int a)    {
	  super(22);
	  a=1;
	  int id=11;
      System.out.println("i am 1st constructor of neha class");
  }  
      void callme () {
  		super.callme();
  		System.out.println("i am display method from neha class with no parameter");

  		System.out.println("current class age:- " + age);
  		System.out.println("current class empid:- " + salary);

  		System.out.println("parent class age:- " + super.age);
  		System.out.println("parent class empid:- " + super.salary);

  	}

  	void callme(double b) {

  		super.callme(22);
  		// System.out.println("i am display method from Employee class");

  		// System.out.println(age);
  		System.out.println(this.age);
  		System.out.println(super.age);
  	
	}

}
class shivansh {
    int age=2;
    double salary=0000.00;
    
shivansh(int a) {
int id=11;
  System.out.println("i am 1st constructor of shivansh class");
  System.out.println(id);
  System.out.println(this.age);




}





public class ulhas {

	public static void main(String[] args) {
	   mayur M1= new mayur();
	   M1 callme(44);
	   M1 callme(); 
	   System.out.println("....");
		neha N1= new neha();
		N1 callme(66);
		N1 callme(77);
    shivansh S1= new shivansh();
		

	}

}
