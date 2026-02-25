public class Main {
    public static void main(String[] args) {

        // Crear dueño
        Dueno dueno1 = new Dueno(
                "Carlos Perez",
                "3124567890",
                "Armenia, Quindío"
        );

        // Crear mascota
        Mascota mascota1 = new Mascota(
                "Firulais",
                "Perro",
                "Labrador",
                10,
                "M001",
                dueno1
        );

        // Mostrar información
        mascota1.mostrarMascota();

        // Crear consulta
        Consulta consulta = new Consulta();

        // Calcular costo
        double costo = consulta.calcularCosto(mascota1);

        // Mostrar resultado
        System.out.println("Costo de la consulta: $" + costo);
    }
}
