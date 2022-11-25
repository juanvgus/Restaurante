package modelo.comida;

public abstract class Component {

    private String nombre;
    private int valor;

    public Component(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    abstract  public int getCosto();
    abstract  public void imprimir();

}
