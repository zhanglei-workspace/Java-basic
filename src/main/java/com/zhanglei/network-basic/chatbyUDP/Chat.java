package chatbyUDP;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Chat
{

	/**
	 * ���߳�ʵ��ͬһ���������죡
	 * @param args
	 * ip�ڵ��ĶΣ� 0�����ã�255Ϊ�㲥
	 * @throws SocketException 
	 */
	public static void main(String[] args) throws SocketException
	{
		DatagramSocket send    = new DatagramSocket();
		DatagramSocket receive = new DatagramSocket(20002);
		
		new Thread(new Send(send)).start(); 		//���������߳�
		new Thread(new Receive(receive)).start();	//���������߳�
		

	}

}
