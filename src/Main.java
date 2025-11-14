public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pepito Grillo", 8000.45, "Recursos Humanos", 2234.0);
        Desarrollador desarrollador = new Desarrollador("Nombre",3454.90,"Ventas","Java");

        System.out.println(gerente.mostrarInformacion());
        System.out.println("=========================");
        System.out.println(desarrollador.mostrarInformacion());
    }
}