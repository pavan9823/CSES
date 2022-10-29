package com.example.coll;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrDeq {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k =3;
        int n=nums.length;
        //taking array in which we will be storing n-k+1 element like
        // taking first example length is 8 so 8-3+1=6 length array willbe there
        int[] r=new int[n-k+1];
        //pointer for storing elemnt in array
        int ri=0;
        //taking deque doubly ended queue for storing as we will be stroing the index of elemetn in decreasing order and as we found element out of bound of kth size so we have to poll out that element and also checking that whether element if not following decreasing order at any point of ith index so poping outlast element before the present element
        //and offeing i index in queue
        //now checking that if ith in length of k if less then equal to k-1 so peek that and put it into array
        //like 1,3,-1,-3,5,3,6,7 so potting index 0 in deque then go to index1 and it not following decreasing order so remove 0th index and offering 1 index then goes to 2 index then following order so and putting 2 index and here taking element 3 from subarray from it as it is greatest element in subbarray and then goes to 3 index as it less then 2 index so putting in deque and now taking from subarray (3,-1,-3) 3 as max element
        //now going to index 4 concerned about window(-1,-3,5) and 1 index is out of boundary so poping out
        //now i am at index 4 that is (5) so what is now use of -1 and -3 so remoe them now push index 4 and subaaray return max =5 and it goes on
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                r[ri++]=nums[q.peek()];
            }
        }
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(r[i]+" ");
        }
    }
}
