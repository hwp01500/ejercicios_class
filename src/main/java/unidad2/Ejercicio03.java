package unidad2;

public class Ejercicio03 {
    public static void main(String[] args) {
        System.out.println(Numero(1));
    }

    static boolean Numero(int a) {

        if (a % 2 == 0) {
            System.out.println("Es par");
            return true;
        }else {
            System.out.println("Es impar");
            return false;
        }
    }
}
