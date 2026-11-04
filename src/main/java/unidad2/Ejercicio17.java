package unidad2;

import java.util.Random;

public class Ejercicio17 {
    public static void main(String[] args) {
        Random r = new Random();

        int n = r.nextInt(100000 - 1000) + 1;
        int a = Integer.parseInt(IO.readln("He pensado un numero entre 1 y 100000, adivina cual es: "));
        int contador = 0;

        while (true) {
            while (a != n) {
                if (a < n) {
                    a = Integer.parseInt(IO.readln("El número introducido es menor a la respuesta, vuelve a intentarlo: "));
                    contador ++;
                } else
                    a = Integer.parseInt(IO.readln("el número introducido es mayor a la respuesta, vuelve a intentarlo: "));
                    contador++;
                } 
                    System.out.println("Felicidades, has ganado, tuviste " + contador + " intentos");
                    String s = IO.readln("¿Deseas volver a jugar? ");
                if (s.equals("no"))
                    break;
                if (s.equals("si")) 
                    a = Integer.parseInt(IO.readln("He pensado un numero entre 1 y 100000, adivina cual es: "));
            }
        }
    }