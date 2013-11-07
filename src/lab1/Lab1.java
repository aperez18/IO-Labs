package lab1;

import java.io.*;

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
            
            int row = 1;
            while(line != null){
                if(row==2){
                    System.out.println(line); //Step 1
                } //Step 2
                line = input.readLine();
                row++;
            }
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
