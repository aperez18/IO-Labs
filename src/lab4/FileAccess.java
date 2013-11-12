package lab4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileAccess {
    
    private final int MIN_PATH_LENGTH = 3;
    private final int MIN_INDEX = 0;
    
    private IFileReader reader;
    private IFileWriter writer;
    
    public List<String> readFile(String path)throws IOException {
        if(path == null || path.length() < MIN_PATH_LENGTH){
            throw new IOException();
        }else{
            reader = new TextFileReader();
            return reader.readFile(path);
        }
    }
    
    public String getLine(String path, int index) throws IOException{
        if(path == null || path.length() < MIN_PATH_LENGTH){
            throw new IOException();
        }else if(index < MIN_INDEX){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            List<String> fileData = readFile(path);
            return fileData.get(index);
        }
    }
    
    public void appendLine(String path, String line) throws IOException{
        writer = new TextFileWriter();
        writer.appendLine(path, line);
    }
    
    public void overwrite(String path, String data) throws IOException{
        writer = new TextFileWriter();
        writer.overwrite(path, data);
    }
}
