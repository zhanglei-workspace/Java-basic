package charStream;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A003BufferedWrite
{

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");//����ϵͳ�Ļ��з�ʽ

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
	
		FileWriter fw = new FileWriter("K:\\write.txt");
		
		
		//���Ч�ʣ�ʹ���ַ���������
		//����һ���ַ�д�����Ķ���,��Ҫ������Ķ������
		BufferedWriter bufw = new BufferedWriter(fw);
		
		
		//ʹ�û������ķ������в���
		bufw.write("����ͨ��������������"+LINE_SEPARATOR+"���ǻ��й�����");
		bufw.flush();
		
		
		bufw.close();//�رջ���������Ҫ��ˢ������ ��ʵ�ǹر�д����
		
		
		
	}

}
