package Practice;

public class Methodoverloading {

	static int zx() {
	System.out.println("no parameter");
	int num1=2,num2=4;
	System.out.println("add above 2 no.");
	 return num1+num2;
	}
	static int zx(int num1, int num2) {
	System.out.println("add num1, num2");
	return num1+num2;
	
    }

	static int zx(int num1,int num2, int num3 ) {
	System.out.println("add num 1,num2,num3");
	return num1+num2+num3;
}

	public static void main(String[] args) {
		System.out.println("sum1:"+Methodoverloading.zx());
		System.out.println("sum2:"+Methodoverloading.zx(22,55));
		System.out.println("sum3:"+Methodoverloading.zx(11,44,66));
}
	}