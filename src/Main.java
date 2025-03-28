//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {

        Sedan miSedan = new Sedan("Toyota", "Corolla");
        Camioneta miCamioneta = new Camioneta("Ford", "Ranger");

        miSedan.mostrarInformacion();
        miSedan.acelerar();
        miSedan.frenar();

        System.out.println();

        miCamioneta.mostrarInformacion();
        miCamioneta.acelerar();
        miCamioneta.frenar();

    }
}