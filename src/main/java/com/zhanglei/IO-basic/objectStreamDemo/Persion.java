package objectStreamDemo;

import java.io.Serializable;


/**
 * Serializable�����ڸ������л������ID��
 * ���ã��ж���Ͷ����Ƿ�Ϊͬһ�汾
 * 
 */
public class Persion implements Serializable //����ʵ�ִ˽ӿ�
{

	/**
	 * ���кţ����Զ�����ֵ
	 */
	private static final long serialVersionUID = 123456L;
	
//���ؼ��� transient �� static ���εĵ��ֶβ��ܱ����л���Ӳ����
//������Ҫ���л�������ǰ��ӹؼ���transient�����л������ʱ��������ԾͲ������л���ָ����Ŀ�ĵ���
//	private transient String name;
//	private static int age;
	private String name;
	private int age;
	
	public Persion(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	//get��set
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

}
