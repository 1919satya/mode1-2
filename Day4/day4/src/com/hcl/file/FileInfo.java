package com.hcl.file;

import java.io.File;

/**
 * main function.
 * @author coalesce user sai.
 *
 */
public class FileInfo {
  /**
   * main memory is Fileinfo.
   * @param args is argument.
   */
  public static void main(String[] args) {
    /**
   * main class is string.
   */
    File f1 =
        new File("D:/hcljava/Day1/day1/src/com/hcl/java/ArgDemo.java");
    System.out.println("file name is " + f1.getName());
    System.out.println("full name " + f1.getAbsoluteFile());
  }

}
