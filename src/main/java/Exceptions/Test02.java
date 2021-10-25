package main.java.Exceptions;

//异常处理方式
//1.抛出
//2.捕获
//运行时异常不需要处理
public class Test02 {

    public static int getElement(int[] arr, int index){

        //合法性校验
        if (arr == null) {
            // NullPointerException是一个运行时异常 一般不处理 默认交给jvm
            throw new NullPointerException("arr is null");
        }

        if (index<0 || index>=arr.length) {
            // 运行时异常 一般不处理 默认交给jvm
            throw new ArrayIndexOutOfBoundsException("arr index out of bound");
        }

        int ele = arr[index];
        return ele;
    }

    public static void main(String[] args) {
        //由于抛出是运行时异常 可以不用处理 不用throws 也不用try catch
        int[] arr = new int[3];
        int e = getElement(arr, 3);
    }
}
