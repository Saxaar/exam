package Tasks.taskEx;

public class Main {
    public static void main(String[] args) {
        System.out.println(new DataAnalyse().mostExpEmployees(new Reader().employeeReader("/Users/saxaar/Desktop/exam/src/Tasks/taskEx/employees.txt")));
        new PositionDecomposition().createFiles(
                new DataAnalyse().mostExpEmployees(
                        new Reader().employeeReader(
                                "/Users/saxaar/Desktop/exam/src/Tasks/taskEx/employees.txt")),
                "/Users/saxaar/Desktop/exam/src/Tasks/taskEx/");

    }
}
