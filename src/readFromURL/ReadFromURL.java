package readFromURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadFromURL
{
    public static void main(String[] args)
    {
        try
        {
            URL oracle = new URL("http://www.oracle.org/");

            BufferedReader br = new BufferedReader(new InputStreamReader(oracle.openStream()));

            String line;
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }

            br.close();

        } catch (MalformedURLException e)
        {
            e.printStackTrace();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
