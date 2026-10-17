import java.util.Scanner;

public class Dron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bateria inicial: ");
        int bateria = sc.nextInt();

        int minuto = 1;
        while (bateria >= 7) {
            bateria -= 7;
            System.out.println("Minuto " + minuto + " -> " + bateria + "%");
            minuto++;
        }

        sc.close();
    }
}