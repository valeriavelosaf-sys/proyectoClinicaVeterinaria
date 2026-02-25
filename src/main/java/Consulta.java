
    public class Consulta {

        private double valorBase = 50000;

        public double calcularCosto(Mascota mascota) {

            double costo = valorBase;

            //Switch (Expresión)
            //Es un selector de valores que funciona como un menú.
            // Se usa para elegir una opción entre varias .
            //¿Qué hace?: Compara una variable (como el tipo de mascota) contra varios "casos" (case).
            // Cuando encuentra el que coincide, devuelve el valor que está después de la flecha (->).


            // incremento según especie
            costo += switch (mascota.getTipo().toLowerCase()) {
                case "perro" -> 10000;
                case "gato" -> 8000;
                default -> 12000; //Si es cualquier otra cosa (loro, iguana, etc.), se cobran 12.000 extras.
            };
            //+=: Significa "súmale al valor actual lo que salga de aquí".
            //.toLowerCase(): Convierte el texto a minúsculas para que si escribieron "GATO", el switch lo reconozca como "gato".
            //-> : Indica el valor de retorno y elimina la necesidad de usar la palabra break.


            // incremento por edad.Si el animal es mayor a 8 años, le suma 15.000 más al total acumulado.
            if (mascota.getEdad() > 8) {
                costo += 15000;
            }

            return costo;
        }
    }
