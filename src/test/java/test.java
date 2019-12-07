import java.util.Arrays;

public class test {
    public static void maopao1(int[] array){
        int tmp=0;
        int pwd=1;//加pwd是为了优化此排序方法，对于本身就已经排好序的不需要在排序的，就进不去if语句，输出的pwd就为1；
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){//注意这的j<array.length-i-1
                if(array[j]>array[j+1]){
                    pwd=0;
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
            if(pwd==1){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array={1,3,9,8,76,3,0,5,9};
        maopao1(array);
        System.out.println(Arrays.toString(array));
    }
}
