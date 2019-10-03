package com.hcl.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * main class is given.
 * @author coalesce user sai.
 *
 */

public class FileWriteEx {
  /**
   * main method memory. 
   * @param args is argument.
   */
  public static void main(String[] args) {
    /**
   * main function.
   */
    File src; 
    File tar;
    FileReader fr;
    FileWriter fw;
    src = new File("C:/hcljava/Day1/demoproject/src/com/hcl/java/Exam.java");
    tar = new File("C:/files/custom.java");
    try {
      fr = new FileReader(src);
      fw = new FileWriter(tar);
      int ch;
      while ((ch = fr.read()) != -1) { 
        fw.write((char)ch);
      }
      fr.close();
      fw.close();
      System.out.println("** file copied**");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
