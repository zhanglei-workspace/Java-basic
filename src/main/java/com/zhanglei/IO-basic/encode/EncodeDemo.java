package encode;

import java.io.IOException;

public class EncodeDemo
{

	/**
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException
	{
		/*
		 * ��ã� GBK -60 -29 -70 -61
		 * ��ã� UTF-8  -28 -67 -96 -27 -91 -67
		 */
		String str = "���";
		
		//����
		byte[] buf = str.getBytes("UTF-8");
		
		printBuf(buf);
		
		//����
		String str1 = new String(buf,"UTF-8");
		
		System.out.println(str1);
		
		
		/*//ʵ��GBK�����ֽ�����UTF-8�����ֽ�����ת��
		byte[] src,dst;
		dst=new String(src,"GBK").getBytes("UTF-8");*/
	}

	public static void printBuf(byte[] buf)
	{
		for (byte b : buf)
		{
			System.out.print(b+" ");
		}
	}

}
