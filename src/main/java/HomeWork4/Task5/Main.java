package HomeWork4.Task5;

public class Main {
	public static void main(String[] args) {
		Monitor m = new Monitor("c:\\1.txt", new FileEvent());
		m.start();
	}
}