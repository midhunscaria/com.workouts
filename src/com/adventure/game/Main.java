package com.adventure.game;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Integer,Location> locations= new HashMap<>();
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        locations.put(0,new Location(0,"You are sitting infront of the computer learning java"));
        locations.put(1,new Location(1,"You are at base location"));
        locations.put(2,new Location(2,"You are in snow"));
        locations.put(3,new Location(3,"You are in a desert"));
        locations.put(4,new Location(4,"You are in a Valley"));
        locations.put(5,new Location(5,"You are at a hill station"));

        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);
        int loc=1;
        while(true){
            System.out.println(locations.get(loc).getDescription());

            if(loc==0){
                break;
            }
            loc= scanner.nextInt();
            if(!locations.containsKey(loc)){
                System.out.println("you cannot go in that direction");

            }
        }



    }
}
