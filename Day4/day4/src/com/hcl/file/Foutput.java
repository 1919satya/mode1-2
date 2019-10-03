package com.hcl.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * main is file. 
 * @author coalesce user is sai.
 *
 */

public class Foutput {
  /**
   * memory is main.
   * @param args is argument.
   */
  public static void main(String[] args) {
    /**
     * main function is Function output.
     */
    FileInputStream src;
    FileOutputStream tar;
    try {
      src = 
        new FileInputStream("C:/hcljava/Day1/demoproject/src/com/hcl/java/Exam.java");
      tar = 
        new FileOutputStream("C:/hcljava/Day1/demoproject/src/com/hcl/java/Exam.java");
      int ch;
      while ((ch = src.read()) != -1) {
        tar.write((char)ch);
      }
      src.close();
      tar.close();
      System.out.print("file copied");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
