package futbol;

public class Portero extends Futbolista implements Comparable<Portero>{

    public short golesRecibidos;
    public byte dorsal;


    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public String toString(){
        return "El futbolista"+this.getNombre()+
                "tiene"+this.getEdad()+
                ",y juega de"+this.getPosicion()+
                "con el dorsal"+this.dorsal+
                ".Le han marcado"+this.golesRecibidos;
    }

    public int compareTo(Portero o) {
        return Math.abs(this.golesRecibidos-o.golesRecibidos);
    }

}
