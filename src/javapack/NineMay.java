package javapack;

class NumberProcessor{
	
	void printNumbers(int n) {
		System.out.println("Counting up");
		for (int i=1 ; i<=n ; i=i+1) {
			System.out.println(i);
		}
	}
	
	void countDown(int n) {
		System.out.println("Counting down");
		while (n>=1) {
			System.out.println(n);
			n = n-1;
		}
	}
	
}

public class NineMay {
	public static void main(String[] args) {
		NumberProcessor x = new NumberProcessor();
		System.out.println("_".repeat(15));
		x.printNumbers(5);
		System.out.println("_".repeat(15));
		x.countDown(5);
		System.out.println("_".repeat(15));
		
		
	}

}
