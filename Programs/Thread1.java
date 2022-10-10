package sept_12;

public class Thread1 {

	public static void main(String[] args) {

		int a[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int b[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int c[][] = new int[3][3];

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 3; i++) {
					c[0][i] = a[0][i] + b[0][1];

				}
			}

		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 3; i++) {
					c[1][i] = a[1][i] + b[1][1];

				}
			}

		};
		Thread t3 = new Thread() {
			public void run() {
				for (int i = 0; i < 3; i++) {
					c[2][i] = a[2][i] + b[2][1];

				}
			}

		};

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(" " + c[i][j]);
			}
			System.out.println("");
		}
		System.out.println("Good Bye");

	}

}
