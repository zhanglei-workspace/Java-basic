package sort.exchange;

public class QuickSort
{
    /**
     * ���������㷨
     * 
     * @param data Ŀ������
     * @param start ��ʼλ
     * @param end ����λ
     */
    public static void quickSort(int[] data, int start, int end)
    {
        
        int i = start, j = end, key = data[start];//key����ѡȡ��ɨ��Ƚϴ�
        
        while (j > i)
        {
            while (j > i && data[j] > key)
            {
                j--;
            }
            data[i] = data[j];
            
            
            while (j > i && data[i] <= key)
            {
                i++;
            }
            data[j] = data[i];
        }
        data[i] = key;
        
        if (i - 1 > start)
        {
            // �ݹ���ã���keyǰ����������
            quickSort(data, start, i - 1);
        }
        if (i + 1 < end)
        {
            // �ݹ���ã���key������������
            quickSort(data, i + 1, end);
        }
        
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
//        System.out.println("34, 21, 54, 18, 23, 76, 41, 38, 98, 45, 495, 33, 27, 51, 11, 20, 79, 30, 89, 41, 41");
//        int[] p = {34, 21, 54, 18, 23, 76, 41, 38, 98, 45, 495, 33, 27, 51, 11, 20, 79, 30, 89, 41, 41};
        System.out.println("8,5,10,9");
        int p[] = {8,5,10,9};
        
        QuickSort.quickSort(p, 0, p.length - 1);// ��������
        
        for (int i = 0; i < p.length; i++)
        {
            System.out.print(p[i] + ",");
        }
    }
}
