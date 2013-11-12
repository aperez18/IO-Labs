package lab3;

import java.io.*;
import java.util.*;

public class CustomFileReader implements ReaderOfFiles{
    
    File file;
    FormatConverter converter;
    List<String> records = new ArrayList<String>();
    
    public CustomFileReader(FormatConverter converter){
        if(converter == null){
            System.out.println("Invalid FormatConverter");
        }else{
            this.converter = converter;
        }
    }
    
   
    @Override
    public List<String> readFile(String path)throws IOException{
        if(path == null || path.length() < 3){
            System.out.println("Invalid path - could not create CustomFileReader");
            return null;
        }else{
            file = new File(path);
            String line;
            BufferedReader input = new BufferedReader(new FileReader(file));
            //List<String> records = new ArrayList<String>();
            line = input.readLine();
            while(line!=null){
                records.add(line);
                line = input.readLine();
            }
            input.close();
            return records;
        }
    }
    
    /**
     * Gets the specified field from a chosen record.
     * 
     * @param field - Can be "Last" "First" "Address" "City" "State" or "Zip"
     * @param record - Which record you would like to get the field from starting at record 1
     * @return String
     */
    public String getFieldFromRecord(String field, int record){
        List<Map<String,String>> convertedList = converter.convert(records);
        Map<String,String> map = convertedList.get(record-1);
        return map.get(field);
    }
}
