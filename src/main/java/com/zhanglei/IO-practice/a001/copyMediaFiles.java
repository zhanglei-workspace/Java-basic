package a001;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class copyMediaFiles
{

//	private static final int BUFFER_SIZE = 1024;

	/**
	 * ����ͼƬ�ļ� 	C:\\Users\\u\\Pictures\\me\\03.png ---> k:\\copy3.png
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
//		copy_1(); //ʹ��buffered������
		copy_2();//���ƻ�����
		
	}

	
	/*
	 * buffered������
	 */
	private static void copy_1() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\u\\Pictures\\me\\03.png");
		BufferedInputStream bufis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("k:\\1111111111.png");
		BufferedOutputStream bufos = new BufferedOutputStream(fos);
		
		int length = 0;
		while ((length=bufis.read())!=-1)
		{
			bufos.write(length);
			bufos.flush();
			
		}
		
		bufis.close();
		bufos.close();
		
		
	}
	
	/*
	 * ���ƻ�����copy
	 */
	private static void copy_2() throws IOException
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\u\\Pictures\\me\\03.png");
		FileOutputStream fos = new FileOutputStream("k:\\22222222222.png");
		
		byte[] buf = new byte[1024];
		
		int length = 0;
		while ((length=fis.read(buf))!=-1) //��Ҫ����дread(buf) �е�buf��Ȼ��ѭ���ڶ�ȡһ���ֽ�
		{
			fos.write(buf,0,length);
			fos.flush();
		}
		
//		int ch = fis.read();
//		
//		while (ch!=-1)
//		{
//			fos.write(ch);
//		}
		
		fos.close();
		fis.close();
	}

}



