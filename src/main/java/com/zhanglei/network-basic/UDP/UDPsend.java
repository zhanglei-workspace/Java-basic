package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPsend
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		System.out.println("��������........");
		/*
		 * ����UDP����ķ��Ͷ�
		 * ˼·��
		 * 1.����UDP��socket����
		 * 2.�����͵����ݷ�װ�����ݰ���
		 * 3.ͨ��UDP��socket������
		 * 4.�ر�socket��Դ
		 */
		
		//1.ʹ��DatagramSocket���� ����UDP��socket����
		DatagramSocket ds = new DatagramSocket();
		
		//2.�����͵����ݷ�װ�����ݰ���
		String str = "���Ǵ�磬i am coming,���Ƕ��յ��ͳɹ���";
			//ʹ��DatagramPacket �����ݷ�װ���ö������
			byte[] buf = str.getBytes();
			
			DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("169.254.191.49"),20000);
												//      ���ĳ���							���͵�Ŀ������ 	Ŀ�������˿ں� 
		
		//3.ʹ��UDP��socket�����send����
			ds.send(dp);
			
		//4.�ر�socket����
			ds.close();
	}
}
