package unidad1;

public class Ejercicio14 {
    public static void main(String[] args) {
        double r = 6371.01;
        double lat1 = Double.parseDouble(IO.readln("Introduce la latitud 1: "));
        double lon1 = Double.parseDouble(IO.readln("Introduce la longitud 1: "));

        double lat2 = Double.parseDouble(IO.readln("Introduce la latitud 2: "));
        double lon2 = Double.parseDouble(IO.readln("Introduce la longitud 2: "));

        double d = r * Math.toRadians(Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2)*Math.cos(lon2-lon1)));

        System.out.printf("%.2f", d);
    }
}
