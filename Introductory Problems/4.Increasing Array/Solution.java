/*input
10
1000000000 1 1 1 1 1 1 1 1 1
*/
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.util.*; 
 
/* FAST IO template */
 
public class Solution
{
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }  
 
/* Solution */
    
    public static void main(String[] args) {
           FastReader s = new FastReader();
           int n = s.nextInt();
           long[] arr = new long[n];
           long moves = 0;
           for(int i = 0; i<n; i++)
           {
           	arr[i] = s.nextInt();
           }
           for(int i = 1; i<n ; i++)
           {
           	if(arr[i]<arr[i-1])
           	{	
           		moves += (arr[i-1] - arr[i]);
           		arr[i] += (arr[i-1] - arr[i]);
           		
           	}
           }
           System.out.println(moves);
}
}