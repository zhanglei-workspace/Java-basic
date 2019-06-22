package randomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF
{

	/**
	 * RandomAccessFile�������д�ļ���
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
//		writeFile();
		
		readFile();
	}

	public static void readFile() throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("K:\\11\\random.txt","r");
		
		//ͨ��seek����ָ��λ��
//		raf.seek(1*2);//�����ȡ��ֻ��ָ��ָ���λ�ü���
		
		int age = raf.readInt();
		
		byte[] buf = new byte[20];
		raf.read(buf);
		
		String name = new String(buf);
		
		System.out.println("age:"+age);
		System.out.println("name:"+name);
		System.out.println("pos:"+raf.getFilePointer());
		

		raf.close();
	}

	public static void writeFile() throws IOException
	{
		//д����Ա��Ϣ
		RandomAccessFile raf = new RandomAccessFile("K:\\11\\random.txt","rw");
		
		//ָ���洢λ��
//		raf.seek(2);
		
		raf.write("�й�".getBytes());
		raf.writeInt(7);
//		raf.write(187);
		
		raf.close();
	}

}
