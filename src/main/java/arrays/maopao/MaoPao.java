package arrays.maopao;

/**
 * @Author Dragon
 * @Description //TODO $
 * @Date $ $
 * @Param $
 **/
public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 3, 6, 5, 4};
        //冒泡排序
//        for (int i=arr.length-1;i>0;i--){
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[j+1]){
//                    int temp;
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
        //选择排序
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;//假设第一个元素就是最小的
            //找出最小的元素下标
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;//如果i不是最小的元素的下标，那就把j赋值给i
                }
            }
            if (min != i) {//min不等于i,说明我们假设的是错的,此时需要交换两个元素的位置
                int temp;
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        //输出排序后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
