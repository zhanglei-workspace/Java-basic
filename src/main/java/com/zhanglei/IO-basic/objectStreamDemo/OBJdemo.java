package objectStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OBJdemo
{

	/**
	 * 1.��Persion�������л��������еĶ��󴢴浽Ӳ����
	 * 2.��ȡӲ���ϵĶ���
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception
	{
//		writeObj();
		readObj();
	}

	/**
	 * 1.��Persion�������л��������еĶ��󴢴浽Ӳ����
	 * @throws IOException
	 */
	private static void writeObj() throws IOException
	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("K:\\11\\obj.Object")); //��׺ΪObject
		
		//�������л��������л��Ķ������ʵ��Serializable�ӿ�
		oos.writeObject(new Persion("lyons",24));
		
		oos.close();
	}

	/**
	 * 2.��ȡӲ���ϵĶ���
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	private static void readObj() throws IOException, ClassNotFoundException
	{
		//ObjectInputStreamֻ�ܶ�ȡObjectOutputStreamд��Ķ���
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("K:\\11\\obj.Object"));
		//����ķ����л�
		Persion p = (Persion)ois.readObject(); //������֪����Object�����ڴ洢����Persion���󣬹���Persion���ͣ�������ǿ��ת��
		
		//��ӡ
		System.out.println(p.getName()+":"+p.getAge());
		
		ois.close();
	}
}
