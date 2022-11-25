package modelo.comida;

import java.util.ArrayList;

public class Comida extends Component {

    public ArrayList<Component> comida = new ArrayList<>();
    private String nombre;

    public void setNombreComida(String nombre){
        this.nombre = nombre;
    }

    public String getNombreComida(){
        return this.nombre;
    }

    public Comida() {
        super("",0);
    }

    @Override
    public int getCosto() {

        return comida.stream().mapToInt(Component::getValor).sum();
    }

    @Override
    public void imprimir() {
        comida.stream().forEach(p->{
            System.out.println(p.getNombre());
        });
    }

    @Override
    public String toString() {
        return "\n" + nombre + " " + getCosto();
    }
}
