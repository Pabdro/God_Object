package noAntiPatron;

public class Hijo extends Persona{
    public int EmpleadoID;

    public int getEmpleadoID() {
        return EmpleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        EmpleadoID = empleadoID;
    }
    public void showInfo(){
        System.out.println(EmpleadoID);
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println();
    }
}