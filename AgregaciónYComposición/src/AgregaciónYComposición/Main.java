package AgregaciónYComposición;
public class Main {

    public static void main(String[] args) {
        //Instanciar chips
        Chip[] chips = new Chip[2];
        chips[0] = new Chip();
        chips[0].setOperadora("Tuenti");
        chips[0].setNumero("0995925663");
        chips[1] = new Chip();
        chips[1].setOperadora("Cnt");
        chips[1].setNumero("0978932407");
        //Instanciar celular        
        Celular celular = new Celular();
        celular.setMarca("Samsung");
        celular.setModelo("Galaxy S23");
        celular.setChips(chips);
        celular.setBateria("Litio", 3400);
    
        //Invocar relaciones
        System.out.println(celular);
        
    } 
}
