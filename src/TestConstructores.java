public class TestConstructores {
    public static void main(String[] args) {
        // Alien con tamaño dentro del rango (15 cm)
        Alien a1 = new Alien(15, "Verde");
        System.out.println("--- Prueba 1: Datos válidos ---");
        a1.imprimir();

        // Alien con tamaño excedido (50 cm) - Debe ajustarse a 30 cm
        Alien a2 = new Alien(50, "Rojo");
        System.out.println("\n--- Prueba 2: Tamaño excedido (Ajuste a 30) ---");
        a2.imprimir();

        // Alien con tamaño insuficiente (2 cm) - Debe ajustarse a 5 cm
        Alien a3 = new Alien(2, "Azul");
        System.out.println("\n--- Prueba 3: Tamaño insuficiente (Ajuste a 5) ---");
        a3.imprimir();
    }
}