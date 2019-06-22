package a004;

import java.io.File;

public class DeleteDir
{

	/**
	 * ɾ��Ŀ¼�Լ�Ŀ¼���ļ�
	 * ˼·�����ﵽ��ɾ��
	 * @param args
	 */
	public static void main(String[] args)
	{
		File dir = new File("K:\\�ҵ���ѧ����");
		
		deleteDir(dir,0);
	}

	private static void deleteDir(File dir,int level)
	{
		System.out.println(getSpace(level)+dir.getName());
		level++;
		File[] files = dir.listFiles();
		
		for (File file : files)
		{
			if (file.isDirectory())
			{
					deleteDir(file,level);
			}else
				{
					System.out.println(getSpace(level)+file.getName()+file.delete());
				}
		}
		
		System.out.println("�տտ�--"+dir.getName()+dir.delete());//ɾ�����ļ���
		
	}
	
	/**
	 * ����Ŀ¼�ּ����пո�
	 * @param �ո���Ŀ
	 * @return �ո�
	 */
	private static String getSpace(int level)
	{
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < level; i++)
		{
			sb.append("  ");
		}
		return sb.toString();
	}

}
