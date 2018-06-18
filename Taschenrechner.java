
public class Taschenrechner {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		
		System.out.println();
		
		int zahl1 = Integer.parseInt(args[0]);
		int zahl2 = Integer.parseInt(args[2]);

		if (args[1].equals("+")) {
			System.out.println(zahl1 + zahl2);
		} else if (args[1].equals("-")) {
			System.out.println(zahl1 - zahl2);
		} else if (args[1].equals("*")) {
			System.out.println(zahl1 * zahl2);
		} else if (args[1].equals("/")) {
			System.out.println(zahl1 / zahl2);
		}

	}

}
