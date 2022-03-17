package week5;


import java.util.ArrayDeque;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
//        MyLinkedList<Integer> li = new MyLinkedList<>();
//        li.addLast(1);
//        li.addLast(2);
//        li.addLast(3);
//        System.out.println(li);
//        li.reverse();
//        System.out.println(li);

        MyArrayList<String> list1 = new MyArrayList<String>();

        /**
         * Test toArray()
         */
        System.out.println("Test toArray()");
        //リストに要素を追加
        list1.add("111");
        list1.add("222");
        list1.add("333");
        list1.add("444");

        // リストを配列に変換する
        System.out.println(
                "パラメータにすでに値が入っている配列を使った場合");
        String[] array1 = {"AAA", "BBB", "CCC", "DDD", "EEE", "FFF"};
        String[] array2 = list1.toArray(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        /**
         * Test addAll()
         */
        System.out.println("\nTest AddAll()");
        ArrayDeque<String> arrDeq = new ArrayDeque<>();
        arrDeq.add("AA");
        arrDeq.add("BB");
        arrDeq.add("DD");
        list1.addAll(1, arrDeq);
        System.out.println(Arrays.toString(list1.toArray()));

        /**
         * Test retainAll()
         */
        System.out.println("\nTest retainAll()");
        ArrayDeque<String> arrDeq2 = new ArrayDeque<>();
        arrDeq2.add("222");
        arrDeq2.add("444");
        list1.retainAll(arrDeq2);
        System.out.println(Arrays.toString(list1.toArray()));

        /**
         * Test indexOf()
         */
        System.out.println("\nTest indexOf()");
        System.out.println(list1.indexOf("444"));
    }
}
