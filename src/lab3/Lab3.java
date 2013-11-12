package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lab3 {
    public static void main(String[] args) {
        String path = "C:" + File.separatorChar + "Users" + File.separatorChar + 
                    "Andy" + File.separatorChar + "Documents"+ File.separatorChar + 
                    "Java Files"+ File.separatorChar + "lab1text.txt";
//            File file = new File(path);
//            BufferedReader input = null;
//            List<String> records = new ArrayList<String>();
//            try{
//                input = new BufferedReader(new FileReader(file));
//                String line = input.readLine();
//
//                System.out.print("Adding");
//                while(line != null){
//                    records.add(line);
//                    line = input.readLine();
//
//                    System.out.print(".");
//                }
//                System.out.println("\tDone.");

        
        FormatConverter converter = new CustomFormatConverter();
        ReaderOfFiles reader = new CustomFileReader(converter);
        
        try{
            reader.readFile(path);
            System.out.println(reader.getFieldFromRecord("City", 2));
        }catch(IOException ex){
            System.err.println("There was an error reading the file");
        }
//        }finally{
//            try{
//                input.close();
//            }catch(IOException ex){
//                System.err.println("You messed up.");
//            }
//        }

//        lab2.CustomFormatConverter converter = new lab2.CustomFormatConverter();
//        List<Map<String,String>> convertedList = converter.convert(records);
//        System.out.println("List was converted successfully.\n");
//        Map testing = convertedList.get(0);
//        Set<String> keys = testing.keySet();
//        for(String key: keys){
//            System.out.println(testing.get(key));
//        }
        //System.out.println(testing.get("First"));
    }
}
