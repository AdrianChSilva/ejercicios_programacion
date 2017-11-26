
public class Ejercicio12_T06 {
  public static void main(String[] args) throws InterruptedException {
	for (long i = 0; i < 6000000; i++) {
		System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
		Thread.sleep(20);
	}
    }


	}

