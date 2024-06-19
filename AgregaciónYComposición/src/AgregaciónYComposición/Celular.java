package AgregaciónYComposición;
import java.util.Arrays;
public class Celular {
    //Atributos
    private String marca;
    private String modelo;
    private Chip[] chips;//Relación de agregación con la Clase Chip
    private Bateria bateria;//Relación de composición con la Clase Batería
    //Constructor
     //Instanciar bateria 
      
    //Getters y Setters        
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }   
    public Chip[] getChips() {
        return chips;
    }
    public void setChips(Chip[] chips) {
        this.chips = chips;
    }   
    public Bateria getBateria() {
        return bateria;
    }
    public void setBateria(String tipoBateria, int capacidadBateria) {
        this.bateria = new Bateria(tipoBateria, capacidadBateria);

    }  
    
        
    @Override
    public String toString() {
        return "CARACTERISTICAS CELULAR" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nChips: " + Arrays.toString(chips) +
                "\nBateria: " + bateria;
    }
}
