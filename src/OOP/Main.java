package OOP;



import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(25000,"Kassir", "John",LocalDate.of(1999,9,12));

        System.out.println(employee.toString());


    }
}
