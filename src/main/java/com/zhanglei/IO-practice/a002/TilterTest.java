package a002;

import java.io.File;

public class TilterTest
{

	/**
	 * 1.���������ļ�
	 * 2.�����ļ����ƹ����ļ�
	 * 3.��������ָ�����ļ���׺�����ļ�
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		
//		hiddenDemo();//�����ļ�
		
//		dirDemo(); // 2.�����ļ����ƹ����ļ�
		
		suffixDemo();//3.��������ָ�����ļ���׺�����ļ�
		
		

	}
	/**
	 * 
	 * @param 
	 * @return void
	 */

	private static void suffixDemo()
	{
		File dir = new File("C://");
		
		String[] name = dir.list(new Suffixfilter(".dll"));
		
		for (String string : name)
		{
			System.out.println(string);
		}
		
	}

	
	private static void hiddenDemo()
	{
		File dir = new File("C://");
		
		File[] names = dir.listFiles(new FilterByHidden());
		
		for (File file : names)
		{
			
			System.out.println(file);
			
		}
		
	}

	private static void dirDemo()
	{
		File dir = new File("C://");
		
		String[] name = dir.list(new FilterByJava());
		
		for (String string : name)
		{
			System.out.println(string);
		}
	}
	
	
	

}
