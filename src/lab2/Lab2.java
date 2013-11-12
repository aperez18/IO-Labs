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
        
        try{
            input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            List<String> records = new ArrayList<String>();
            while(line != null){
                records.add(line);
                line = input.readLine();
            }
            System.out.println(getRecord(3,records));
            
        }catch(IOException ex){
            System.err.println("There was an error reading the file");
        }finally{
            try{
                input.close();
            }catch(IOException ex){
                System.err.println("You messed up.");
            }
        }
    }
    
    public static String getRecord(int choice, List<String> records){
        if(records == null || choice < 1 || choice > 3){
            return "You must enter a number between 1 and 3.";
        }else{
            return records.get(choice - 1);
        }
    }
}
