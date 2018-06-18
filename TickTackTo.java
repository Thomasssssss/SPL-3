
public class TickTackTo {

	public static void main(String[] args) {

		String[][] tick = new String[3][3];
		String s1 = "x";
		String s2 = "o";

		for (int i = 0; i < 3; i++) {

			for (int o = 0; o < 3; o++) {
				int zahl = (int) (Math.random() * 2) + 1;
				if (zahl == 1) {
					tick[i][o] = s1;
				} else if (zahl == 2) {
					tick[i][o] = s2;
				}
				System.out.print(tick[i][o] +" ");
			}
			System.out.println();
		}
		
		if(tick[0][0].equals("x") && tick[1][1].equals("x") && tick[2][2].equals("x")) {
			System.out.println("Spieler 1 Gewinnt");
		}
		if(tick[0][0].equals("x") && tick[0][1].equals("x") && tick[0][2].equals("x")) {
			System.out.println("Spieler 1 Gewinnt");
		}
		if(tick[1][0].equals("x") && tick[1][1].equals("x") && tick[1][2].equals("x")) {
			System.out.println("Spieler 1 Gewinnt");
		}
		if(tick[2][0].equals("x") && tick[2][1].equals("x") && tick[2][2].equals("x")) {
			System.out.println("Spieler 1 Gewinnt");
		}
		if(tick[0][0].equals("x") && tick[1][0].equals("x") && tick[2][0].equals("x")) {
			System.out.println("Spieler 1 Gewinnt");
		}
		if(tick[0][1].equals("x") && tick[1][1].equals("x") && tick[2][1].equals("x")) {
			System.out.println("Spieler 1 Gewinnt");
		}
		if(tick[0][2].equals("x") && tick[1][2].equals("x") && tick[2][2].equals("x")) {
			System.out.println("Spieler 1 Gewinnt");
		}
		if(tick[0][2].equals("x") && tick[1][1].equals("x") && tick[2][0].equals("x")) {
			System.out.println("Spieler 1 Gewinnt");
		}
		
		if(tick[0][0].equals("o") && tick[1][1].equals("o") && tick[2][2].equals("o")) {
			System.out.println("Spieler 2 Gewinnt");
		}
		if(tick[0][0].equals("o") && tick[0][1].equals("o") && tick[0][2].equals("o")) {
			System.out.println("Spieler 2 Gewinnt");
		}
		if(tick[1][0].equals("o") && tick[1][1].equals("o") && tick[1][2].equals("o")) {
			System.out.println("Spieler 2 Gewinnt");
		}
		if(tick[2][0].equals("o") && tick[2][1].equals("o") && tick[2][2].equals("o")) {
			System.out.println("Spieler 2 Gewinnt");
		}
		if(tick[0][0].equals("o") && tick[1][0].equals("o") && tick[2][0].equals("o")) {
			System.out.println("Spieler 2 Gewinnt");
		}
		if(tick[0][1].equals("o") && tick[1][1].equals("o") && tick[2][1].equals("o")) {
			System.out.println("Spieler 2 Gewinnt");
		}
		if(tick[0][2].equals("o") && tick[1][2].equals("o") && tick[2][2].equals("o")) {
			System.out.println("Spieler 2 Gewinnt");
		}
		if(tick[0][2].equals("o") && tick[1][1].equals("o") && tick[2][0].equals("o")) {
			System.out.println("Spieler 2 Gewinnt");
		}

	}

}
