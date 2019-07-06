/*Copyright ?  2019 Lyons. All rights reserved. */

package sort.test;


/**
 * @Description: sort������
 * @Auther: zhanglei(Lyons)
 * @Date: 2019/7/5 15:15
 */
public class Test {

    public static final int N = 5; //������
    public static  int rangeR = 15;//������ּ�
    public static String PACKET_NAME = "sort.";
    public static String PACKET = null;

    public static void main(String[] args)
    {
        int[] arr = null;

        /**
         * �����������
         */

            PACKET = PACKET_NAME + "exchange.";
        /*    System.out.println("����-ð���������");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"BubbleSort", arr);
            System.out.println("����-�����������");arr = null;
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"QuickSort", arr);*/

        /**
         * �����������
         */
/*            PACKET = PACKET_NAME + "insert.";
            System.out.println("����-ֱ�Ӳ����������");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"StraightInsertionSort", arr);
            System.out.println("����-�۰���Ҳ����������");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
//            arr = SortTestHelper.generateNearlyOrderedArray(N, 100);
            SortTestHelper.testSort(PACKET+"BinaryInsertionSort", arr);
            //TODO
/*            System.out.println("����-ϣ���������");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"ShellInsert", arr);*/


        /**
         * ѡ���������
         */

/*            PACKET = PACKET_NAME + "select.";
            System.out.println("ѡ��-���������");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"SelectSort", arr);
            //TODO
            System.out.println("ѡ��-���������");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"HeapSort", arr);*/

        /**
         * �鲢�����������
         */
            PACKET = PACKET_NAME + "merge.";
            System.out.println("�鲢-��·�鲢�������");
            arr = SortTestHelper.generateRandomArray(N, 0, rangeR);
            SortTestHelper.testSort(PACKET+"TwoWayMarge", arr);


    }


}
