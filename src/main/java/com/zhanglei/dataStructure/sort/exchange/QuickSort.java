package sort.exchange;

/**

 */

/**
 * @Description: ����-��������
 *
 *  ����˼�룺
 *  �ڴ��������data[1...n]����ȡһ��Ԫ��privot��Ϊ��׼��
 *  ͨ��һ�����򽫴��������Ϊ������������L[1..k-1] �� L[k+1...n],
 *  ʹ��L[1...k-1]������Ԫ��С�ڵ���privot��L[k+1...n]������Ԫ�ش��ڵ���privot��
 *  ��privot����������λ��L(k)�ϣ�������̳�Ϊһ�˿�������
 *  �ٷֱ�ݹ�ض������ӱ��ظ��������̣�ֱ��ÿ������ֻ��һ��Ԫ�ػ��Ϊֹ������Ԫ���ѷ�������λ���ϣ���
 *
 * @Auther: zhanglei(Lyons)
 * @Date: 2019/7/5 15:12
 */
public class QuickSort
{

    public static void sort(int[] data){
        sorting(data,0 , data.length-1);
    }

    /**
     * ���������㷨
     * 
     * @param data Ŀ������
     * @param start ��ʼλ
     * @param end ����λ
     */
    private static void sorting(int[] data, int start, int end)
    {
        
        int i = start, j = end, key = data[start];//key����ѡȡ��ɨ��Ƚϴʣ�ͬʱdata[start]����һ����
        
        while (j > i)
        {
            while (j > i && data[j] >= key) // = 1��Ϊ������ѭ���ģ�2�Ǵ�ʱ�ÿӲ���Ҫ������
            {
                j--;
            }
            data[i] = data[j];//
            
            
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
            sorting(data, start, i - 1);
        }
        if (i + 1 < end)
        {
            // �ݹ���ã���key������������
            sorting(data, i + 1, end);
        }
        
    }
}
