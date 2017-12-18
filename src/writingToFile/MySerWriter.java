package writingToFile;

import java.io.*;

/**
 * Created by Nikolaj on 16-09-2017.
 */
public class MySerWriter
{
    public void write(School school)
    {
        FileOutputStream fos;
        try
        {
            fos = new FileOutputStream(System.getProperty("user.dir") + "\\mySerFile.ser", true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(school);
            oos.close();
            fos.close();
            System.out.println("The School data are saved !!!!!");

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public School read()
    {
        School school = null;

        try
        {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\mySerFile.ser");

            ObjectInputStream ois = new ObjectInputStream(fileInputStream);

            school = (School)ois.readObject();

            ois.close();

            fileInputStream.close();

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        return school;

    }
}
