package a001.Singleton;

/**
 * 
 *����ģʽ-����ʽ
 */
public class Singleton02
{

    private Singleton02(){}
    
    private static Singleton02 instance;
    
    public static synchronized Singleton02 getInstance()
    {
        if (instance==null)
        {
            new Singleton02();
        }
        return instance;
    }
}
