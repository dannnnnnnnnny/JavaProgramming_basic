import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;

public class Instance {
    public static void main(String[] args) throws IOException{
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello 1");
        p1.close();
    }    
}
