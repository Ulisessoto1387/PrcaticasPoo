public class Pumabus {

    //Atributos privados
    private int capacidad; 
    private String estado; 
    private int tipoDeServicio; 

    //Constructor por referencia 
    public Pumabus(int capacidad, String estado, int tipoDeServicio){
        this.capacidad = capacidad; 
        this.estado = estado; 
        this.tipoDeServicio = tipoDeServicio; 
    } 

    //constructor por default
    public Pumabus(){
        capacidad = 100; 
        estado = "perfecto"; 
        tipoDeServicio = 1; 
    }

    //Set y Get de los atributos privados 
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad; 
    }
    public int getCapacidad(){
        return capacidad; 
    }

    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }

    public void setTipoDeServicio(int tipoDeServicio){
        this.tipoDeServicio = tipoDeServicio; 
    }
    public int getTipoDeServicio(){
        return tipoDeServicio;
    }


}