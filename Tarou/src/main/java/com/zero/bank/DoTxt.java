package com.zero.bank;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.*;

public class DoTxt {
	
	public static void CreateTxt(String content)
	{
		String fileName = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
		File file = new File("D:\\mylog\\"+fileName+".txt");
		try{
			file.createNewFile();
			OutputStreamWriter w = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
			BufferedWriter bw = new BufferedWriter(w);
			bw.write(content);
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
	
	public static String ReadTxt(String filePath){
		String s = "";
        try {
                String encoding="GBK";
                System.out.println("报文路径: " + filePath);
                File file=new File(filePath);
                if(file.isFile() && file.exists()) { //�ж��ļ��Ƿ����
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//���ǵ������ʽ
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineTxt = null; //
                    while((lineTxt = bufferedReader.readLine()) != null){
                        s =s+lineTxt;
                    }
                    read.close();
                    s = s.replace("\r", "");
                    s = s.replace("\n", "");
                    s = s.replace(" ", "");
                    s = s.replace("\t", "");
                    return s;
        }else{
            s = "�Ҳ���ָ�����ļ�";
        	System.out.println("�Ҳ���ָ�����ļ�-else-1");
            return s;
        }
        } catch (Exception e) {
            System.out.println("��ȡ�ļ����ݳ���-catch-1");
            return e.toString();
        }
	}

}
