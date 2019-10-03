package com.hcl.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * main memory management.
 * @author coalesce user sai.
 *
 */
public class Finput {
  /**
   * class Function input.
   * @param args is argument.
   */
  public static void main(String[] args) {
    /**
     * main function is a string.
     */
    try {
      FileInputStream fin = 
          new FileInputStream("C:/hcljava/Day1/demoproject/src/com/hcl/java/Exam.java");
      int ch;
      while ((ch = fin.read()) != -1) {
        System.out.print((char)ch);
      }
      fin.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
