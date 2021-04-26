import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> source = new ArrayList<>();
        List<String> destination = new ArrayList<>();
        try {
            readFileSource(source);
            ShowElementInArray(source);
            source.add("1\tCường\tHà Nội\n");
            source.add("2\tKiên\tHà Nội\n");
            source.add("3\tTuấn Vũ\tHà Nội\n");
            source.add("4\tHiệp\tHà Nội\n");
            creatFileDestination(source, "source.txt");

//            writeFileSource(source);
            destination.addAll(source);
            creatFileDestination(destination, "destination.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileSource(List<String> source) throws IOException {
        FileReader fileReaderSource = new FileReader("source.txt");
        BufferedReader bufferedSource = new BufferedReader(fileReaderSource);
        String line;
        while ((line = bufferedSource.readLine()) != null){
            source.add(line);
        }
        bufferedSource.close();
       // fileReaderSource.close();
    }

    private static void creatFileDestination(List<String> destination, String path) throws IOException {
        FileWriter fileDestination = new FileWriter(path);
        for (String e : destination){
            fileDestination.write(e);
        }
        fileDestination.close();
    }

    private static void ShowElementInArray(List<String> source) {
        for (String e: source) {
            System.out.println(e);
        }
    }



    private static void writeFileSource(List<String> strings) throws IOException {
        FileWriter fileResource = new FileWriter("source.txt");
        for (String e : strings) {
            fileResource.write(e);
            //fileWriter.write("\t");
        }
        fileResource.close();
    }
}
