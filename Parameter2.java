
public class Parameter {

	public static void main(String[] args) {

		String Z�hlen;
		int Args = 0;
		int z�hlen = 0;
		System.out.println("Hello Wolrd");
		System.out.println("Anzahl der Parameter: " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + 1 + ".");
			Args = Integer.parseInt(args[i]);
			System.out.println("Zahl " + i + " = " + Args + "\n");
			z�hlen += Args;
		}
		if(args.length > 0) {
		System.out.print("Die Summe der Paramter: ");
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i]);
			if (i < args.length - 1) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + z�hlen);
		}else {
			System.out.println("Error: Sie haben keine Zahl eingegeben");
		}
	}

}
