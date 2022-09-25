import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class arrayMaker {
    // to handle exceptions include throws
    public static void main(String[] args) throws IOException {
        // list that holds strings of a file
        List<String> listOfStrings
            = new ArrayList<String>();
       
        // load data from file
        FileReader fr = new FileReader("words.txt");
       
        // Created a string to store each character
        // to form word
        String s = new String();
        char ch;
       
        // checking for EOF
        while (fr.ready()) {
            ch = (char)fr.read();
               
            // Used to specify the delimiters
            if (ch == '\n') {
               
                // Storing each string in arraylist
                listOfStrings.add(s.toString());
               
                // clearing content in string
                s = new String();
            }
            else {
                // appending each character to string if the
                // current character is not delimiter
                s += ch;
            }
        }
        if (s.length() > 0) {
           
            // appending last line of strings to list
            listOfStrings.add(s.toString());
        }
        // storing the data in arraylist to array
        String[] array1
            = listOfStrings.toArray(new String[0]);
    }
}
