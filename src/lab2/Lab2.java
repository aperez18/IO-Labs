package lab2;

import java.io.*;
import java.util.*;

public class Lab2 {
    public static void main(String[] args) {
        
    String path = "C:" + File.separatorChar + "Users" + File.separatorChar + 
                "Andy" + File.separatorChar + "Documents"+ File.separatorChar + 
                "Java Files"+ File.separatorChar + "lab1text.txt";
        File file = new File(path);
        BufferedReader input = null;
        List<String> records = new ArrayList<String>();
        try{
            input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            
            System.out.print("Adding");
            while(line != null){
                records.add(line);
                line = input.readLine();
                
                System.out.print(".");
            }
            System.out.println("\tDone.");
            
        }catch(IOException ex){
            System.err.println("There was an error reading the file");
        }finally{
            try{
                input.close();
            }catch(IOException ex){
                System.err.println("You messed up.");
            }
        }
        
        CustomFormatConverter converter = new CustomFormatConverter();
        List<Map<String,String>> convertedList = converter.convert(records);
        System.out.println("List was converted successfully.\n");
        Map testing = convertedList.get(0);
        Set<String> keys = testing.keySet();
        for(String key: keys){
            System.out.println(testing.get(key));
        }
        //System.out.println(testing.get("First"));
    }
}
