package Hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SquaresRectanglesIngrid {
    public static void main(String args[])throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int squares=(n*(2*n +1)*(n+1))/6;
            int rectangles=(n*(n+1)/2)*(n*(n+1)/2);
            
            System.out.println(squares);
            System.out.println(rectangles);
        }            
    }
}
