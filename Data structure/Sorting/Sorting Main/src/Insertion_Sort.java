import java.util.*;
class insertion_sort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,t=0,x;
        n=sc.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int j=1;j<n;j++){
            for(int k=j-1;k>=0;k--){
                if(arr[k]>arr[k+1]){
                    t=arr[k+1];
                    arr[k+1]=arr[k];
                    arr[k]=t;
                }
                else{
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
