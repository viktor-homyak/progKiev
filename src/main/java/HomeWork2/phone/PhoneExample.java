package HomeWork2.phone;

/**
 * @moderator Viktor
 */
public class PhoneExample {

	public static void main(String[] args) {
		// Phone p = new Phone();
		
		Nokia3310 nokia = new Nokia3310();
		System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
		nokia.call("123-45-67");
		nokia.call("853-45-15");
		nokia.call("896-327-88");
		nokia.sendSMS("567-78-89", "text message");
		 nokia.GetNumberOfCallsSms();

		System.out.println("----------------------------------");
		
		IPhone iphone = new IPhone();
		System.out.println("IPhone screent size: " + iphone.getScreenSize());
		iphone.call("123-45-67");
		iphone.sendSMS("567-78-89", "text message");
		iphone.GetNumberOfCallsSms();
		System.out.println("----------------------------------");
		
		IPhone5 iphone5 = new IPhone5();
		System.out.println("IPhone screent size: " + iphone5.getScreenSize());
		iphone5.call("123-45-67");
		iphone5.sendSMS("567-78-89", "text message");
		iphone5.getScreenSize();
		iphone5.GetNumberOfCallsSms();
		//Домашнее задание
		System.out.println("----------------------------------");

		SamsungS4 S4 = new SamsungS4();
		System.out.println("Samsung S4 screen size: " + S4.getScreenSize());
		S4.call("123-45-67");
		S4.sendSMS("567-78-89", "text message");
		S4.GetNumberOfCallsSms();
	}
}
