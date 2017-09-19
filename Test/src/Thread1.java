import java.util.Objects;
import java.util.function.Function;

public class Thread1 {
	static int i;

	public Thread1() {
		i = 1;
	}

	public Thread1(int i) {
		this.i = this.i * i;
	}

	public static void main(String[] args) {
		
		/*
		  Thread th=new Thread(()-> System.out.println("dfjhgd")); th.start();
		  System.out.println("in main");
		 */

		int n = 3;
		Thread1 t;
		if (n == 0) {
			t = new Thread1();
		} else {
			t = new Thread1();
			for (int i = 1; i <= n; i++) {
				t = new Thread1(i);
			}
		}
		System.out.println(i);

	}

}
