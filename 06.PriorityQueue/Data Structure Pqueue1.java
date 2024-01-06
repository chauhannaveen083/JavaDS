import java.util.*;

public class data structurePqueue1 {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) return -1;
                else if(o1 < o2) return 1;
                else return 0;
            }
        });

        for(int i=1;i<=10;i++) 
        {
            minHeap.offer(i);
            maxHeap.offer(i);
        }

        System.out.print("minHeap :");
        while(!minHeap.isEmpty())
        {
            System.out.print(" "+minHeap.poll());
        }
        System.out.println();

        System.out.print("maxHeap :");
        while(!maxHeap.isEmpty())
        {
            System.out.print(" "+maxHeap.poll());
        }
        System.out.println();
    }
}