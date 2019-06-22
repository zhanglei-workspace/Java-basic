package a001;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class copyTextFiles
{

	private static final int BUFFER_SIZE = 1024;

	/**
	 * �����ı��ļ� D:\\fg.ini ---> k:\\copy.txt
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
/*		copy_1(); //���ƻ�����
		copy_2();//ʹ��buffered������
*/		copy_3();
	}
	
	private static void copy_1() throws IOException
	{
			
		//��Ч�ʵĸ��ƣ������������л�������Ч�ʵ�copy
		FileReader fr = new FileReader("D:\\fg.ini");
		FileWriter fw = new FileWriter("k:\\copy2.txt",true);
		char[] buf = new char[BUFFER_SIZE]; //�Լ�new������
		int length = 0;
		while ((length=fr.read(buf))!=-1) //jdk1.80 �ͱ������������������û���������
		{
			fw.write(new String(buf,0,length));
		}
		
		fr.close();
		fw.close();
	}

	private static void copy_2() throws IOException
	{
		FileReader fr = new FileReader("D:\\fg.ini");
		BufferedReader bufr = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("k:\\copy1.txt",true);
		BufferedWriter bufw = new BufferedWriter(fw);
		
		
		String line = null;
		while ((line=bufr.readLine())!=null)
		{
			bufw.write(line);
			bufw.newLine(); //����
			bufw.flush();
		}
		
		bufr.close();
		bufw.close();
		
	}

	/**
	 * ��ȡʱ���ֽ���ת��Ϊ�ַ���
	 * д��ʱ���ַ���ת��Ϊ�ֽ���
	 * @throws IOException
	 */
	public static void copy_3() throws IOException
	{
		BufferedReader bufr = new BufferedReader(new InputStreamReader((new FileInputStream("D:\\fg.ini")),"GBK")); //FIleInputStream �ܴ������д����������͵����ݣ�����ָ�����ָ����������ת������
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter((new FileOutputStream("k:\\copy3.txt"))));
		
		
		String line = null;
		while ((line=bufr.readLine())!=null)
		{
			bufw.write(line);
			bufw.newLine(); //����
			bufw.flush();
		}
		
		bufr.close();
		bufw.close();
	}
	
	
	
	

}



