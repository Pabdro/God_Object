package noAntiPatron;

public class Client {
    public static void main(String[] args) {
        Empleado empleado=new Empleado();
        empleado.setFirstName("Miguel");
        empleado.setLastName("Molina");
        empleado.setID(1232134);
        Esposa esposa=new Esposa();
        esposa.setFirstName("Rebeca");
        esposa.setLastName("Burgoa");
        esposa.setEmpleadoID(12324);
        Hijo hijo=new Hijo();
        hijo.setEmpleadoID(2133);
        hijo.setFirstName("Richard");
        hijo.setLastName("Molina");
        Hijo hijo2=new Hijo();
        hijo2.setEmpleadoID(234523);
        hijo2.setFirstName("Marcos");
        hijo2.setLastName("Molina");
        empleado.showInfo();
        esposa.showInfo();
        hijo.showInfo();
        hijo2.showInfo();
    }
}
