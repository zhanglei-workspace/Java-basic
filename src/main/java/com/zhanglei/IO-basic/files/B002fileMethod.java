package files;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class B002fileMethod
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
//		getDemo();//��ȡ�ļ�������ֵ
//		getDir();//Ŀ¼����
//		isDemo();//�ж�
//		rename();//ճ��or ������
		allDir();//��ȡ��ǰĿ¼�µ��ļ���Ŀ¼�����֣���������Ŀ¼���ļ��У�
		
	}
	
	/**
	 * ��ʾ��ǰĿ¼���ļ���Ŀ¼������
	 */
	private static void allDir()
	{
		File dir = new File("c://");//�˵ط���װ�ı�����Ŀ¼�������ָ���쳣
		
		String[] dirs = dir.list();
		
		for (String string : dirs)
		{
			System.out.println(string);
		}
		
		
	}


	private static void rename()
	{
		//��·�� file1=file2 ʱ����������������ճ����
		
		File file1 = new File("k://default.txt");
		
		File file2 = new File("E://a.txt");
		
		System.out.println(file1.renameTo(file2)); 
		
		
		
	}


	/**
	 * �ж��ļ��Ƿ���ڣ���Ŀ¼����ļ���
	 */
	private static void isDemo()
	{
		File file = new File("K:\\a.txt");
		
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
	}


	/**
	 * ��Ŀ¼����CRUD
	 * @throws IOException 
	 */
	
	private static void getDir() throws IOException
	{
		File dir = new File("k://dir//my//my.txt");
		
		//mkdir()   ����������Ѿ����ڵ��ļ����½����µ��ļ��У����Ϳ����ô˷�����
		//          �˷��������ڲ����ڵ��ļ����½����µ��ļ��С�

		//mkdirs()  ����������File���·���������ļ��У����㲻֪�����ļ����Ƿ���ڣ�Ҳ��֪�����ļ��д��ڣ����Ϳ��ô˷�����
		//          �������ļ��е�ԭ���ǣ�������ļ��в����ڲ������һ�����ļ��в����ڣ������Զ��½�����·����д���ļ��У�
		//          ������ļ��д��ڣ�����ֱ�����Ѿ����ڵĸ��ļ������½����ļ��С�
		
		dir.mkdir();
		dir.mkdirs();
		
		dir.delete();
		
		boolean flag = dir.createNewFile();//���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ���
		System.out.println(flag);
	}

	/**
	 * ��ȡ�ļ���
	 * 		����
	 * 		·��
	 * 		��С
	 * 		�޸�ʱ��
	 * 
	 */
	private static void getDemo()
	{
		File file = new File("k:\\myGitHub");
		
		String name = file.getName();
		
		String path1 = file.getAbsolutePath();//����·��
		String path2 = file.getPath();//���·��
		
		long len = file.length();
		
		long time = file.lastModified();
		Date date = new Date(time);
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);  //û�о�����
		String date_format = dateFormat.format(date);
		
		
		
		System.out.println("name:"+name);
		System.out.println("path1:"+path1);
		System.out.println("path2:"+path2);
		System.out.println("len:"+len);
		
		System.out.println("time:"+time);
		System.out.println("date_format:"+date_format);
		
	}
	



}
