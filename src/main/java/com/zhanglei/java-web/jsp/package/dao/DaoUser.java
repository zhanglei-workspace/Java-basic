package dao;

import entity.User;

public class DaoUser
{
	/**
	 * �û�ҵ���߼���
	 * ��֤�û������Ƿ���ȷ
	 * @return boolean
	 */
	public boolean DaoUSer(User user)
	{
		if ("lyons".equals(user.getUsername())&&"hello".equals(user.getPassword()))
		{
			return true;
		}else 
			{
				return false;
			}
	}
}
