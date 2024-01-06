import java.util.*;

public class data structurePqueue2 {
    public static class A_B_Min_Heap implements Comparable<A_B_Min_Heap>{
        int A,B;
        A_B_Min_Heap(int A, int B)
        {
            this.A = A;
            this.B = B;
        }
        @Override
        public int compareTo(A_B_Min_Heap o) {
            if(this.A < o.A) return -1;
            else if(this.A > o.A) return 1;
            else 
            {
                if(this.B < o.B) return -1;
                else if(this.B > o.B) return 1;
                else return 0;
            }
        }
    }

    public static class B_A_Min_Heap implements Comparable<B_A_Min_Heap>{
        int A,B;
        B_A_Min_Heap(int A, int B)
        {
            this.A = A;
            this.B = B;
        }
        @Override
        public int compareTo(B_A_Min_Heap o) {
            if(this.B < o.B) return -1;
            else if(this.B > o.B) return 1;
            else 
            {
                if(this.A < o.A) return -1;
                else if(this.A > o.A) return 1;
                else return 0;
            }
        }
    }
    public static void main(String[] args) {
        
        PriorityQueue<A_B_Min_Heap> ABminHeap = new PriorityQueue<A_B_Min_Heap>();
        PriorityQueue<B_A_Min_Heap> BAminHeap = new PriorityQueue<B_A_Min_Heap>();

        for(int a=1,b=10;a<=10;a++,b--) 
        {
            ABminHeap.offer(new A_B_Min_Heap(a, b));
            BAminHeap.offer(new B_A_Min_Heap(a, b));
        }

        System.out.print("A_B_Min_Heap :");
        while(!ABminHeap.isEmpty())
        {
            A_B_Min_Heap cur = ABminHeap.poll();
            System.out.print(" ("+cur.A+","+cur.B+")");
        }
        System.out.println();

        System.out.print("B_A_Min_Heap :");
        while(!BAminHeap.isEmpty())
        {
            B_A_Min_Heap cur = BAminHeap.poll();
            System.out.print(" ("+cur.A+","+cur.B+")");
        }
        System.out.println();
    }
}