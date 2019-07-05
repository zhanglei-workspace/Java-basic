package sort.test;

import java.lang.reflect.Method;
import java.lang.Class;

/**
 * ���԰�����
 */
public class SortTestHelper {

    // SortTestHelper����������κ�ʵ��
    private SortTestHelper(){}

    // ������n��Ԫ�ص��������,ÿ��Ԫ�ص������ΧΪ[rangeL, rangeR]
    public static int[] generateRandomArray(int n, int rangeL, int rangeR) {

        assert rangeL <= rangeR;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = new Integer((int)(Math.random() * (rangeR - rangeL + 1) + rangeL));
        return arr;
    }

    // ����һ���������������
    // ��������һ������[0...n-1]����ȫ��������, ֮���������swapTimes������
    // swapTimes���������������̶�:
    // swapTimes == 0 ʱ, ������ȫ����
    // swapTimes Խ��, ����Խ����������
    public static int[] generateNearlyOrderedArray(int n, int swapTimes){

        int[] arr = new int[n];
        for( int i = 0 ; i < n ; i ++ )
            arr[i] = i;

        for( int i = 0 ; i < swapTimes ; i ++ ){
            int a = (int)(Math.random() * n);
            int b = (int)(Math.random() * n);
            int t = arr[a];
            arr[a] = arr[b];
            arr[b] = t;
        }

        return arr;
    }

    // ��ӡarr�������������
    public static void printArray(Object[] arr) {

        for (int i = 0; i < arr.length; i++){
            System.out.print( arr[i] );
            System.out.print( ' ' );
        }
        System.out.println();

        return;
    }

    // �ж�arr�����Ƿ�����
    public static boolean isSorted(int[] arr){

        for( int i = 0 ; i < arr.length - 1 ; i ++ )
            if( arr[i+1] - arr[i] < 0 )
                return false;
        return true;
    }

    // ����sortClassName����Ӧ�������㷨����arr�������õ��������ȷ�Ժ��㷨����ʱ��
    public static void testSort(String sortClassName, int[] arr){

        // ͨ��Java�ķ�����ƣ�ͨ�����������������������
        try{
            // ͨ��sortClassName�����������Class����
            Class sortClass = Class.forName(sortClassName);
            // ͨ����������Class���������򷽷�
            Method sortMethod = sortClass.getMethod("sort",new Class[]{int[].class});
            // �������ֻ��һ�����ǿɱȽ�����arr
            Object[] params = new Object[]{arr};

            long startTime = System.currentTimeMillis();
            // ����������
            sortMethod.invoke(null,params);
            long endTime = System.currentTimeMillis();

            if (!isSorted( arr )){
                System.out.println("������� \n");
            }else {
                System.out.println(sortClass.getSimpleName()+ " ͨ������ time: " + (endTime-startTime) + "ms \n" );
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}