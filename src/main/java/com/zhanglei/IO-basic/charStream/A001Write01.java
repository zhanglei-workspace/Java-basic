package charStream;


import java.io.FileWriter;
import java.io.IOException;

public class A001Write01
{

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");//����ϵͳ�Ļ��з�ʽ

	/**
	 * @param args
	 * �ַ����������ı��ļ�������txt,ini���ı���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
	
		/* 
		 * ����һ���������ļ���д���ַ����ݵ� �ַ����������
		   ��������ʱ�;ͱ���д�����ļ��Ĵ����ַ
		   *
		   *�ļ����ڣ��򸲸ǡ��ļ������ڣ��򴴽����ļ���(������캯���м���true�򲻸��ǣ�������д)
		   */
		FileWriter fw = new FileWriter("E:\\rabbish all\\Temp\\iowrite.txt",true);
	
		/*
		 * ����write�����е�write��String��������д������
		 * ��ʵ����д�뵽����ʱ��������
		 */
			fw.write("����resgseg\rfsd�����fs������\n"+LINE_SEPARATOR+"ǰ�����LINE_SEPARATOR�ǻ����õ�"); // /n��Ȼ�����ټ��±��б�ʶ�𣬵����ڵײ�/n�Ǳ������ˣ�����ȡ�����ļ���ӡ������̨��֤����
/*		
		 * ����ˢ�£���������������д��Ŀ���ļ�
		 */
			fw.flush();
		 
	   //�ر���
			fw.close();//�ر�ǰ���ȵ���flush()������������Ϣд�뵽Ŀ�ĵ�
		
		
	}

}
