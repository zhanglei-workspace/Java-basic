package encode;

import java.io.IOException;

public class HandleEncode
{

	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		//������ȷ������(iso8859-1)����Ĵ�����
		demo1();
		
		/*
		 * �½�һ���ı��ļ����ڸ��ı��ļ������롰��ͨ�������ַ������沢�ر��ı��ļ������´��ı��ļ��������ı��ļ��г��������롣
		 * ԭ�� ���롰��ͨ���ַ�ʱ��ʹ�õ���ϵͳĬ�ϵ����ı����GBK�����ı��ļ���һ��Ӧ�ó�����Ĭ��ʹ�õ���UTF-8���룬�����ٴδ�ʱ��������롣
         * ������������е������ı��ļ�ʱ��ѡ�����ΪUTF-8���뷽ʽ���Ͳ�����������ˡ�
		 */
	}

	public static void demo1() throws IOException
	{
		String str = "�������";
		byte[] buf = str.getBytes("GBK");
		
		//�������
		String str1 = new String(buf,"iso8859-1");
		System.out.println(str1);
		
		//�������Ľ���
		byte[] str2 = str1.getBytes("iso8859-1"); //��ȡԴ�ֽ�
		String buf2 = new String(str2,"GBK");
		
		System.out.println(buf2);//�����ǹ��ɹ�
	}

}
