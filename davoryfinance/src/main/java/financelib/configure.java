package financelib;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class configure {

    public static void append(String input, String file) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            pw.println(input);
            pw.flush();

        } catch (IOException e) {
            System.out.println("There was an error");
            e.printStackTrace();
        } finally {
            try {
                pw.close();
                bw.close();
                fw.close();
            } catch (IOException io) {
            }

        }
    }

    public void target (String input, int pos, String file) {
        
    }

}
