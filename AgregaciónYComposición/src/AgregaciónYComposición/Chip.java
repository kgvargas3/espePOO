package AgregaciónYComposición;
//Agregación
public class Chip {
    //Atributos
    private String operadora;
    private String numero;
    //Getters y Setters
    public String getOperadora() {
        return operadora;
    }
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }    
    @Override
    public String toString() {
        return "\n\tOperadora: " + operadora +
                "\n\tNumero: " + numero;
    }  
}