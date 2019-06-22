package chatbyUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive implements Runnable
{
	
	private DatagramSocket ds;
	public Receive(DatagramSocket ds)
	{
		this.ds = ds;
	}

	public void run()
	{
			try
			{
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
						
					if ("8686".equals(data))
					{
						System.out.println(dp.getAddress().getHostAddress()+".......�˳������ң�");
					}else 
						{
							System.out.print("Receive:"+dp.getAddress().getHostAddress()+":");
							System.out.println(data);
						}
					
				}
			} catch (IOException e)
			{
				e.printStackTrace();
			}
	}

}
