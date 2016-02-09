package VierGewinnt;

public class DemoApp {

	public static void main(String[] args) {

		FourWins fourWins = new FourWins(7, 5);

		fourWins.playerA(1, 2);
		System.out.println(fourWins.winner());
		fourWins.playerB(3, 1);
		System.out.println(fourWins.winner());

		fourWins.playerA(2, 2);
		System.out.println(fourWins.winner());
		fourWins.playerB(5, 1);
		System.out.println(fourWins.winner());

		fourWins.playerA(3, 2);
		System.out.println(fourWins.winner());
		fourWins.playerB(5, 2);
		System.out.println(fourWins.winner());

		fourWins.playerA(4, 2);
		System.out.println(fourWins.winner());
		fourWins.playerB(5, 3);
		System.out.println(fourWins.winner());

		fourWins.playerA(3, 1);
		System.out.println(fourWins.winner());
		fourWins.playerB(5, 4);
		System.out.println(fourWins.winner());

	}

}
