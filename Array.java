
import java.util.Scanner;
class Array{

    public static void main(String [] args){
        System.out.println("---Array---");
        // type one array decleration
        int [] arr={1,2,3,4,5}; 
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);

        for(int elm:arr){  // for Each loop
            // System.out.println(elm);
        }
       
    //    type two array decleration
     
     int [] arr1=new int [5]; // initial value 0,0,0,0,0
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<arr1.length;i++){
        // arr1[i]=sc.nextInt();
     }
     for(int ele:arr1){
        // System.out.println(ele);
     }


    //  type third array decleration
    int [] array2;
    array2=new int [5];


    // two dimential Array

    int [][] twoDArr=new int [2][2];
  
    for(int i=0;i<2;i++){
        for(int  j=0;j<2;j++){
            twoDArr[i][j]=sc.nextInt();
        }
    }
    
  
    for(int i=0;i<2;i++){
        for(int  j=0;j<2;j++){
            System.out.println(twoDArr[i][j]);
        }
    }
    


    }
}