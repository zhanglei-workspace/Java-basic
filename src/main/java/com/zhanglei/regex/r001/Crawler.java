package r001;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler
{

	/**
	 * getqqs() ��ȡqqȺ�����г�Ա������ (�Ѵ���ҳ�л�ȡHTML��Դ �ŵ�����  K:\Crawler.txt)
	 * 
	 * getByWeb(); �����ȡqqȺ�����г�Ա������
	 */
	public static void main(String[] args) throws IOException
	{
		int count = 0;
		//��ȡ�����ļ�
		List<String> qqs = getqqs();
		
		for (String qq : qqs)
		{
			System.out.print(qq.replaceAll("[(]([\\d]+)[)]", "$1@qq.com;")+"\t");
			count+=1;
			if (count%8 == 0)
			{
				System.out.println();
			}
		}
		System.out.println();
		System.err.println("----------");
		System.out.println("������ȡqqȺ����Чqq����������"+count+"��");
		
		/**
		 * ��ȡ�����ļ�
		 */
		/*int count = 0;
		List<String> sources = getByWeb();
		
		for (String source : sources)
		{
			System.out.print(source.replaceAll("[(]([\\d]+)[)]", "$1@qq.com;")+"\t");
			count+=1;
			if (count%5 == 0)
			{
				System.out.println();
			}
			
		}
		System.out.println(count);*/
	}
	
	/*
	 * ������ȡqq�ţ�
	 */
	
	public static List<String> getqqs() throws IOException
	{
		
		List<String> list = new ArrayList<String>();
		
//		1.�򿪱���Դ�ļ�
		BufferedReader source = new BufferedReader(new FileReader("K:\\Crawler.html"));
//		2.����ƥ��
		String regex = "[(]\\d+[)]";
		Pattern p = Pattern.compile(regex);
		
		String line = null;
		while ( (line=source.readLine())!=null ) //�򿪵�Դ�ļ�����ÿ������Ϣ�ͽ���ƥ��
		{
			Matcher m = p.matcher(line);
			while (m.find())
			{
				//����������ݶ��洢��������
				list.add(m.group());
			}
		}
		return list;
	}
	
	/**
	 * ��ȡ��ҳqq��
	 * 
	 */
	private static List<String> getByWeb() throws IOException
	{
	List<String> list = new ArrayList<String>();
		
//		1.��webԴ�ļ�
		
		URL url = new URL("http://localhost:8080/SuperMembershipGMS/Crawler2.html"); //urlΪqqȺ�ռ�鿴Ⱥ��Ա��ַ��qq�汾2016/1/24
		BufferedReader source = new BufferedReader(new InputStreamReader(url.openStream()));

//		2.����ƥ��
		String regex = "[(]\\d+[)]";
		Pattern p = Pattern.compile(regex);
		
		String line = null;
		while ( (line=source.readLine())!=null ) //�򿪵�Դ�ļ�����ÿ������Ϣ�ͽ���ƥ��
		{
			Matcher m = p.matcher(line);
			while (m.find())
			{
				//����������ݶ��洢��������
				list.add(m.group());
			}
		}
		return list;
	}
}
