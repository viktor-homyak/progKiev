
package HomeWork2.phone;



/**
 * @author Viktor.
 */
public class SamsungS4 extends Phone {

	public SamsungS4() {
		System.out.println("SamsungS4 constructor");

		touch = true;
		hasWifi = true;
		screenSize = 5;
	}

	@Override
	public void sendSMS(String number, String message) {
		super.sendSMS( number,  message);
		System.out.println("SamsungS4 class is sending sms " + message + " to " + number);
		System.out.println("Hello");
	}

}