public class MyRandom {

	public static long random = 0;

	public static void main(String[] args) throws InterruptedException {
		calculateRandom();
		System.out.println("Random Value: " + random);
	}
	
	private static void calculateRandom() throws InterruptedException {
		Neuron first = new Neuron();
		Neuron second = new Neuron();
		
		first.start();	second.start();
		first.join();	second.join();
		
		random %= 100;
	}
}

class Neuron extends Thread {
	
	private static final int BASE = 100000;

	public void run() {
		for (int j = 0; j < BASE; j++)
			MyRandom.random++;
	}
}