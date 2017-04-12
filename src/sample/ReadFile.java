package sample;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by andriusbaltrunas on 4/12/2017.
 */
public class ReadFile {

    public static Map<String,String> readFile(){
        Map<String,String> paieska = new HashMap<>();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("zodynas.txt")));
            String line = null;
            while ((line = bf.readLine()) != null)  {

                String[] mas = line.split("-");
                if (mas.length == 2){
                    paieska.put(mas[0],mas[1]);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return paieska;

    }
}
