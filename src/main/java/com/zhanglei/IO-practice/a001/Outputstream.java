package a001;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Outputstream
{

	/**
	 * ���󣺽������ַ�������ָ�������д���ļ��С�
	 * 
	 * ������
	 *		����Ҫָ������ʲ���ʹ���ڲ�Ĭ��ʹ�ñ�������FileWriter.
	 *		ʹ��ת����
	 *
	 *
	 *��������õ�ת������
	 *
	 *1.Դ��Ŀ�Ķ�Ӧ���豸���ֽ�������������ȴ���ı����ݣ�������ת����Ϊ������
	 *
	 *2.�����ı��漰��ָ���ı����ʱ������Ҫ��ת����
	 *
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		
		
		String setcharName = "utf-8"; //�������
//		String setcharName = "GBK"; //������� gbkһ������2���ֽ�
//		new OutputStreamWriter(new FileOutputStream(""),charsetName)
//		
//		BufferedWriter buf = new BufferedWriter();
		
		BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("k:\\GBK.txt"),setcharName));
		
		buf.write("���");
		
		buf.flush();
		
		buf.close();
		
		
		
	}

}
