/*input
10
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
           StringBuilder sb = new StringBuilder();
           if(n<=3)
           {
            if(n==1)
              System.out.println(1);
            else
              System.out.println("NO SOLUTION");
           }
           else{
           int num = n;
           int count = 0;
           int[] earr = new int[n/2];
           for(int i = 0; i<n; i++)
           {
           	if(num%2 != 0)
           	{
           		sb.append(num+" ");
           	}
            else if(num%2 == 0){
              earr[count] = num;
              count++;
            }
            num--;
           }
           for(int i = 0; i<(n/2); i++)
           {
           
           		sb.append(earr[i]+" ");
 
           }
           System.out.println(sb);
       }
           
}
}