public class Cliente {
        private String nombre;
        private int clave;
        public Cliente(String nombre,int clave) {
            this.nombre = nombre;
            this.clave = clave;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getClave() {
            return clave;
        }
        public void setClave(int clave) {
            this.clave = clave;
        }
        @Override
        public String toString() {
            return "cliente{" +
                    "Nombre: " + nombre + '\'' +
                    ", Clave: " + clave ;}
}
