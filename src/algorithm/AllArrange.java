package algorithm;

/**
 * Created by huan on 2017/10/19.
 * 字符串全排列
 */
public class AllArrange {

    /*
     * 参数arrayA:给定字符串的字符数组
     * 参数start:开始遍历字符与其后面各个字符将要进行交换的位置
     * 参数end:字符串数组的最后一位
     * 函数功能：输出字符串数字的各个字符全排列
     */
    public void recursionArrange(char[] arrayA, int start, int end) {
        if (end < 0)
            return;
        if (start == end) {
            for (int i = 0; i < arrayA.length; i++)
                System.out.print(arrayA[i]);
            System.out.println();
        } else {
            for (int i = start; i <= end; i++) {
                swap(arrayA, i, start);
                recursionArrange(arrayA, start + 1, end);
                swap(arrayA, i, start);
            }
        }

    }

    public void swap(char[] array, int m, int n) {
        char temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }

    public static void main(String[] args) {
        AllArrange test = new AllArrange();
        String str = "a";
        char[] array = str.toCharArray();
        test.recursionArrange(array, 0, array.length - 1);
    }
}