import java.io.*;

public class CWRTestFle {
public static void main (String[] args) throws IOException {

// creating text file (below line of code will create new text file automatically)
File f = new File ("C:\\Selenium\\Java\\textfile.txt");
f.createNewFile();

// writing text into above text file
FileWriter w = new FileWriter ("C:\\Selenium\\Java\\textfile.txt");
BufferedWriter out = new BufferedWriter(w);
out.write("writing data into text file");
out.newLine(); // like press enter key to go to next line
out.write("This is a new line");
out.flush();

// Reading data from above text file
FileReader r = new FileReader ("C:\\Selenium\\Java\\textfile.txt");
BufferedReader bfr = new BufferedReader(r);
String x ="";

while ((x=bfr.readLine()) !=null){
System.out.println(x);
}
}
}

