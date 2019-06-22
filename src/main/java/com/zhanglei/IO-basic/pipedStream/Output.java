package pipedStream;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Output implements Runnable
{
	private PipedOutputStream out;
	
	public Output(PipedOutputStream out)
	{
		this.out = out;
	}

	public void run()
	{
		try
		{
			Thread.sleep(1000);//�ȴ�һ�£�Ŀ�����ڹ۲�Ч��
			out.write("�ܵ�������".getBytes());
		} catch (Exception e)
		{
			// TODO: handle exception
		}finally
		{
			try
			{
				out.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}