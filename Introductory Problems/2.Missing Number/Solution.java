/*input
2
1
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
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int[] narr = new int[n];
           int flag = 0;
           for(int i =0; i<n-1; i++)
           {
                narr[i] = sc.nextInt();
           }
           Arrays.sort(narr);
           for(int i =0; i<n; i++)
           {
                if(i != narr[i])
                {
                    System.out.println(i);
                    flag = 1;
                    break;
                }
           }
           if(flag == 0)
           {
            System.out.println(n);
           }
}
}