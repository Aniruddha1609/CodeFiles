// Print all subsequence from a set of integers:
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr= new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> data =new ArrayList<>();
        fun(0,data,arr);
    }
    public static void fun(int indx,ArrayList<Integer> data,int arr[]){
          if(indx>=arr.length){
            for(int da:data){
                System.out.println(da);
            }
            System.out.println("________");
            return;
        }
        data.add(arr[indx]);
        fun(indx+1,data,arr);
        data.remove(data.size()-1);
        fun(indx+1,data,arr);
    }
         
    }    
    
