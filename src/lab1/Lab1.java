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
        try{
            input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            List<String> records = new ArrayList<String>();
            while(line != null){
                System.out.println(line); //Step 1
                records.add(line);
                line = input.readLine();
            }
            //System.out.println(records.get(1)); //Step 2
        }catch(IOException ex){
            System.err.println("There was an error reading the file");
        }finally{
            try{
                input.close();
            }catch(IOException ex){
                System.err.println("You messed up.");
            }
        }
        
        
        //Step 3
        PrintWriter writer = null;
        try{
            boolean append = true;
            writer = new PrintWriter(new FileWriter(file, append));
            writer.println("Crowbridge,Sara,2639 Maple Rd,Burlington,WI,53105");
            System.out.println("Operation complete!");
        }catch(IOException ex){
            System.out.println("Error writing to file at " + path);
        }finally{
            writer.close();
        }
        
        System.out.println("\n\n");
        
        
        input = null;
        try{
            input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            List<String> records = new ArrayList<String>();
            while(line != null){
                System.out.println(line); //Step 1
                records.add(line);
                line = input.readLine();
            }
            //System.out.println(records.get(1));
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
}