package operator;

public class unaryop2 {

	public static void main(String[] args) {
		int a = 47, b;
		b = a++;  //47
		System.out.println(a);// 47----48
		System.out.println(b);// 47
		int x = a; //48
		int y;
		System.out.println(x);// 48
		y = ++x; //49
		System.out.println(x);// 49
		System.out.println(y);// 49

		int p = -15, q = 25, res;
		res = p++ + --q;
		//res= -15 + 24
		System.out.println("res: " + res);//9
		System.out.println("p: " + p);// -14
		System.out.println("q: " + q);//24
		System.out.println("*****************************");
		int res1 = ++p + ++q;
		//res1=   -13 + 25
		System.out.println(res1);// 12
		System.out.println("p: " + p);// -13
		System.out.println("q: " + q);// 25

	}

}
