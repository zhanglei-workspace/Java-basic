package TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPsend
{

	/**
	 * TCP���Ͷ�
	 * �����ȿ�����˺󿪷��Ͷ�
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		//����socket����
		Socket socket = new Socket("169.254.211.248",10001); //��������ʱ��Ҫȷ��������������ip��ַ���˿ں�
		
		//ʹ��socket�����
		OutputStream out = socket.getOutputStream();
		
		//д������
		out.write("�����TCP����������".getBytes()); //ͬ���ģ���Ҫ����Ϣת�����ֽڷ���
		
		//�ر�socke����
		socket.close();		//������д�ر�OutputStream out������Ϊ����socket�µ�����

	}

}
