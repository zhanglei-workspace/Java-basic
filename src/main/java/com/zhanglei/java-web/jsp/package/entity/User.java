package entity;

/**
 * JavaBean �û�ʵ����
 * @author lyons(zhanglei)
 * @date Feb 26, 2016
 * @version 1.0
 */
public class User
{
	private String username; 
	private String password;
	
	public User(){}//�����޲ι��캯��

	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	
}
