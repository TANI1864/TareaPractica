abstract class Automovil extends vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidad;

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }
    @Override
    public void acelerar() {
        velocidad += 10;
        System.out.println("Acelerando... Velocidad actual: " + velocidad + " km/h");
    }
    @Override
    public void frenar() {
        velocidad -= 10;
        if (velocidad < 0) velocidad = 0;
        System.out.println("Frenando... Velocidad actual: " + velocidad + " km/h");
    }
    public abstract void mostrarInformacion();
}
