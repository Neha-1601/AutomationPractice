package Practice;

public class Inharitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package Practice;

		class company {
			// globle variable
			int empid=123;
			double age = 26.00;

			company() {
//				this(22);
				System.out.println("i am 1st Constructor of company class");

			}

			company(int a) {
			
				int empid = 15;
				System.out.println("i am 2nd constructor of company class");
				System.out.println(empid);
				System.out.println(this.age);

			}

			void callme() {
				
				System.out.println("i am display method from company class");
			}

			void callme(int a) {
				double age = 25.55;
				System.out.println("i am display method from companay class");
				System.out.println(age);
				System.out.println(this.age);

			}
		}

		class employee extends company {
			int empid=456;
			double age =25.00;

			employee() {
		       super();
				System.out.println("i am 1st constructor of employee class ....");
			}

			employee(int a) {
				super(22);
				a = 15;
				System.out.println("i am 2st constructor");
			}

			void callme() {
				System.out.println("i am display method from employee class");
				super.callme();
				System.out.println(age);
				System.out.println(empid);
				
				System.out.println(super.age);
				System.out.println(super.empid);
				
			}

			void callme(double b) {
				

				System.out.println("i am display method from Employee class");
				super.callme();
				//System.out.println(age);
				System.out.println(this.age);
				System.out.println(super.age);
			}

		}


		public class Inharitance {

			public static void main(String[] args) {

				employee M1 = new employee();
				M1.callme(20);
				M1.callme();
				System.out.println("-----------------------------------------");

				company C1 = new employee();
				C1.callme(22);
				C1.callme();

				System.out.println("-------------------------------------------");
				
			}

		}
	}

}
