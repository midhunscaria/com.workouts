package co.Random.Tests;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Examples examples= new Examples();
        ArrayList<Integer> demo= new ArrayList<>();
        String m= "Midhun";
        String s= new String();
        s="Lol";
        System.out.println(s);

        for(int i=0;i<10;i++){
            examples.integerArrayList.add(i);
        }
        Examples.AnotherDemo demo1= examples.new AnotherDemo("Hello");
        demo=examples.integerArrayList;
        //Collections.shuffle(demo);
        for(int i=0;i<examples.integerArrayList.size();i++){
            System.out.print(examples.integerArrayList.get(i)+" ");

        }
        System.out.println("\n====================");
        for(int i=0;i<demo.size();i++){
            System.out.print(demo.get(i)+" ");
        }
    }
}
