package a005;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GetAppCount
{

	/**
	 * �����ο�ʹ���������������������ʾע�����ʹ��
	 * ˼·��
	 *  1.��/���� �ļ�
	 *  2.�޸Ĵ��������ü��ϣ�
	 *  3.����д��
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		GetAppcount();
	}
	
	/**
	 * �����ο�ʹ���������������������ʾע�����ʹ��
	 * @throws IOException
	 */
	private static void GetAppcount() throws IOException
	{
		File confile = new File("K:\\count.properties");
		if (!confile.exists())
		{
			confile.createNewFile();
		}
		FileInputStream fis = new FileInputStream(confile);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		//�Ӽ�����ͨ������ȡ����
		String value = prop.getProperty("times");
		
		//�������������ȡ��¼����
		int count = 0;
		if (value!=null)
		{
			count = Integer.parseInt(value);
			if (count>=5)
			{
				throw new RuntimeException("ʹ�ô����ѵ���ע�����ʹ��");
			}
		}
		count++;
		
		//���ı��Ĵ������´��浽������
		prop.setProperty("times", count+"");
		FileOutputStream fos = new FileOutputStream(confile);
		prop.store(fos, "count-Test");
		
		fos.close();
		fis.close();
	}

}
