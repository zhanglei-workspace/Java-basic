package charStream;

import java.io.FileReader;
import java.io.IOException;


public class A002FileReader02
{

	/**
	 * @param args
	 * ��ȡһ���ļ����ݣ������ӡ������̨
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		/*
		 * ������ȡ�ַ����Ķ���
		 */
		FileReader fr = new FileReader("C:\\Users\\u\\Desktop\\���ֽ���\\���ֽ���.txt");
		
		/*
		 * ʹ��read(char[])��ȡ����
		 * �ȴ����ַ�����
		 */
		 char[] buf = new char[1024];
//		 int length = fr.read(buf); //����ȡ�����ַ��洢�������У�numΪ��ȡ���ĸ���
		 
		 int length = 0;
		 
		 while ((length=fr.read(buf))!=-1)
		{
			
			 System.out.println("���ȣ�"+length+"\n\n\n"+new String(buf,0,length)+"\t");
		}
		 
	}

}
