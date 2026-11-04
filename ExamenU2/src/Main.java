import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int kg = teclado.nextInt();
        int local = 12;
        int nacional = 20;
        int express = 5;
        int opcion = teclado.nextInt();
        int rechazados = 0;
        int dinero = 0;
        System.out.println("¿cual es el peso de tu pedido?");
        if (kg <= 0){
            System.out.println("no es un peso valido");
        }else {}
       for (int i = 1; i<=0; i++){
           do {
               System.out.println("paquete local");
               System.out.println("paquete nacional");
               System.out.println("paquete express");
               opcion = teclado.nextInt();
               switch (opcion){
                   case 1:
                       if (local <= 12){
                           System.out.println("tu pedido es valido");
                           dinero = 30 +8*kg;
                       }else {
                           System.out.println("tu pedido a sido rechazado");
                           rechazados = rechazados + 1;
                       }
                   case 2:
                       if (nacional <= 20){
                           System.out.println("tu paquete es valido");
                       }
               }
       } while (opcion !=4);
       }
    }
}
//gg