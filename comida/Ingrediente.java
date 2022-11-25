package modelo.comida;

import modelo.comida.Component;

public class Ingrediente extends Component {

    public Ingrediente(String nombre, int costo) {
        super(nombre, costo);
    }

    @Override
    public int getCosto() {
        return 0;
    }

    @Override
    public void imprimir() {

    }
}
