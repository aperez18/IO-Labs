package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader implements IFileReader{

    private final int MIN_PATH_LENGTH = 3;
    private final int MIN_INDEX = -1;
    
    private List<String> lines;
    private File file;
    private BufferedReader input;
    
    @Override
    public List<String> readFile(String path) throws IOException {
        if(path == null || path.length() < MIN_PATH_LENGTH){
            throw new IOException();
        }else{
            file = new File(path);
            input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            lines = new ArrayList<String>();
            while(line != null){
                lines.add(line);
                line = input.readLine();
            }
            input.close();
            return lines;
        }
    }

    @Override
    public String getLine(int index) throws ArrayIndexOutOfBoundsException{
        if(index > MIN_INDEX && index < lines.size()){
            return lines.get(index);
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
