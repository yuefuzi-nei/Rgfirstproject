package com.company;


import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

          long startTime= System.currentTimeMillis();

          String fileName=args[0];
          String fileName1=args[1];
          String fileName2=args[2];
          PrintStream ps = new PrintStream(fileName2);


          //String fileName = "D:/����/QQ/test/orig.txt";
          //String fileName1="D:/����/QQ/test/orig_0.8_dis_15.txt";

          String a=readTxtFile.readfile(fileName);
          String b=readTxtFile.readfile(fileName1);
          List<String> str1List = Analyzer.stringParticiple(a);
          List<String> str2List = Analyzer.stringParticiple(b);
          int [][] res = Count.getStringFrequency(str1List,str2List);
          System.out.println(Count.getDoubleStrForCosValue(res)*100+"%");
          long endTime= System.currentTimeMillis();
          //System.setOut(ps);
          //System.out.println("����������¶�λ����׼���������Ļ");
          System.out.println("��������ʱ�䣺"+(endTime-startTime)+"ms");

    }

}
