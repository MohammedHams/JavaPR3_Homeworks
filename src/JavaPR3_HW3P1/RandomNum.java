/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPR3_HW3P1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author MohammedHams
 */
public class RandomNum {
    public static void main(String[] args) {
        int[] random = new Random().ints(30, 0, 100).toArray();
        List<Integer>list=new LinkedList<>();
               for(int item:random)
               {
                   list.add(item);
                   
               }
            
               Collections.sort(list);
               OptionalDouble  rs = IntStream.of(random).average();
               System.out.println(list.toString());
               System.out.println(rs);
    }
}
