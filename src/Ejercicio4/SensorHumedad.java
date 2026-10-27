package Ejercicio4;

public class SensorHumedad extends Sensor {
    private double humedad;

    public SensorHumedad(String id, String ubicacion, double humedad) {
        super(id, ubicacion);
        this.humedad = Math.max(0, Math.min(100, humedad));
    }

    @Override
    public String leer() {
        return "Humedad: " + humedad + " %";
    }
}
