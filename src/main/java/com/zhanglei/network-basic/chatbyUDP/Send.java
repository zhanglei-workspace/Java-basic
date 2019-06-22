package chatbyUDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Send implements Runnable
{
	private DatagramSocket ds;
	public Send(DatagramSocket ds)
	{
		this.ds = ds;
	}
	
	public void run()
	{
		try
		{
			System.out.print("send:");
			//2.�����͵����ݷ�װ�����ݰ���
			while (true)
			{
				BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));//�ӿ���̨��ȡ��Ϣ
				
				String line = null;
				while((line=bufRead.readLine()) != null)
				{
					//ʹ��DatagramPacket �����ݷ�װ���ö������
					byte[] buf = line.getBytes();
					
					DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("169.254.191.49"),20002);
					//      ���ĳ���							���͵�Ŀ������ 	Ŀ�������˿ں� 
					
					//3.ʹ��UDP��socket�����send����
					ds.send(dp);
					
					//4.�ر�socket����
					if ("8686".equals(line))
					{
						System.out.println("send serve is closed");
						ds.close(); //4.�ر�socket����
						break;
					}
				}
			 break;
			}
		} catch (UnknownHostException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
