package OOP;

import java.time.LocalDate;

public class Employee extends Human{

    private Integer income;

    private String position;

    public Employee(Integer income, String position, String name, LocalDate birth) {
        super(name,birth) ;

        this.income = income;
        this.position = position;

    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "income=" + income +
                ", position='" + position + '\'' +
                '}';
    }
}
