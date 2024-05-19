package geeksForGeeks.arraysProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * There are N trees in a circle. Each tree has a fruit value associated with it.
 * A bird has to sit on a tree for 0.5 sec to gather all the fruits present on the tree and then the bird can move to a neighboring tree.
 * It takes the bird 0.5 seconds to move from one tree to another. Once all the fruits are picked from a particular tree,
 * she cant pick any more fruits from that tree. The maximum number of fruits she can gather is infinite.
 *
 * Given N and M (the total number of seconds the bird has),
 * and an array arr[] containing the fruit values of the trees. Maximize the total fruit value that the bird can gather.
 * The bird can start from any tree.
 *
 *
 * Input:
 * N=7 M=3
 * arr[] = { 2 ,1 ,3 ,5 ,0 ,1 ,4 }
 * Output: 9
 * Explanation:
 * She can start from tree 1 and move
 * to tree2 and then to tree 3.
 * Hence, total number of gathered fruits
 * = 1 + 3 + 5 = 9.
 *
 *
 * Input:
 * N=6 M=2
 * arr[] = { 1, 6, 2, 5, 3, 4 }
 * Output: 8
 * Explanation:
 * She can start from tree 1 and move
 * to tree 2. In this case she will gather
 * 6 + 2 = 8 fruits. She can also start
 * from tree 3 and move to tree 4. In this
 * case, too, she will gather 5 + 3 = 8
 * fruits.
 *
 *
 */
//https://www.geeksforgeeks.org/problems/bird-and-maximum-fruit-gathering--170645/1?page=13&category=Arrays&difficulty=Easy&sortBy=submissions
public class Birdandmaximumfruitgathering {
    public static void main(String[] args) {
        int [] arr  = {2,1,3,5,0,1,4};
        int n =7;
        int m= 3;
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(i <= (n-m)){
                int values = arr[i]+arr[i+1]+arr[i+2];
               map.put("value-"+i,values);
            }
        }
        System.out.println(map);
        int max = Collections.max(map.values());
        System.out.println("A bird can pick max-"+max+"-fruits");
    }
}
