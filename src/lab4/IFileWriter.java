package lab4;

import java.io.IOException;

public interface IFileWriter {
    public abstract void appendLine(String path, String line) throws IOException;
    public abstract void overwrite(String path, String data) throws IOException;
}
