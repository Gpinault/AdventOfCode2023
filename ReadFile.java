import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.LinkedList;
import java.util.Scanner; // Import the Scanner class to read text files

 public class ReadFile {
     public static void main(String[] args) {

     }

     public static String getString(String filename){
         try {
             String file = "";
             File myObj = new File(filename);
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
                 String data = myReader.nextLine();
                 System.out.println(data);
                 file += data;

             }
             myReader.close();
             return file;
         } catch (FileNotFoundException e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
         }
         return filename;
     }

     public static LinkedList<String> getList(String filename){
         try {
             LinkedList<String> list = new LinkedList<String>() ;
             File myObj = new File(filename);
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
                 String data = myReader.nextLine();
                 list.add(data);

             }
             myReader.close();
             return list;
         } catch (FileNotFoundException e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
         }
         return new LinkedList<>();
     }
}
