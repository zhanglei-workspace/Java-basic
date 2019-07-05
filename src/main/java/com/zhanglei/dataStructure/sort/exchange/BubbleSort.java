package sort.exchange;

/**
 * @Description: ����-ð������
 *
 * �Ƚ����ڵ�Ԫ�ء�
 * ����˼�룺����������Ϊn���Ӻ���ǰ�����ǰ���������Ƚ�����Ԫ�ص�ֵ��
 * ��Υ�����ǵ�������򣨼���С�����Ӵ�С�����򽻻����ǣ�ֱ�����бȽ��ꡣ
 * ���ǳ�Ϊһ��ð�ݣ������������С��Ԫ�ؽ������������еĵ�һ��λ�á�
 * ��һ�˵�һ��λ��Ԫ�ز��ٲ���Ƚϣ��������м���һ���������n-1��ð�ݾ��ܽ�����Ԫ���ź���
 *
 * @Auther: zhanglei(Lyons)
 * @Date: 2019/7/5 15:12
 */
public class BubbleSort
{
    /**
     * ð�������㷨
     * 
     * @param data Ŀ������
     * @param length ����λ
     */
    private static void sorting(int[] data, int length)
    {
        boolean flag = true;
        for (int i = 0; i < length-1 && flag; i++)//����
        {
            flag = false;
            for (int j = length-1; j > i; j--)
            {
                if (data[j] < data[j-1])
                {
                    data[j-1] = data[j-1] ^ data[j];
                    data[j] = data[j-1] ^ data[j];
                    data[j-1] = data[j-1] ^ data[j];

                    flag = true;
                }
            }
//            if (!flag) return;//����δ������������ô˵�����д������Ѿ�����,���ж��ƶ���forѭ������
        }

    }

    public static void sort(int[] data){
        sorting(data,data.length);
    }

}
