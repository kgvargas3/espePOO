public class Repaso extends Vehiculo {
    public int numeroDePuertas;  // Atributo específico de la clase Auto

    public Repaso(String marca, int año, String modelo, int numeroDePuertas) {
        super(marca, año, modelo);  // Llama al constructor de la clase base
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();  // Llama al método de la clase base para mostrar detalles comunes
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}