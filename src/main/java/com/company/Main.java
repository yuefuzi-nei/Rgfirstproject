package com.company;


import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

          long startTime= System.currentTimeMillis();
          String fileName=args[0];
          String fileName1=args[1];


          /*String fileName = "D:/何悦/QQ/test/orig.txt";
          String fileName1="D:/何悦/QQ/test/orig_0.8_dis_15.txt";
          */

          String a=readTxtFile.readfile(fileName);
          String b=readTxtFile.readfile(fileName1);
          List<String> str1List = Analyzer.stringParticiple(a);
          List<String> str2List = Analyzer.stringParticiple(b);
          int [][] res = Count.getStringFrequency(str1List,str2List);
          System.out.println(Count.getDoubleStrForCosValue(res));
          long endTime= System.currentTimeMillis();
          System.out.println("程序运行时间："+(endTime-startTime)+"ms");


    }

}
