package about;

import java.io.IOException;

public class A02
{

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		
		Runtime t = Runtime.getRuntime();
		Process p  = t.exec("notepad.exe C:\\000000mycenter\\cywin���ƿ���̨.txt");//�ü��±���һ���ļ�
		
		Thread.sleep(500);//�ȴ�700����
		p.destroy();//�ر�

	}

}
