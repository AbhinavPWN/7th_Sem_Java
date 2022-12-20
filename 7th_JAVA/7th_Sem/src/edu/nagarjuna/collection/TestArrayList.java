package edu.nagarjuna.collection;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(122);
        list.add(52);
        list.add(26);

        TestArrayList tl = new TestArrayList();
        tl.arraySum(list);

    }

    public void arraySum(List<Integer> lists) {
        int sum = 0;
        for (Integer a : lists) {
            sum = sum + a;
        }
        System.out.println("The sum is : " + sum);
    }
}
