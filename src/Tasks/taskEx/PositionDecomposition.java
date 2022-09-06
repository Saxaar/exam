package Tasks.taskEx;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;

public class PositionDecomposition {

    public void createFiles(Map<String, Optional<Employee>> positions,String path){
        for (Map.Entry<String,Optional<Employee>> position : positions.entrySet()) {
            try(FileWriter writer = new FileWriter(path + "/" + position.getKey() + ".txt")){
                writer.write(position.getValue().toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
