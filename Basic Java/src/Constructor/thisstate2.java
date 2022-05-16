package Constructor;

public class thisstate2 {
	thisstate2()
	{
		System.out.println("******Zero-Param*********");
	}
	thisstate2(int age)
	{
		this();
		System.out.println("******int-Param*********");
	}
	thisstate2(char c, double d)
	{
		this(25);
		System.out.println("******char-double-Param*********");
	}
	public static void main(String[] args) {
		thisstate2 t3=new thisstate2('c',25.36);
	}
}
  // chain of constructor calling