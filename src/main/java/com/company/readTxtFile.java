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

        if(s==null){
            System.out.println("�ı�Ϊ��");
            return null;
        }
        BufferedReader br = null;
        StringBuffer sb = null;

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
        //ȥ��������
        data = data.replaceAll( "[\\pP+~$`^=|<>�����ޣ������������� ]" , "");

        return data;

    }

}
