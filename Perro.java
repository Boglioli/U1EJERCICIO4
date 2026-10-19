public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private double peso;

    public Perro(String nombre, String raza, int edad, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }
    public double getPeso() {
        return peso;
    }
    public boolean requiereRevisionAnual() {
        if (edad > 7) {
            return true;
        } else {
            return false;
        }
    }
}
