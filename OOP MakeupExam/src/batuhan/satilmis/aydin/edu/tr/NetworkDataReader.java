package batuhan.satilmis.aydin.edu.tr;
import java.io.*;
import java.nio.file.Paths;

public class NetworkDataReader implements DataReader{


    @Override
    public String readData() {

        try {
            File file = new File(String.valueOf(Paths.get("data.txt")));

            BufferedReader br = new BufferedReader(new FileReader(file));

            return br.readLine();

        }
        catch (IOException e ) {

            System.out.println(e.getMessage());
        }

        return  null;

    }
}


