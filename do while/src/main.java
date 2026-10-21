
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int puntos = 100;
        int opcion;

        do {
            System.out.println("~~~BIENVENIDO~~~");
            System.out.println("1.- Obtener 20 puntos");
            System.out.println("2.- Gastar 15 puntos");
            System.out.println("3.- Consultar puntos");
            System.out.println("4.- Salir");
            System.out.println("Elige una opcion");

            opcion = Teclado.nextInt();

            switch (opcion) {
                case 1:
                    puntos = puntos + 20;
                    System.out.println("GANASTE 20 PUNTOS");
                    break;

                case 2:
                    if (puntos >= 15) {
                        puntos = puntos - 15;
                        System.out.println("GASTASTE 15 PUNTOS");
                    } else {
                        System.out.println("NO TIENES SUFICIENTES PUNTOS");
                    }
                    break;

                case 3:
                    System.out.println("TIENES " + puntos + " PUNTOS");
                    break;

                case 4:
                    System.out.println("SALIENDO...");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 4);

        System.out.println("Puntos finales: " + puntos);
        Teclado.close();
    }
}
