package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPreceive
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		System.out.println("��������.......");
		/*
		 * ����UDP������ն�
		 * ˼·��
		 * 1.����socket���ֶ˿ڣ�
		 * 2.������(������)
		 * 3.��������
		 * 4.��������Ϣ
		 * 5.�ر���Դ
		 */
//		1.����socket���ֶ˿ڣ�
		DatagramSocket ds = new DatagramSocket(20000); //�˿ں�Ҫ�뷢�Ͷ����õ�һ�£�
		
//		2.���������ݰ�(������)
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length); //���� DatagramPacket���������ճ���Ϊ length �����ݰ���
		
//		 3.��������
		ds.receive(dp); //����յ����Ƿ��Ͷ˵��ֽ�����
		
//		4.��������Ϣ
		System.out.println(dp.getAddress().getHostAddress());
		System.out.println(dp.getPort());
		
		String data = new String(dp.getData(),0,dp.getLength());//�����յ�������Ϣ����Ϊ�ַ���
 		System.out.println(data);
		
// 		5.�ر���Դ
 		ds.close();
	}
}
