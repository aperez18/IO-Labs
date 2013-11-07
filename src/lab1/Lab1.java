package lab1;

import java.io.*;
import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        
        String path = "C:" + File.separatorChar + "Users" + File.separatorChar + 
                "Andy" + File.separatorChar + "Documents"+ File.separatorChar + 
                "Java Files"+ File.separatorChar + "lab1text.txt";
        File file = new File(path);
        BufferedReader input = null;
        Map<String,String> records = new HashMap<String,String>();
        
        try{
            input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            while(line != null){
                //System.out.println(line); //lab 1
                
                records.put("key",line); //lab 2
                line = input.readLine();
            }
        }catch(IOException ex){
            System.out.println("You messed up.");
        }finally{
            try{
                input.close();
            }catch(IOException ex){
                System.out.println("You messed up again.");
            }
        }
        
        
    }
}
