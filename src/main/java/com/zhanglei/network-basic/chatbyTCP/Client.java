package chatbyTCP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client
{

	/**
	 * TCP�ͻ���
	 * �����ȿ�����˺󿪿ͻ���
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		//����socket����
		Socket socket = new Socket("192.168.31.190",10008); //��������ʱ��Ҫȷ��������������ip��ַ���˿ں�
		
		while (true)
		{
			
			//ʹ��socket�����
			OutputStream out = socket.getOutputStream();
			
			//д������
			BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			
			while ((line=bufRead.readLine())!=null)
			{
				out.write(line.getBytes());
//			out.write("�����TCP����������".getBytes()); //ͬ���ģ���Ҫ����Ϣת�����ֽڷ���
				
				if ("8686".equals(line))
				{
					
					//�ر�socke����
					socket.close();		//������д�ر�OutputStream out������Ϊ����socket�µ�����
					break;
				}
				
				//��ȡ���������
//				InputStream in = socket.getInputStream();
//				byte[] buf = new byte[1024];
//				int length = in.read(buf);
//				
//				String text = new String(buf,0,length);
//				System.out.println(text);
			}
			break;
		}
	}

}
