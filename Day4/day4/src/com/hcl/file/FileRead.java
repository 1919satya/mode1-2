package com.hcl.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 * main class is Read.
 * @author coalesce user is sai.
 *
 */

public class FileRead {
  /**
   * main memory management.
   * @param args is argument.
   */
  public static void main(String[] args) {
    /**
    * main function is Read.
    */
    File f1 =
        new File("C:/hcljava/Day1/demoproject/src/com/hcl/java/Exam.java");
    try {
      FileReader f = new FileReader(f1);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

}
