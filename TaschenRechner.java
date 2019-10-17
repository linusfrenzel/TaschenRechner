class TaschenRechner {
	public static void main(String[] args) {

		int zahl1 = 36;
		int zahl2 = 2;
		int addieren = zahl1 + zahl2;
		int subtrahieren = zahl1 - zahl2;
		int multiplizieren = zahl1 * zahl2;
		int dividieren = zahl1 / zahl2;
		int rest = zahl1 % zahl2;
		double wurzel = Math.sqrt(zahl1);
		double quadrieren = Math.pow(zahl2,2);

		System.out.println("Erste Zahl: " + zahl1);
		System.out.println("Zweite zahl2");
		System.out.println("#################");
		System.out.println("Ergebnisse: ");
		System.out.println("36 + 2 = " + addieren);
		System.out.println("36 - 2 = " + subtrahieren);
		System.out.println("36 * 2 = " + multiplizieren);
		System.out.println("36 / 2 = " + dividieren);
		System.out.println("36 % 2 = " + rest);
		System.out.println("Wurzel aus 36 = " + wurzel);
		System.out.println("2 quadrieren = " + quadrieren);
		
	}
}
