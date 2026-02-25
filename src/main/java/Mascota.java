
    public class Mascota {

        private String nombre;
        private String tipo;
        private String raza;
        private int edad;
        private String codigo;
        private Dueno dueno;

        // Constructor
        public Mascota(String nombre, String tipo, String raza, int edad, String codigo, Dueno dueno) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.raza = raza;
            this.edad = edad;
            this.codigo = codigo;
            this.dueno = dueno;
        }

        // GETTERS
        public String getNombre() {
            return nombre;
        }

        public String getTipo() {
            return tipo;
        }

        public String getRaza() {
            return raza;
        }

        public int getEdad() {
            return edad;
        }

        public String getCodigo() {
            return codigo;
        }

        public Dueno getDueno() {
            return dueno;
        }

        // SETTERS
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public void setDueno(Dueno dueno) {
            this.dueno = dueno;
        }

        // toString
        public void mostrarMascota() {
            System.out.println("Mascota: " + nombre);
            System.out.println("Tipo: " + tipo);
            System.out.println("Raza: " + raza);
            System.out.println("Edad: " + edad);
            System.out.println("Código: " + codigo);
            dueno.mostrarDueno();
        }
    }

