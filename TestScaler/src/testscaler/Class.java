package testscaler;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Class 
{
    private static ArrayList<String> classList = new ArrayList<>(Arrays.asList());
    public Class()
    {
    }

    /**
     *
     * @param Names requires an ArrayList of student names
     * @param ClassName requires a string with the name of the Class being added
     * @param ClassSize requires an int with the size of the Class being added
     * @throws IOException
     * Adds a new Class to classlist and classstartup.dat.
     */
    public void AddClass(ArrayList<String> Names, String ClassName, int ClassSize) throws IOException
    {
        FileWriter writer = new FileWriter(ClassName + ".cls");
        for(int i = 0; i < ClassSize; i++)
        {
            writer.write(Names.get(i) + "\n");
        }
        writer.close();
        classList.add(ClassName);
    }

    /**
     *
     * @param ClassNum requires the class number according to location in the array of classlist
     * Removes a Class from classlist and classstartup.dat.
     */
    public void DeleteClass(int ClassNum)
    {
        classList.remove(ClassNum);
    }

    /**
     *
     * @param ClassName requires a string of the class name that the student is being added to
     * @param StudentName requires a string of the name of the student that is being added
     * @throws IOException
     * Adds a new Student to a class in classlist
     */
    public void AddStudent(String ClassName, String StudentName) throws IOException
    {
        ArrayList<String> names = new ArrayList<>();
        names = NamesToArray(ClassName);
        names.add(StudentName);
        //System.out.println(names);
        PrintWriter cleaner = new PrintWriter(ClassName + ".cls");
        cleaner.print("");
        cleaner.close();
        FileWriter writer = new FileWriter(ClassName + ".cls",true);
        for(int i = 0; i < names.size(); i++)
        {
            writer.write(names.get(i) + "\n");
        }
        writer.close();
    }

    /**
     *
     * @param ClassName requires a string of the class name that the student is being removed from
     * @param StudentNumber requires the number of the student according to the names ArrayList
     * @throws IOException
     * Removes a Student from a class in classlist
     */
    public void RemoveStudent(String ClassName, int StudentNumber) throws IOException
    {
        ArrayList<String> names = new ArrayList<>();
        names = NamesToArray(ClassName);
        names.remove(StudentNumber);
        PrintWriter cleaner = new PrintWriter(ClassName + ".cls");
        cleaner.print("");
        cleaner.close();
        FileWriter writer = new FileWriter(ClassName + ".cls",true);
        for(int i = 0; i < names.size(); i++)
        {
            writer.write(names.get(i) + "\n");
        }
        writer.close();
    }

    /**
     *
     * @throws FileNotFoundException
     * Loads classlist array with the values saved to ClassStartup.dat
     */
    public void Startup() throws FileNotFoundException
    {
        Scanner fileScan = new Scanner ( new File("ClassStartup.dat") );
        while ( fileScan.hasNext() )
        {
            classList.add(fileScan.nextLine());
        }
    }

    /**
     *
     * @throws IOException
     * Saves entries from classlist to ClassStartup.dat
     */
    public void Shutdown() throws IOException
    {
        FileWriter writer = new FileWriter("ClassStartup.dat");
        for(int i = 0; i < classList.size(); i++)
        {
            writer.write(classList.get(i) + "\n");
        }
        writer.close();
    }

    /**
     *
     * @param ClassName requires string of the name of the class
     * @return returns an array of names
     * @throws IOException
     * returns an array of names
     */
    public ArrayList<String> NamesToArray(String ClassName) throws IOException
    {
        ArrayList<String> names = new ArrayList<>();
        FileReader fr = new FileReader(ClassName + ".cls"); 
        BufferedReader br = new BufferedReader(fr); 
        String s; 
        while((s = br.readLine()) != null) 
        {
            names.add(s);
        }
        return names;
    }

    /**
     *
     * @return returns an array of classes
     * returns an array of classes
     */
    public ArrayList<String> classesToArray()
    {
        ArrayList<String> classes = new ArrayList<>();
        for(int i = 0; i < classList.size(); i++)
        {
            classes.add(classList.get(i));
        }
        return classes;
    }
}