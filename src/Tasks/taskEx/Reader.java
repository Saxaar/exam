package Tasks.taskEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
 public List employeeReader(String path){
     List <Employee> employeeList = new ArrayList();
     try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
         bufferedReader.lines().forEach(line -> {
             if (line.contains("\"")) {
             final int firstPosition = line.indexOf("\"");
             final int lastPosition = line.lastIndexOf("\"");
             final String position = line.substring(firstPosition+1,lastPosition);
             final String[] splitLine = line.split(" ");
             Employee employee = new Employee(splitLine[0],splitLine[1],splitLine[2],Integer.parseInt(splitLine[3]),position);
             employeeList.add(employee);
             } else {
                 final String[] splitLine = line.split(" ");
                 Employee employee = new Employee(splitLine[0],splitLine[1],splitLine[2],Integer.parseInt(splitLine[3]),splitLine[4]);
                 employeeList.add(employee);
             }
         });

     } catch (IOException e){
         e.getStackTrace();
     }
 return employeeList;}
}
