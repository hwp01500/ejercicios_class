package unidad2;

public class Ejercicio09 {
    public static void main(String[] args) {
        int contador = 0;
        
        int dia = Integer.parseInt(IO.readln("Introduce un número del 1 al 7(0 para salir): "));
        while (dia != 0) {
            if (dia == 0) {
                break;
            }
            
            String b = dia(dia);

            if (b.equals("Error")) {
                contador++;
                System.out.println("Numero incorrecto. ");
                System.out.println("Tienes "+ contador + " errores");
                dia = Integer.parseInt(IO.readln("Introduce un número del 1 al 7(0 para salir): "));
            }else {
                System.out.println("Dia de la semana: " + b);
                dia = Integer.parseInt(IO.readln("Introduce un número del 1 al 7(0 para salir): "));
            }

        }

        System.out.println("Total errores: " + contador);
    }

    static String dia(int a) {
        switch (a) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes"; 
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sabado";
            case 7:
                return "Domingo";   
        
            default:
                return "Error";
        }
    }
}
