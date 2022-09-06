package Tasks.taskEx;

public class Employee {
    private String lastName;
    private String firstName;
    private String patronymic;
    private Integer exp;
    private String position;
    private String fullName;

    public Employee(String lastName, String firstName, String patronymic, Integer exp,String position) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.exp = exp;
        this.position = position;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFullName(){
        return lastName + " " +firstName+ " " + patronymic ;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", exp='" + exp + '\'' +
                ", position=" + position +
                '}';
    }
}
