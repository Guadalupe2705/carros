public class Carros {

    public static void main(String[] args) {

        // Autos que consumen poca gasolina (altamente eficientes)
        double consumoPrius = 26.0; // km/l
        double consumoIoniq = 24.5; // km/l
        double consumoNiro = 23.0; // km/l

        // Autos que consumen mucha gasolina (poco eficientes)
        double consumoSuburban = 5.5; // km/l
        double consumoTundra = 6.0; // km/l
        double consumoHellcat = 4.5; // km/l

        System.out.println("Evaluación de eficiencia de consumo en ciudad:");

        // Evaluar autos eficientes
        evaluarConsumo("Toyota Prius", consumoPrius);
        evaluarConsumo("Hyundai Ioniq", consumoIoniq);
        evaluarConsumo("Kia Niro", consumoNiro);

        // Evaluar autos ineficientes
        evaluarConsumo("Chevrolet Suburban", consumoSuburban);
        evaluarConsumo("Toyota Tundra", consumoTundra);
        evaluarConsumo("Dodge Challenger Hellcat", consumoHellcat);
    }

    public static void evaluarConsumo(String modelo, double consumo) {
        System.out.printf("\nModelo: %s\nConsumo en ciudad: %.1f km/l\n", modelo, consumo);

        if (consumo >= 20) {
            System.out.println("➡ Este auto es altamente eficiente en ciudad.");
        } else if (consumo >= 10) {
            System.out.println("➡ Este auto tiene eficiencia media en ciudad.");
        } else {
            System.out.println("➡ Este auto consume mucha gasolina en ciudad.");
        }
    }

}
