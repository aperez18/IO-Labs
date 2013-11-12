package lab4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileWriter implements IFileWriter{

    private final int MIN_LENGTH = 1;
    private final int MIN_PATH_LENGTH = 3;
    private final String ERROR_MESSAGE = "You must pass in a valid String as an argument.";
    
    private PrintWriter writer;
    private File file;
    
    @Override
    public void appendLine(String path, String line) throws IOException{
        if(line == null || line.length() < MIN_LENGTH){
            System.err.print(ERROR_MESSAGE);
        }else if(path == null || path.length() < MIN_PATH_LENGTH){
            throw new IOException();
        }else{
            file = new File(path);
            writer = new PrintWriter(new FileWriter(file), true);
            writer.append(line);
            writer.close();
        }
    }

    @Override
    public void overwrite(String path, String data) throws IOException {
        if(data == null || data.length() < MIN_LENGTH){
            System.err.print(ERROR_MESSAGE);
        }else if(path == null || path.length() < MIN_PATH_LENGTH){
            throw new IOException();
        }else{
            file = new File(path);
            writer = new PrintWriter(new FileWriter(file));
            writer.print(data);
            writer.close();
        }
    }
}
