package lab9;

public class Student extends Person{
    private String groupName;
    private int rating;

    public Student() {}

    public Student(String lastName, String firstName, int age) {
        super(lastName, firstName, age);
    }

    public Student(String lastName, String firstName, int age, String groupName, int rating) {
        super(lastName, firstName, age);
        this.groupName = groupName;
        this.rating = rating;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
