package condition;

public class leafyr {

	public static void main(String[] args) {
		int year=2021;  //if yr=2020 then its leaf yr
		if ((year%4==0)) { // 2021 is non leaf yr
			System.out.println("leaf year");
		}
		else {
			System.out.println("non leaf yr");
		}
		
		int year2=2024;
		if((year2%4==0) && (year2%100!=0) || (year2%400==0)) {
			System.out.println("leaf yr");
		}
		else {
			System.out.println("non leaf yr");
		}
		if (((year2 % 4 == 0) && (year2 % 100 == 0)) || (year2 % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR or NON LEAP YEAR");
		}
		//leafyr.checkleafyr(2028); tht SM we can call as tht line26
		System.out.println("given yr is leaf yr or not:"+leafyr.checkleafyr(2028));  // also call like tht
		System.out.println("given yr is leaf yr or not:"+leafyr.checkleafyr(2010));
}
	// OR we can aslo declared satic method in tht progrm n check yr
   static boolean checkleafyr(int yr) {  // this static method call into main method
	   if((yr%4==0) && (yr%100!=0) || (yr%400==0)) {
		   System.out.println("L Y");
		   return true;
		   }
	   else {
		   System.out.println("no");
		   return false;
	   }
   }
}
