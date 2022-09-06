package Tasks.taskEx;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DataAnalyse {

    public Map<String, Optional<Employee>> mostExpEmployees(List <Employee> employees){
       // Map<String, Optional<Employee>> employeesPosition = employees.stream()
       //         .collect(Collectors.groupingBy(Employee::getPosition,Collectors.maxBy((x,y) -> x.getExp().compareTo(y.getExp()))));


        Map<String, Optional<Employee>> employeesPosition = employees.stream()
                .collect(Collectors.groupingBy(Employee::getPosition,Collectors.maxBy(Comparator.comparingInt(x -> x.getExp()))));
        return  employeesPosition;
    }
}
