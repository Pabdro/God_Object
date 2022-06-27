package antiPatron;

public class Empleados {
    public int ID;
    public String FirstName;
    public String LastName;
    public String SpouseFirstName;
    public String SpouseLastName;
    public String ChildOneFirstName;
    public String ChildOneLastName;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSpouseFirstName() {
        return SpouseFirstName;
    }

    public void setSpouseFirstName(String spouseFirstName) {
        SpouseFirstName = spouseFirstName;
    }

    public String getSpouseLastName() {
        return SpouseLastName;
    }

    public void setSpouseLastName(String spouseLastName) {
        SpouseLastName = spouseLastName;
    }

    public String getChildOneFirstName() {
        return ChildOneFirstName;
    }

    public void setChildOneFirstName(String childOneFirstName) {
        ChildOneFirstName = childOneFirstName;
    }

    public String getChildOneLastName() {
        return ChildOneLastName;
    }

    public void setChildOneLastName(String childOneLastName) {
        ChildOneLastName = childOneLastName;
    }
    public void showInfo(){
        System.out.println(ID);
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println(SpouseFirstName);
        System.out.println(SpouseLastName);
        System.out.println(ChildOneFirstName);
        System.out.println(ChildOneLastName);
    }
}
