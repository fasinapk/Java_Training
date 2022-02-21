package Assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	public static void main(String[] args) {
		try {
            
            String content = "Hello Learner !! Welcome to howtodoinjava.com.";
  
            File file = new File("E:java_training/Sample.txt");
 
            if (!file.exists()) {
                file.createNewFile();
            }
  
            FileWriter x = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(x);
             
            bw.write(content);
            bw.close();
  
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

	}

}
