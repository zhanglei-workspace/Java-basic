package chatbyTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{

	/**
	 * TCP �����
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		//1.����serversocket����
		ServerSocket ss = new ServerSocket(10008);
 		
		//2.��ȡ���ӹ����Ŀͻ��˶���
		Socket s = ss.accept();
		
		InetAddress ip = s.getInetAddress();//�ͻ���ip
		
			
			//��ȡ��������Ϣ
			BufferedReader bufin = new BufferedReader(new InputStreamReader(s.getInputStream()));
//			InputStream in = s.getInputStream(); //��ȡ��Ϣ
//			
//			byte[] buf = new byte[1024];
//			int length = in.read(buf);
//			String receive = new String(buf,0,length);
			
			String line = null;
			while ((line=bufin.readLine())!=null)
			{
				
				
				
				if ("8686".equals(bufin))
				{
					System.out.println(ip+"...........�˳�������");
//				//4.�ر���
					s.close();
					ss.close();
				}else 
					{
						System.out.println(ip+":"+line);
						//3.���ظ����Ͷ���Ϣ
						OutputStream out = s.getOutputStream();
						out.write("�յ���".getBytes());
					}
			}
			
		

	}

}
