package week2;

import edu.princeton.cs.algs4.*;

public class UFClient2 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        int linked = N - 1;
        int count__ = 0;
        int d = 0;
        while(!StdIn.isEmpty()){
            int count_ = 0;
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            count__++;
            if(uf.connected(a, b)) StdOut.println(a + " and " + b + " is connected");
            else{
                uf.union(a, b);
                StdOut.println(a + " " + b);
            }
            for(int i = 1; i < N; i++){
                if(uf.connected(0, i)) {
                    count_++;
                    d = count_;
                }
            }
            if(count_ == linked){
                StdOut.println(count__);
                StdIn.isEmpty();
            }
        }
        if(d < linked) StdOut.print("FAILED");
    }
}
