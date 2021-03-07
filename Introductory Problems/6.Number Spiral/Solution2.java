/*input
3
2 3
1 1
4 2
*/
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.util.*; 
 
/* FAST IO template */
 
public class Solution2
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
           long n = s.nextLong();
           long ans = 0;
           while(n-->0)
           {
            long y = s.nextLong();
            long x = s.nextLong();
            long m1 = Math.max(y,x);
            long m2 = (m1 - 1)*(m1 - 1);
            if(m1%2 != 0){
              if(y==m1){
                ans = m2+x;
              }
              else
              {
                ans = m2+2*m1-y;
              }
            }
            else{
              if(x == m1)
              {
                ans = m2 + y;
              }
              else
              {
                ans = m2+2*m1-x;
              }
            }
            System.out.println(ans);
            }
           }
           
}