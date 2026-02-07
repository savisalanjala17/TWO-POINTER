Understanding -> You are given two sorted arrays ; both arrays were of size N ;  you have to find a pair of numbers such that sum of those numbers <=x and as close as possible to x 

N = 4
A = 1 4 5 7 
B = 10 20 30 40 
X = 32

Output : -31 (1+30)


BRUTE FORCE:

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        int maxsofar=0;
        
        int a[] = {1,4,5,7};
        int b[] = {10,20,30,40};
        int x = 32;
        int f=0;
        int l=0;
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                
                if(a[i]+b[j]==x){
                    System.out.print(a[i]+" "+b[j]);
                    return;
                }
                
                if(a[i]+b[j]>maxsofar && a[i]+b[j]<x){
                    maxsofar=a[i]+b[j];
                    f=a[i];
                    l=b[j];
                    
                    
                }
                
                
            }
        }
        
        System.out.print(f+" "+l);
        
        }
}


OPTIMAL:


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner (System.in);
	    
	    int n=sc.nextInt();
	    int a[] = new int[n];
	    int b[] = new int[n];
	    
	    for(int i=0 ; i<n ; i++){
	        a[i]=sc.nextInt();
	    }
	    
	    for(int i=0 ; i<n ; i++){
	        b[i]=sc.nextInt();
	    }
	    
	    int target=sc.nextInt();
	    
	    int i=0;
	    int j=n-1;
	    int max=Integer.MIN_VALUE;
	    int besta=0;
	    int bestb=0;
	    
	    while(i<n && j>=0){
	        
	        if(a[i]+b[j]<=target){
	            
	            if(a[i]+b[j]>max){
	                
	                max = a[i]+b[j];
	                besta=a[i];
	                bestb=b[j];
	                
	                
	            }
	            
	            i++;
	            
	        }
	        
	        else if(a[i]+b[j]>target){
	            j--;
	        }
	        
	        
	        
	        
	    }
	    
	    System.out.println(besta+" "+bestb);
	    System.out.print(max);
		
	}
}

no of ele: 4
array1: 1 2 3 4
array2: 10 20 30 40
target: 25
array ele having max: 4 20
max: 24
