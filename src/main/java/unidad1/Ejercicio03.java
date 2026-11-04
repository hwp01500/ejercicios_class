package unidad1;

public class Ejercicio03 {
    public static void main(String[] args) {
        int año = 2004;

        boolean r1 = año%4 == 0 && (año%100 != 0 || año%400 == 0);
        System.out.println(r1);
    }
}
