public class Alien {
    private int tamanio;
    private String color;
    private int numeroOjos;
    private int numeroBrazos;
    private int numeroPies;
    private double precioExtremidad;
    private double precioOjo;
    private double precioCuerpo;
    private double precioTotal;

    public Alien(int tamanio, String color) {
        if (tamanio < 5) {
            this.tamanio = 5;
        } else if (tamanio > 30) {
            this.tamanio = 30;
        } else {
            this.tamanio = tamanio;
        }
        
        this.color = color;
        this.precioCuerpo = this.tamanio * 0.20;
        this.precioExtremidad = this.tamanio * 0.10;
        this.precioOjo = this.tamanio * 0.05;
        this.numeroOjos = 0;
        this.numeroBrazos = 0;
        this.numeroPies = 0;
        this.precioTotal = 0;
        
        calcularPrecioTotal();
    }

    public int getTamanio() { return tamanio; }
    public String getColor() { return color; }
    public int getNumeroOjos() { return numeroOjos; }
    public int getNumeroBrazos() { return numeroBrazos; }
    public int getNumeroPies() { return numeroPies; }
    public double getPrecioExtremidad() { return precioExtremidad; }
    public double getPrecioOjo() { return precioOjo; }
    public double getPrecioCuerpo() { return precioCuerpo; }
    public double getPrecioTotal() { return precioTotal; }

    public void imprimir() {
        System.out.println("Alien [Tamaño: " + tamanio + ", Color: " + color + 
                           ", Ojos: " + numeroOjos + ", Brazos: " + numeroBrazos + 
                           ", Pies: " + numeroPies + ", Precio Total: $" + precioTotal + "]");
    }

    public boolean agregarBrazos(int cantidad) {
        if ((this.numeroBrazos + this.numeroPies + cantidad) <= 10) {
            this.numeroBrazos += cantidad;
            calcularPrecioTotal();
            return true;
        }
        return false;
    }

    public boolean agregarPiernas(int cantidad) {
        if ((this.numeroBrazos + this.numeroPies + cantidad) <= 10) {
            this.numeroPies += cantidad;
            calcularPrecioTotal();
            return true;
        }
        return false;
    }

    public boolean agregarOjos(int cantidad) {
        int maxOjos = 0;
        if (tamanio >= 5 && tamanio <= 10) maxOjos = 3;
        else if (tamanio > 10 && tamanio <= 20) maxOjos = 5;
        else if (tamanio > 20 && tamanio <= 30) maxOjos = 7;

        if (cantidad <= maxOjos) {
            this.numeroOjos = cantidad;
            calcularPrecioTotal();
            return true;
        }
        return false;
    }

    private void calcularPrecioTotal() {
        int totalExtremidades = numeroBrazos + numeroPies;
        this.precioTotal = precioCuerpo + 
                           (totalExtremidades * precioExtremidad) + 
                           (numeroOjos * precioOjo);
    }
}