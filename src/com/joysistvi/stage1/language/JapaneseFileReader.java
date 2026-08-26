package com.joysistvi.stage1.language;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class JapaneseFileReader {

    public static List<String> readFile(String filePath) {
       List<String> lines = new ArrayList<>();
       File file = new File(filePath);

       try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {

           String line;
           while ((line = reader.readLine()) != null) {
               lines.add(line);
           }
       } catch (IOException e) {
           System.err.println("Error reading Japanese file: " + e.getMessage());
           e.printStackTrace();
       }

       return lines;
    }
}
