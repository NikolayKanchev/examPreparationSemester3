package writingToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Nikolaj on 15-09-2017.
 */
public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {

        File file = new File(System.getProperty("user.dir") + "\\src\\writingToFile\\myFile.txt");

        Scanner input = new Scanner(System.in);

        Scanner scanFile = new Scanner(file);

        PrintWriter printWriter = null;

        String string = "";
        String text = "";

        System.out.println("" +
                ".................Hallo..............\n " +
                ".....please write what you want..... \n" +
                ".....to be stored to the file......");

        while (scanFile.hasNext())
        {
            text += scanFile.nextLine() + "\n";
        }

        while (!string.equals("exit"))
        {

            string = input.nextLine();

            if (string.equals("exit"))
            {
                return;
            }

            text += string + "\n";

            try
            {
                printWriter = new PrintWriter(file);

                printWriter.println(text);

                System.out.println("the line was saved in the file");

                printWriter.close();

            } catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }


        /**
         * Writing to file using Serializable */
//        School school = new School("VUV");
//        school.setBooks(5555555);
////        school.saveSchool();
//        school.loadSchool();
//        System.out.println(school);
    }
}
