import java.util.*;
 class ArrayReader{

    public int[] a;

    public ArrayReader(int[] a) {
        this.a=a;

    }

    public int get(int i){
        if(i<0 || i>=a.length){
            return Integer.MAX_VALUE;
        }
        return a[i];
    }
}
public class Main{
    public static void main(String[] args){
        int[] aw = {0,1,4,5,8,19,29,31};
        ArrayReader a = new ArrayReader(aw);
        ArrayReader b = new ArrayReader(aw);
        int t=8;
        int t1=9;
        Main m = new Main();
        int ans = m.search(a,t);
        int a1= m.search(b,t1);
        System.out.println(ans);
        System.out.println(a1);


    }

    public static int search(ArrayReader reader, int target){
        int low=0;
        int high = 1;
        while(reader.get(high)<target && reader.get(high) != Integer.MAX_VALUE){
            high=high*2;
        }

        while(low<=high){
            int mid = (low+high)/2;
            if(reader.get(mid)==target){
                return mid;
            }
            if(reader.get(mid)>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;


    }
}