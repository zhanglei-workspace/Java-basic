package byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class A00FileByte
{


	/**
	 * �����ļ�������ͼƬ/mp3��mp4 ��
	 * �����ֽ���������������ַ�������
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		demo_write();
		demo_reader();
	}

	public static void demo_reader() throws IOException
	{
		FileInputStream fis = new FileInputStream("K:\\bytefile.txt");
		
		int ch = fis.read();
		System.out.println((char)ch);
		
		System.out.println(fis.available()); //�����ֽ�
		
		fis.close();
		
	}

	public static void demo_write() throws IOException
	{
		//�����ֽ������,����Ҫ��ʱ���壬ֱ��д��Ŀ�ĵ���
		FileOutputStream fos = new FileOutputStream("K:\\bytefile.txt",true);//true�������ļ�׷�ӵ����ļ�ĩβ
		
		fos.write("helloworldbyte".getBytes());
		
		fos.close();
		
		
	}

}
