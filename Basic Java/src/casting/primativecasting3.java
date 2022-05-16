package casting;
 
class sample
{
	void test1(double d)
	{
		System.out.println("d value="+d);
	}
	
//	void test1(int i)  //this method creat for when d =7 then o/p is 0.0
//	{                  // and we consider this method then i=7
//		System.out.println("i value="+i);    // tht is value convert first into double n then int
//	}
	
	// we creat another method with  return type
	double test1()
	{
		{
			System.out.println("running test1");
			return 4;
		}
	}	
}

public class primativecasting3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("program starts");
    sample s=new sample();
    s.test1(7);
    System.out.println("program ends");
    // hcxere creat obj for double test1 non static method
    sample d=new sample();
   // d.test1() --- wec call method like tht bt when we do narrowing explicit casting i.e.higher to lower
    int res=(int)d.test1();   //here we gives double value to int
    System.out.println("return value="+res);
	}

}
