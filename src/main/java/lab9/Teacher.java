package lab9;

public class Teacher extends Person{
    private String list;

    public Teacher() {}

    public Teacher (String lastName, String firstName, int age, String list) {
        super(lastName, firstName, age);
        this.list = list;
    }

    public void setDisciplines(String list) {
        this.list = list;
    }

    public String getDisciplines() {
        return list;
    }

    public String toString() {
        return lastName + " " + firstName + " " + age + " " + list;
    }
}
