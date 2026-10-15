package unidad3;

public class Ejercicio2 {

	public static void main(String[] args) {
		String p = IO.readln("Introduce una palabra: ");
		for (int i =p.length()-1; i>=0; i--) {
			System.out.print(p.charAt(i));
		}
	}

}
