package dataStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataDemo
{

	/**
	 * ����������������
	 * DataStream
	 * �洢ʱ����UTF-8 �޸İ��ͷ
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
//		WriteData();
		ReadData();
	}

	public static void ReadData() throws IOException
	{
		DataInputStream dis = new DataInputStream(new FileInputStream("K:\\11\\hello.txt"));
		
		String str = dis.readUTF();
		
		System.out.println(str);
		
		dis.close();
		
	}

	public static void WriteData() throws IOException
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("K:\\11\\hello.txt"));
		
		dos.writeUTF("�����ַ�");
		
		dos.close();
	}

}
