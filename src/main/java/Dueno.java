
    public class Dueno {

        private String nombreCompleto;
        private String telefono;
        private String direccion;

        //constructor
        public Dueno(String nombreCompleto, String telefono, String direccion) {
            this.nombreCompleto = nombreCompleto;
            this.telefono = telefono;
            this.direccion = direccion;
        }
//getters y setters
        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getNombreCompleto() {
            return nombreCompleto;
        }

        public void setNombreCompleto(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
//toString
        public void mostrarDueno() {
            System.out.println("Dueño: " + nombreCompleto);
            System.out.println("Teléfono: " + telefono);
            System.out.println("Dirección: " + direccion);
        }
    }

