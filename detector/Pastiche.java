import java.io.*;
import java.util.Iterator;
public class Pastiche {

    // Constants

    private static final int WORD_SIZE = 3;


    // Class variables
    
    private static Similarity similarity;





    // Reads the content of a file and returns the corresponding
    // WordMap object.

    private static HashTableWordMap getWordMap(String fileName) throws FileNotFoundException, IOException {

        HashTableWordMap m;
        m = new HashTableWordMap();

        WordReader w;
        w = new WordReader(fileName,false);

        Iterator<String> i;
        i = w.iterator(WORD_SIZE);

        while (i.hasNext()) {
            m.update(i.next());
        }

        return m;
    }

    // Compares two documents.

    private static String compare(String fileA, String fileB) {

        HashTableWordMap a = null, b = null;

        try {

            a = getWordMap(fileA);
            b = getWordMap(fileB);

        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }

        return ""+similarity.score(a,b)+" "+fileA+" "+fileB;
    }

   

    // Displays information on how to use the application and quits.

    private static void displayUsageAndExit() {
        System.err.println("Usage: java Pastiche dir [LinkedWordMap|TreeWordMap] [Jaccard|Cosine]");
        System.exit(-1);
    }


    public static void main(String[] args) {



        // Parsing the command line arguments
        
        if (args.length != 4) {
            displayUsageAndExit();
        }

        if (!"HashTable".startsWith(args[2])) {
            displayUsageAndExit();
        }

        if ("Jaccard".startsWith(args[3])) {
            similarity = new Jaccard();
            // } else if ("Cosine".startsWith(args[2])) {
            // similarity = new Cosine();
        } else {
            displayUsageAndExit();
        }

        // Collecting all the files from the specified directory

        String file1 = args[0];
        String file2 = args[1];
        

        // Comparing all the pairs

        long start = System.currentTimeMillis();

        System.out.println(compare(file1, file2));
        System.out.println((System.currentTimeMillis() - start) + " ms");

    }

}
