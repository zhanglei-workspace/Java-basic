package chatbyUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPreceive
{

	/**
	 * @param args
	 * @throws IOException 
	 * �������dos���ڣ���ô set classpath=   �ð�����Chat����binĿ¼�µľ��Ե�ַ
	 * 
	 * java Chat.UDPsend
	 * �ɰ���ʼ�������У�����
	 * 
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
		 * 3.��������Ϣ
		 * 4.�ر���Դ
		 */
		//1.����socket���ֶ˿ڣ�
		DatagramSocket ds = new DatagramSocket(20000);
		
		while(true)
		{
			//2.������(������)
			byte[] buf = new byte[1024]; //1024�����ָ���ĳ���
			DatagramPacket dp = new DatagramPacket(buf,buf.length);
			
			// 3.��������
			ds.receive(dp); //����յ����Ƿ��Ͷ˵��ֽ�����
			
	//		3.��������Ϣ
	//		System.out.println(dp.getPort());
			
			String data = new String(dp.getData(),0,dp.getLength());//�����յ�������Ϣ����Ϊ�ַ���
				
	//			System.out.print(dp.getAddress().getHostAddress()+":");
				System.out.println(data);
				data = null;
		}
		
// 		ds.close();
	}

}
