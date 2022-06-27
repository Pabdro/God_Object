package noAntiPatron;

public class Empleado extends Persona{
    public int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void showInfo(){
        System.out.println(ID);
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println();
    }
}
