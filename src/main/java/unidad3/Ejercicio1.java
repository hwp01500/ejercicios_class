package unidad3;

public class Ejercicio1 {

	public static void main(String[] args) {
		String p = IO.readln("Introduce una palabra: ");
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		for (int j = 0;j<p.length(); j++) {
			char c = p.toLowerCase().charAt(j);
			switch (c) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
			}
		}
		System.out.println("Número de aes: " + a);
		System.out.println("Número de ees: " + e);
		System.out.println("Número de íes: " + i);
		System.out.println("Número de oes: " + o);
		System.out.println("Número de ues: " + u);
	}

}
