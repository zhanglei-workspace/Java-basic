package a002;

import java.io.File;
import java.io.FilenameFilter;

/**
 *�˷������ܹ�ʱ��,1.8 ����ʾ
 *
 */

public class FilterByJava implements FilenameFilter
{

	public boolean accept(File dir, String name)
	{
		return name.endsWith(".txt");
	}

}
