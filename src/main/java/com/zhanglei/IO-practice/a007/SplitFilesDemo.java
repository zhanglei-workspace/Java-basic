package a007;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SplitFilesDemo
{

	private static final int SIZE = 1024*1024;

	/**
	 * �����ļ��и���
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		File file = new File("K:\\11\\���.mp3");
		
		splitFiles(file);
	}

	/**
	 * �и�Ŀ���ļ�����Ƭ�洢��ָ��Ŀ¼��
	 * @param file
	 * @throws IOException
	 */
	private static void splitFiles(File file) throws IOException
	{
		FileInputStream fis = new FileInputStream(file);
		
		FileOutputStream fos = null;
		
		File dir = new File("K:\\11\\store");//�и����Ƭ�洢Ŀ¼
		if (!dir.exists())
		{
			dir.mkdir();
		}
		int count = 1;//�и����Ƭ�󴢴���ļ�����
		
		//���ƻ�����
		byte[] buf = new byte[SIZE];
		int len = 0;
		while ((len=fis.read(buf))!=-1)
		{
			fos = new FileOutputStream(new File(dir,(count++)+".part"));//�������ļ�
			fos.write(buf,0,len);
		}
		
		fos.close();
		fis.close();
	}
	
	

}
