package a003;

import java.io.File;

public class AlldirTest
{

	/**
	 * ��ȱ���ָ��Ŀ¼�����ļ�
	 * @param args
	 */
	public static void main(String[] args)
	{
		File dir = new File("E:\\�ҵ���ѧ����");
		allDir(dir,0);
	}

	private static void allDir(File dir,int level)
	{
		System.out.println(printSpace(level)+dir.getName());
		level++;//�ո������
		File[] files = dir.listFiles();
		
		for (File file : files)
		{
			//��Ŀ¼�����ݹ����������ֱ�Ӵ�ӡ
			if (file.isDirectory())
			{
				allDir(file, level);
			} else
				{
					System.out.println(printSpace(level)+file.getName());
				}
		}
	}
	
	/**
	 * ����Ŀ¼�ּ����пո�
	 * @param �ո���Ŀ
	 * @return �ո�
	 */
	private static String printSpace(int level)
	{
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < level; i++)
		{
			sb.append("   ");
		}
		return sb.toString();
	}

}
