package lab3;

import java.util.List;
import java.io.IOException;

public interface ReaderOfFiles {

    public abstract List<String> readFile(String path) throws IOException;
    public String getFieldFromRecord(String field, int record);
    
}
