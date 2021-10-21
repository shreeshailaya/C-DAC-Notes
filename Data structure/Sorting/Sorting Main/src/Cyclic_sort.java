/*Cyclic sort is used to sort the array when all elements from 1 to n are present in it.*/

import java.util.*;

public class cyclic_sort{

    public static void main(String [] sd){

        FastReader fr=new FastReader();
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=0,k=0;
        int [] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int y=0;y<n-1;){
            k++;
            if(a[y]!=y+1){
                m=a[y];
                a[y]=y+1;
                a[m-1]=m;
            }
            else{
                y++;
            }
        }
        System.out.println(Arrays.toString(a)+" "+k);
    }
}
