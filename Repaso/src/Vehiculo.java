public class Vehiculo {
    public String marca;
    public int año;
    public String modelo;  // Atributo privado con métodos getter y setter

    public Vehiculo(String marca, int año, String modelo) {
        this.marca = marca;
        this.año = año;
        this.modelo = modelo;
    }

        public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Año: " + año + ", Modelo: " + modelo);
    }
}
