import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GameOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value for player 1");
		ArrayList<Integer> alice = new ArrayList<Integer>();
		alice.add(sc.nextInt());
		alice.add(sc.nextInt());
		alice.add(sc.nextInt());

		System.out.println("Enter value for player 2");
		ArrayList<Integer> bob = new ArrayList<Integer>();
		bob.add(sc.nextInt());
		bob.add(sc.nextInt());
		bob.add(sc.nextInt());
		
		getScore(alice, bob);

	}

	public static void getScore(ArrayList<Integer> a, ArrayList<Integer> b) {

		int aliceScore = 0;
		int bobScore = 0;

		for (int i = 0; i < 3; i++) {
			if (a.get(i) > b.get(i)) {
				aliceScore++;
			}

			if (a.get(i) < b.get(i)) {
				bobScore++;
			}

		}
		ArrayList<Integer> Score = new ArrayList<Integer>();
		Score.add(aliceScore);
		Score.add(bobScore);

		System.out.println(Score);
	}

}
