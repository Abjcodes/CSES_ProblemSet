/*input
ACCGGGTTTT
*/
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.util.*; 
 
public class Codechef
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
    
    public static void main(String[] args) {
           FastReader s = new FastReader();
           String str = s.next();
           int count1 = 0;
           int count2 = 0;
           for(int i = 0; i<str.length()-1;i++)
           {
            if(str.charAt(i) == str.charAt(i+1))
            {
                count1++;
            }
            else
            {
                if(count1>count2)
                {
                    count2 = count1;
                }
            count1 = 0;
            }
           }
           if(count1>count2)
           {
           System.out.println(count1+1);
           }
           else
           {
            System.out.println(count2+1);
           }
}
}