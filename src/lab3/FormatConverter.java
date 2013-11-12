package lab3;

import java.util.List;
import java.util.Map;

public interface FormatConverter {

    public abstract List<Map<String, String>> convert(List<String> records);
    
}
