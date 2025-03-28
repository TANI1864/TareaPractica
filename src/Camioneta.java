public class Camioneta extends Automovil{
    public Camioneta(String marca, String modelo) {
        super(marca, modelo);
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Camioneta: " + marca + " " + modelo);
    }

}
