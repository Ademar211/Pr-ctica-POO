package Ejercicio4;

public class SensorTemperatura extends Sensor implements Calibrable {
    private double temperatura;

    public SensorTemperatura(String id, String ubicacion, double temperatura) {
        super(id, ubicacion);
        this.temperatura = temperatura;
    }

    @Override
    public String leer() {
        return "Temperatura: " + temperatura + " °C";
    }

    @Override
    public void calibrar(double ajuste) {
        temperatura += ajuste;
    }
}
