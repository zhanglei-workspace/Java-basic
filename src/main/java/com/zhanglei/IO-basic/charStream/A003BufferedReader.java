package charStream;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A003BufferedReader
{

//	private static final String LINE_SEPARATOR = System.getProperty("line.separator");//����ϵͳ�Ļ��з�ʽ

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
	
		FileReader fr = new FileReader("k://copy.txt");
		
		BufferedReader bufr = new BufferedReader(fr);
		
		String line = null;
		while ((line=bufr.readLine())!=null) //readline() ��ȡһ���ı��С�ͨ�������ַ�֮һ������Ϊĳ������ֹ������ ('\n')���س� ('\r') ��س���ֱ�Ӹ��Ż��С�  �ﵽ��ĩβ����null
		{
			System.out.println(line);
		}
		
		bufr.close();
		
		
		
	}

}
