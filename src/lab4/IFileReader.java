package lab4;

import java.io.IOException;
import java.util.List;

public interface IFileReader {
    
    public abstract List<String> readFile(String path) throws IOException;
    public String getLine(int line);
}
