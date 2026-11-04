package unidad2;

public class Ejercicio06 {
    public static void main(String[] args) {
        System.out.println(Romano(9));
    }

    static String Romano(int a) {
        switch (a) {
            case 1:
               return "I"; 
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";                        
        }
        return null;
    }
}
