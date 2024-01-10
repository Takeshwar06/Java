


class referenceVar{
     static void change(int [] a){
       a[0]=0;
     }
    public static void main(String [] args){
        System.out.println("---reference variable---");
       int [] arr={1,2,3,4};
       change(arr);
       for(int element:arr){
         System.out.println(element);
       }
    }
}