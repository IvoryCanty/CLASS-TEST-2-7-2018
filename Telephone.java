import java.util.scanner;
public class Telephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Phone phone1 = new Phone ("Android", "Galaxy Note 8", 2017, 150);
	Phone phone2 = new Phone ("Apple", "iphone 8", 2017, 187);
	Phone phone3 = new Phone ("Samsung", "Galaxy Edge", 2018, 750);
	System.out.println(Phone1.Brand+"" + phone1.PhoneName + "" + phone1.YearReleased);
	System.out.println(Phone2.Brand+"" + phone2.PhoneName + "" + phone2.YearReleased);
	System.out.println(Phone3.Brand+"" + phone3.PhoneName + "" + phone3.YearReleased);
	Scanner scan = new Scanner (System.in);
	System.out.println("What phone would you like to buy?");
	}

}
