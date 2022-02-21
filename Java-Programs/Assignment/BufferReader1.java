package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader1 {

	public static void main(String[] args) throws IOException {
		String fileName = "E:java_training/SampleOutputWriter.txt";
        
        BufferedReader br = new BufferedReader(new FileReader(fileName));
         
        try {
            String line;
            while ((line = br.readLine()) != null) {
               System.out.println(line);    
            }
        } finally {
            br.close();
        }
	}

}
