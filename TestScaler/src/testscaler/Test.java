package testscaler;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import testscaler.Class;
class Test 
{
    private static ArrayList<String> testList = new ArrayList<>(Arrays.asList());
    private static final Class classes = new Class();
    public Test()
            {
            }
    public void LoadTest(String TestName, String ClassName) throws IOException// ReWrite
            {
               FileReader fr = new FileReader(ClassName + "-" + TestName + ".tst"); 
               BufferedReader br = new BufferedReader(fr);
               String s; 
               String s1;
               while((s = br.readLine()) != null) 
               { 
                     //s1 = br1.readLine();
                     //System.out.println(s1 + " made an " + s); 
               }
            }
    public void ListTest()
            {
               for(int i = 0; i < testList.size(); i++)
               {
                   System.out.println(testList.get(i));
               }
            }
    public ArrayList<String> testsToArray()//Working in console
            {
               ArrayList<String> tests = new ArrayList<>();
               for(int i = 0; i < testList.size(); i++)
               {
                   tests.add(testList.get(i));
//                   System.out.println(classList.get(i));
               }
               return tests;
            }
    public void AddTest(String TestName, String ClassName, ArrayList<String> testValues, int ClassSize, int testvalue) throws FileNotFoundException, IOException
            {
                Class classinfo = new Class();
                FileWriter writer = new FileWriter(ClassName + " " + TestName + ".tst");
                testList.add(ClassName + " " + TestName);
                ArrayList<String> testvalues = new ArrayList<>(Arrays.asList());
                testvalues = testValues;
                int testvalueSize = testvalues.size();
                writer.write(ClassSize + "\n");
                writer.write(ClassName + "\n");
                writer.write(TestName + "\n");
                writer.write(testvalue + "\n");
                for(int i = 0; i < testvalueSize; i++)
                  {
                      writer.write(testvalues.get(i) + "\n");
                  }
                writer.close();
            }
    public void DeleteTest(String TestName, String ClassName)
            {
                File delete = new File(ClassName + " " + TestName + ".tst");
                boolean d = delete.delete();
                testList.remove(ClassName + " " + TestName);
            }
    public void DeleteTestNum(int testNum)
            {
                File delete = new File(testList.get(testNum) + ".tst");
                boolean d = delete.delete();
                testList.remove(testNum);
            }
    public void ResetTest(String TestName, String ClassName, ArrayList<String> testValues, int ClassSize, int testvalue) throws IOException
            {
                DeleteTest(TestName, ClassName);
                AddTest(TestName, ClassName, testValues, ClassSize, testvalue);
            }
    public void Startup() throws FileNotFoundException
            {
                Scanner fileScan = new Scanner ( new File("TestStartup.dat") );
                while ( fileScan.hasNext() )
                {
                    testList.add(fileScan.nextLine());
                }
            }
    public void Shutdown() throws IOException
            {
                FileWriter writer = new FileWriter("TestStartup.dat");
                for(int i = 0; i < testList.size(); i++)
               {
                   writer.write(testList.get(i) + "\n");
               }
                writer.close();
            }
    public ArrayList<String> ValuesToArrayConsole(String testname) throws FileNotFoundException, IOException
    {
        ArrayList<String> testvalues = new ArrayList<>();
        FileReader fr = new FileReader(testname + ".tst"); 
        BufferedReader br = new BufferedReader(fr); 
        String s; 
        while((s = br.readLine()) != null) 
        {
            testvalues.add(s);
        }
        return testvalues;
    }
}
