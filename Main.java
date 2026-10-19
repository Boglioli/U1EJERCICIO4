public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Rex", "ovejero aleman", 9, 32.5);
        Perro perro2 = new Perro("Toby", "mestizo", 5, 18.0);
        System.out.println("Nombre: " + perro1.getNombre() + ":" + perro1.requiereRevisionAnual());
        System.out.println("Nombre: " + perro2.getNombre() + ":" + perro2.requiereRevisionAnual());
    }
}
