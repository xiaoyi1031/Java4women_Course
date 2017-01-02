
public class main {

	public static void main(String[] args) {
		System.out.println("start");
		NumbersTask task = new NumbersTask();
		
		Thread numberThread = new Thread(task);
		numberThread.start();
		Thread number2Thread = new Thread(task);
		number2Thread.start();
		
		System.out.println("finish");

	}

}
