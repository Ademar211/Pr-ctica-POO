package Ejercicio4;

public class Main {
        public static void main(String[] args) {
        Sensor[] sensores = {
            new SensorTemperatura("T-01", "Sector A", 24.5),
            new SensorHumedad("H-01", "Sector B", 62)
        };

        for (Sensor sensor : sensores) {
            System.out.println(
                    sensor.getIdentificador() + " / "
                    + sensor.getUbicacion() + " -> "
                    + sensor.leer());
        }

        SensorTemperatura temperatura =
                (SensorTemperatura) sensores[0];

        temperatura.calibrar(0.5);

        System.out.println("Después de calibrar: "
                + temperatura.leer());
    }
}
