/*input
3
2 1
2 2
3 3
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
           StringBuilder sb = new StringBuilder();
           int t = s.nextInt();
           while(t-->0)
           {
            long a = s.nextLong();
            long b = s.nextLong();
            if((a+b)%3 == 0)
            {
                long ln = Math.max(a,b);
                long sn = Math.min(a,b);
                if(sn*2 >= ln)
                {
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");
           }
           }
           
}