public class Sedan extends vehiculo {
    public Sedan(String marca, String modelo) {
        super(marca, modelo);
    }
    @Override
    public void mostrarInformacion() {
        String marca = "";
        String modelo = "";
        System.out.println("Sedán: " + marca + " " + modelo);
    }
}
