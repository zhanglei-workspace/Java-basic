package sort.exchange;

public class BubbleSort
{
    /**
     * ð�������㷨
     * 
     * @param data Ŀ������
     * @param start ��ʼλ
     * @param end ����λ
     */
    public static void quickSort(int[] data, int length)
    {
        int temp = 0;
        for (int i = 0; i < length; i++)
        {
            for (int j = 1; j < length - i; j++)
            {
                
                if (data[j] < data[j-1])
                {
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
        
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int[] p = {34, 21, 54, 18, 23, 76, 41, 38, 98, 45, 495, 33, 27, 51, 11, 20, 79, 30, 89, 41, 41};
        
        BubbleSort.quickSort(p, p.length);// ð������
        
        for (int i = 0; i < p.length; i++)
        {
            System.out.print(p[i] + " ");
        }
        
    }
}
