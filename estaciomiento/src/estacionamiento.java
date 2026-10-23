import java.util.Scanner;

public class estacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAutos = 0;
        double totalDinero = 0;
        int conDescuento = 0;
        int horas;
        double pago;

        System.out.println(" Registro de estacionamiento ");
        System.out.println("Ingresa 0 horas para terminar");

        while (true) {

            do {
                System.out.print("Horas estacionado: ");
                horas = sc.nextInt();
                if (horas < 0) {
                    System.out.println("Horas negativas no son válidas. Intenta de nuevo.");
                }
            } while (horas < 0);


            if (horas == 0) {
                break;
            }

            pago = horas * 15;
            if (horas > 5) {
                pago = pago - 10;
                conDescuento++;
            }


            System.out.println("El automóvil paga: $" + pago);
            System.out.println();

            totalAutos++;
            totalDinero += pago;
        }
        System.out.println("\n========== RESUMEN ");
        System.out.println("Total de automóviles atendidos: " + totalAutos);
        System.out.println("Total de dinero recaudado: $" + totalDinero);
        System.out.println("Automóviles con descuento: " + conDescuento);

        if (totalAutos > 0) {
            double promedio = totalDinero / totalAutos;
            System.out.printf("Promedio pagado por automóvil: $%", promedio);
        } else {
            System.out.println("No se atendió ningún automóvil.");
        }

        
    }
}