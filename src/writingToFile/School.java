package writingToFile;

import java.io.Serializable;

/**
 * Created by Nikolaj on 16-09-2017.
 */
public class School implements Serializable
{
    private int books;
    private String name;

    public School(String name)
    {
        this.name = name;
    }

    public int getBooks()
    {
        return books;
    }

    public void setBooks(int books)
    {
        this.books = books;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "School name: "+ name +" \nbooks in the School: " + books;
    }

    public void saveSchool()
    {
        MySerWriter mySerWriter = new MySerWriter();
        mySerWriter.write(this);
    }

    public void loadSchool()
    {
        MySerWriter mySerWriter = new MySerWriter();
        School school = mySerWriter.read();
        name = school.name;
        books = school.books;
    }
}
