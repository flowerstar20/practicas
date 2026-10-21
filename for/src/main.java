import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int puntos = 0;
        int mayorpuntos =0;
        int menorpuntos = 0;
        int totalpuntos = 0;
        for (int i = 1; i <= 7; i++){
            System.out.println("ingresa la cantidad de puntos de la partida");
            puntos = teclado.nextInt();
            if (puntos >=1000){
                System.out.println("tu partida tienes mayor de mil puntos");
                mayorpuntos = mayorpuntos + 1;
            }
            else {
                System.out.println("tu partida tienes menor de mil puntos");
                menorpuntos = menorpuntos + 1;
            }
            totalpuntos = totalpuntos +puntos;
        }
        double promedio = totalpuntos/7;
        System.out.println("total de puntos acumulados" +totalpuntos);
        System.out.println("el promedio fue" +promedio);
        System.out.println("total de partidas de mil putnos son " + mayorpuntos);
        System.out.println("total de partidas de menos de mil puntos son"+menorpuntos);
        }

    }