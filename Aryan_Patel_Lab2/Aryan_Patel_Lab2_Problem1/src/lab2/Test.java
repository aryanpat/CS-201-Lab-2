package lab2;

public class Test {

public static void main(String[] args) {
		
	Date cs201day = new Date(8, 21, 2022);
	System.out.println("CS201 first day is : " + cs201day);
	
	
	//cs201day.setDate(cs201Bday.getYear());
	//cs201day.setDate(cs201Bday.getDay());
	//cs201day.setDate(cs201Bday.getMonth());
	
	System.out.println("Today is : " + cs201day);
	
	Date xmas1 = new Date(12, 25, 2022);
	System.out.println( "Christmas Day this year is " + xmas1.toString());
	Date xmas2 = xmas1;
	System.out.println(xmas2);
	xmas1.setDate(xmas1.getMonth(), xmas1.getDay(), 2021);
	System.out.println(xmas2);

	}

}
