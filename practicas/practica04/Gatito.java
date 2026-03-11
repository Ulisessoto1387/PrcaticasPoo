public class Gatito {
    //atributos de la clase
    String nombre, color, raza;
    static String dirección;
    String comidafv;

    public Gatito() {
        this.nombre = "MIchi";
        this.color = "Negro";
        this.raza = "Domestico";
        this.dirección = "Av Universidad";
        this.comidafv = "Pescado";
    }

    public Gatito(String nombre, String color, String raza, String dirección, String comidafv) {
        this.nombre = nombre; 
        this.color = color; 
        this.raza = raza; 
        this.dirección = dirección;
        this.comidafv = comidafv;
    }

    //Metodo
    public void comer() {
        System.out.println("Estoy comiendo......");
        System.out.println("Ñam ñam ñam.... "+this.comidafv+" ");
    }

    public static void mensaje() {
        System.out.println("Gatitos de la fi");
    }

}
