package test01;

import java.util.LinkedList;

public class Queue
{
	private LinkedList link;
	public Queue()
	{
		link = new LinkedList();
	}
	/*
	 * ���е����
	 */
	public void myAdd(Object object)
	{
		link.add(object);
	}
	
	public Object myGet()
	{
		return link.removeFirst();//���ز�ɾ��
	}
	
	public boolean isNull()
	{
		return link.isEmpty();
	}
}
