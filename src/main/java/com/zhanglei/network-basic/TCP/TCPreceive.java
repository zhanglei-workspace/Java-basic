package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPreceive
{

	/**
	 * TCP �ͻ���
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		//1.����serversocket����
		ServerSocket ss = new ServerSocket(10001);
 		
		//2.��ȡ���ӹ����Ŀͻ��˶���
		Socket s = ss.accept();
		
		//��ȡ��������Ϣ
			InputStream in = s.getInputStream(); //��ȡ��Ϣ
			
			byte[] buf = new byte[1024];
			int length = in.read(buf);
			String text = new String(buf,0,length);
			
			System.out.println(text);
//			String buf = new String(new byte[1024],0,in.le);
		//3.�ر���
			s.close();
			ss.close();
	}

}
