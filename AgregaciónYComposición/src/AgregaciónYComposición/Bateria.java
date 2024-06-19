package AgregaciónYComposición;
//Composición
public class Bateria {

    public Bateria(String tipoBateria, int capacidadBateria) {
    }


    //Atributos
    private String tipo;//Material
    private int capacidad;//Capacidad en mAh

    //Getters y Setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    @Override
    public String toString() {
        return "\n\tTipo: " + tipo +
                "\n\tCapacidad: " + capacidad + " mAh";
    }
}