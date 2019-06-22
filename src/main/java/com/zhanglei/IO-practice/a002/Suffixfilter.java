package a002;

import java.io.File;
import java.io.FilenameFilter;

/**
 * �ļ�������
 * ����������˳�򣬲�����Ҳ������
 * @author My computer
 *
 */

public class Suffixfilter implements FilenameFilter
{
	private String suffix;
	public Suffixfilter(String suffix)
	{
		this.suffix = suffix;
	}
	
	public boolean accept(File dir, String name)
	{
		return name.endsWith(suffix);
	}

}
