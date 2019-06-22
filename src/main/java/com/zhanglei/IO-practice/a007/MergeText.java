package a007;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class MergeText
{

	/**
	 * ���󣺽� 1.txt 2.txt 3.txt �ϲ���һ���ļ�4.txt�У�Ҳ���Ժϲ�������ʽ)
	 * 
	 * ����������SequenceInputStream��
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		getDemo1();
		getDemo2();
		
	}
	
	/**
	 * ����Vector�ϲ�
	 * @throws IOException
	 */
	private static void getDemo1() throws IOException
	{
		Vector<InputStream> v = new Vector<InputStream>();
		v.add(new FileInputStream("K:\\11\\1.txt"));
		v.add(new FileInputStream("K:\\11\\2.txt"));
		v.add(new FileInputStream("K:\\11\\3.txt"));
		
		Enumeration<InputStream> en = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream("K:\\11\\4.txt");

		byte[] buf = new byte[1024];
		int len = 0;
		while ((len=sis.read(buf))!=-1)
		{
			fos.write(buf,0,len);
		}
		
		sis.close();
		fos.close();
	}
	
	/**
	 * ���ø�Ч�ʵ�ArrayList�ϲ�
	 * @throws IOException
	 */
	private static void getDemo2() throws IOException
	{
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		for (int i = 1; i <= 3; i++)
		{
			al.add(new FileInputStream("K:\\11"+i+".txt"));
		}
		
		Enumeration<FileInputStream> en = Collections.enumeration(al);
		
		SequenceInputStream sis = new SequenceInputStream(en);//�ϲ�����������������ϲ���һ��SequenceInputStream������
		
		FileOutputStream fos = new FileOutputStream("K:\\11\\4.txt");

		byte[] buf = new byte[1024];
		int len = 0;
		while ((len=sis.read(buf))!=-1)
		{
			fos.write(buf,0,len);
		}
		
		sis.close();
		fos.close();
	}

}
