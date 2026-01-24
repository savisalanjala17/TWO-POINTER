import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
       int n = sc.nextInt();
       int []  a = new int [n];
       int count=0;
       
       for(int i=0;i<a.length;i++){
            
            a[i]=sc.nextInt();

       }
       
       for(int i=0;i<a.length;i++){

           if(a[i]!=0){
               a[count++]=a[i];
               
           }
       }
       
       while(count<n){
           
           a[count++]=0;
           
       }
       
       for(int i=0;i<a.length;i++){
            
            System.out.print(a[i]+" ");

       }
    }
}
