package a009;

public class ToBinary
{
    
    /** 
     * ����ת��Ϊ������
     * @param args
     */
    public static void main(String[] args)
    {
        String str = "ת��Ϊ������";
        byte[] b = str.getBytes();
        for(int i=0;i<b.length;i++)
        {
            System.out.println(Integer.toBinaryString(b[i]&0xff));
        } 
        
    }
    
}
