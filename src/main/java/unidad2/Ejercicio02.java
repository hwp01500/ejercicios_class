package unidad2;

public class Ejercicio02 {

    public static void main(String[] args) {
        int r1 = Integer.parseInt(IO.readln("Introduce el radio 1: "));
        int r2 = Integer.parseInt(IO.readln("Introduce el radio 2: "));
        
        int suma = r1+r2;
        int resta = r1+r2;

        int d = Integer.parseInt(IO.readln("Introduce la distancia entre los centros: "));
        String r = IO.readln("1. Sumar radios; 2. restar radios: ");
   
    if (r.equals("1")) {
        if (d > suma) {
            System.out.println("Son exteriores");
                      
        } else if (d == suma) {
            System.out.println("Son tangentes exteriores");
        }else if (d < suma && d < resta) 
                System.out.println("Son secantes");
    }else if (r.equals("2")) { 
        if (d < resta) {
                System.out.println("Son interiores");
        } else if (d == resta ) {
                System.out.println("Son tangentes interiores");       
        } else if (d == 0)
            System.out.println("Son concentricas");         
        }         
    }

    
}
