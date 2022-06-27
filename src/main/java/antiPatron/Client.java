package antiPatron;

public class Client {
    public static void main(String[] args) {
        Empleados empleados=new Empleados();
        empleados.setID(12341);
        empleados.setFirstName("Miguel");
        empleados.setLastName("Molina");
        empleados.setSpouseFirstName("Rebeca");
        empleados.setSpouseLastName("Burgoa");
        empleados.setChildOneFirstName("Richard");
        empleados.setChildOneLastName("Molina");
        empleados.showInfo();
    }
}
