public class EtiquetaPaquete {

    public static void mostrarEtiqueta(String numeroGuia, String destino, double peso) {
        System.out.println("========== ETIQUETA DE PAQUETE ==========");
        System.out.println("Número de guía : " + numeroGuia);
        System.out.println("Destino        : " + destino);
        System.out.println("Peso           : " + peso + " kg");
        System.out.println("=========================================\n");
    }

    public static void main(String[] args) {

        mostrarEtiqueta("GUIA-1001", "Bogotá", 3.5);

        mostrarEtiqueta("GUIA-1002", "Medellín", 1.8);


    }
}
