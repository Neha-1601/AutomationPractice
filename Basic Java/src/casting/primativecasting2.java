package casting;

public class primativecasting2 {

	public static void main(String[] args) {
		int salary=30000;
		/* explicit widening*/
       long l=(long)salary;
       float f=(float)salary;
       double d=(double)salary;
     
       System.out.println("*********** explicit widening ***********");
	   System.out.println("salary: "+salary+"\nl: "+l+"\nf :"+f+"\nd"+d);
		
	   System.out.println("*********** implicit widening ***********");
		/* implicit widening or auto-widening*/
		double d2=salary;
		float f2=salary;
		System.out.println("d2: "+d2+"\nf2: "+f2);
       
        double quality=34567.890d;
        //explicit norrowing--- higher to lower
        float fees=(float)quality;
        long distance=(long)quality;
        int age=(int)quality;
        short limit=(short)quality;
        byte code=(byte)quality;
        System.out.println("*********** explicit narrowing ***********");
		System.out.println("quality:"+ quality +"\nfees: "+ fees+"\ndistance:"+distance+"\nage:"+age+"\nlimit:"+limit+"\ncode:"+code);
		/*implicit narrowing not possible*/
//		int salaryInt2=salaryDb;
//		float salartFt2=salaryDb;

        
        
	}

}
