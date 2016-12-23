package HomeWork2.phone;

/**
 * @moderator Viktor
 */
public abstract class Phone {
	
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
	private  int CountSms;
	private  int CountCalls;
	public Phone() {
		System.out.println("Phone constructor");
	}
	
	public boolean isTouch() {
		return touch;
	}
	
	public boolean isHasWifi() {
		return hasWifi;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public void call(String number) {
		System.out.println("Phone class is calling " + number);
		CountCalls++;
	}
	
	public void sendSMS(String number, String message) {

		CountSms++;
	}
	public void    GetNumberOfCallsSms(){

		System.out.println("This object have made "+CountCalls+" calls and "+CountSms+ " sms.");

	}
}
