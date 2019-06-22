package chatbyUDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		while (true)
		{
			BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));//�ӿ���̨��ȡ��Ϣ
			
			String line = null;
			while ((line=bufRead.readLine()) != null)
			{
				
				
				//ʹ��DatagramPacket �����ݷ�װ���ö������
				byte[] buf = line.getBytes();
				
				DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.31.190"),20000);
				//      ���ĳ���							���͵�Ŀ������ 	Ŀ�������˿ں� 
				
				//3.ʹ��UDP��socket�����send����
				ds.send(dp);
				
				//4.�ر�socket����
				if ("exit".equals(line))
				{
					ds.close();
					break;
				}
			}
		}
	}

}
