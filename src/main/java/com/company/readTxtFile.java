package com.company;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*��ȡ�ļ�
*���������
 */
public class readTxtFile {


    public static String readfile(String s ) {

        //��ȡ�ļ�

        BufferedReader br = null;
        BufferedReader br1 = null;
        StringBuffer sb = null;
        StringBuffer sb1 = null;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(s),"UTF-8")); //������Կ��Ʊ���
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
        data = data.replaceAll( "[\\pP+~$`^=|<>�����ޣ������������� ]" , "");//ȥ��������
        char[] d=data.toCharArray();//���ļ����ݴ���һ��һά����

        return data;
    }

}
