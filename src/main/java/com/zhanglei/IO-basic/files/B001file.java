package files;

import java.io.File;


public class B001file
{

	/**
	 * �����ļ���
	 * @param args
	 */
	public static void main(String[] args)
	{
		//�����ڻ��߲����ڵ��ļ���Ŀ¼��װ��file����
		
		
		File f1 = new File("k:\\a.txt");
		
		File f2 = new File("K:\\","a.txt");
		
		File f  = new File("K:\\");
		File f3 = new File("a.txt");
		
		File f4 = new File("C:",File.separator+"a.txt"); //Fiϵͳ���ڲ��ķָ����ǲ�һ����  \\  ;
		System.out.println(f4);
		
	}

}
