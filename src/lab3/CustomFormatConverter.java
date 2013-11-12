package lab3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CustomFormatConverter implements FormatConverter {
    
    @Override
     public List<Map<String,String>> convert(List<String> records){
        if(records == null){
            throw new IllegalArgumentException();
        }else{
            
            List<Map<String,String>> convertedList = 
                    new ArrayList<Map<String,String>>();
            
            for(String record : records){
                Map<String,String> map = new LinkedHashMap<String,String>();
                String[] fields = record.split(",");
                map.put("Last", fields[0]);
                map.put("First", fields[1]);
                map.put("Address", fields[2]);
                map.put("City", fields[3]);
                map.put("State", fields[4]);
                map.put("Zip", fields[5]);
                convertedList.add(map);
            }
            
            return convertedList;
        }
    }
}
