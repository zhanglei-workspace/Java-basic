package charStream;

import java.io.FileReader;
import java.io.IOException;

public class A002FileReader01
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
		FileReader fr = new FileReader("E:\\rabbish all\\Temp\\iowrite.txt");
		
//		int ch = fr.read();���ص���int ��
		int length = 0;
		while ((length=fr.read())!=-1) //��Ϊ��һ���ļ�����ȡ���֮�󷵻�ֵΪ-1
		{
			System.out.print((char)length); // char �������ǽ���ȡ����ASCII��ֵת��Ϊ�ַ��� 
		}
	}

}
