package HomeWork4.Task4;

public class Main {
	public static void main(String[] args) {
//		Monitor m = new Monitor("c:\\1.txt", new FileEvent());
//		m.start();

   Monitor [] arr = new Monitor[3];
		arr[0] = new Monitor("c:\\1.txt", new FileEvent());
		arr[1] = new Monitor("c:\\2.txt", new FileEvent());
		arr[2] = new Monitor("c:\\3.txt", new FileEvent());
		new MonitorArray(arr);
	}
}