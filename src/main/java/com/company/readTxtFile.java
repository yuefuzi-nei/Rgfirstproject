package com.company;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*读取文件
*清除标点符号
 */
public class readTxtFile {


    public static String readfile(String s ) {

        //读取文件

        BufferedReader br = null;
        BufferedReader br1 = null;
        StringBuffer sb = null;
        StringBuffer sb1 = null;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(s),"UTF-8")); //这里可以控制编码
            sb = new StringBuffer();
            String line = null;
            while((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String data =  new String(sb); //StringBuffer ==> String
        data = data.replaceAll( "[\\pP+~$`^=|<>～｀＄＾＋＝｜＜＞￥× ]" , "");//去除标点符号
        char[] d=data.toCharArray();//将文件内容存入一个一维数组

        return data;
    }

}
