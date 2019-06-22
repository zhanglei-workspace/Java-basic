package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ����property ��������в���
 * @author lyons(zhanglei)
 * @date Feb 13, 2016
 */

public class PropertiesTest
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
// 		propertyDemo1();
// 		writeToTxt();//����ֵ�Դ��浽�ļ���
 		readByTxt();//ȡ����ֵ��
 		
	}
	
	/**
	 * ȡ����ֵ��
	 * @throws IOException
	 */
	private static void readByTxt() throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("k:\\my.txt");
		
		prop.load(fis);
		
		prop.list(System.out);
	}

	/**
	 * property ��������
	 */
	private static void propertyDemo1()
	{
		Properties prop = new Properties();
		
		//�洢Ԫ��
		prop.setProperty("shuxing","zhi");
		prop.setProperty("ok","12");
		
		//��ӡԪ�ص�����̨��������
		prop.list(System.out);
		
		//�޸�Ԫ��
		prop.setProperty("ok", "456");
		
		//ȡ��Ԫ��
		System.out.println(prop.getProperty("shuxing"));
	}
	
	
	/**
	 * ����ֵ�Դ����ļ���
	 * @throws FileNotFoundException 
	 */
	private static void writeToTxt() throws IOException
	{
		Properties prop = new Properties();
		
		prop.setProperty("name", "lyons");
		prop.setProperty("age", "11");
		
		FileOutputStream fos = new FileOutputStream("k:\\my.txt");
		
		prop.store(fos, "name+age");//�ڶ�������Ϊ������Ϣ
		
		prop.clone();
		fos.close();
	}
}
