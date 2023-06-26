public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Fabian");
        System.out.println("Mi nombre es" + persona.getNombre());
        persona.setEdad(29);
        System.out.println("Mi edad es" + persona.getEdad() + "años");
        persona.setTelefono(153192092);
        System.out.println("Mi telefono es" + persona.getTelefono());
    }


    static class Persona {

        private int edad;
        private  String nombre;
        private int telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }
        public int getEdad () {return edad;}
        public void setNombre (String nombre) {
            this.nombre = nombre;
        }
        public String getNombre() { return nombre; }
        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
        public  int getTelefono() {return telefono;}
    }
}