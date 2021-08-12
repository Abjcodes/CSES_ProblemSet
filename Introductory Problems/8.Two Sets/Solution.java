import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.util.*; 
import java.io.*;
 
public class solution {
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
    static void Two_Sets(int num)
    {
    	int sum = num*(num+1)/2;
    	if(sum % 2 != 0)
    		System.out.println("NO");
    	else{
    		int n1 = 0;
    		int n2 = 0;
    		StringBuilder sb1 = new StringBuilder();
    		StringBuilder sb2 = new StringBuilder();
    		sb1.append(num + " ");
    		n1++;
    		num--;
    		int i = 1;
    		int j = 0;
    		while(num>0)
    		{
    			if(num>0 && j<i){
    				sb2.append(num + " ");
    				n2++;
    				num--;
    				if(num == 0)
    					break;
    				sb2.append(num + " ");
    				n2++;
    				num--;
    				if(num == 0)
    					break;
    				j++;
    			}
    			else if(num>0 && j == i){
    				sb1.append(num + " ");
    				n1++;
    				num--;
    				if(num == 0)
    					break;
    				sb1.append(num + " ");
    				n1++;
    				num--;
    				if(num == 0)
    					break;
    				i++;
    			}
 
    		}
     		System.out.println("YES");
     		System.out.println(n1);
     		System.out.print(sb1);
 
     		// while(v1_it.hasNext()){
     		// 	System.out.print(v1_it.next() + " ");
     		// };
     		System.out.println("\n"+n2);
     		System.out.print(sb2);
     		// while(v2_it.hasNext()){
     		// 	System.out.print(v2_it.next() + " ");
     		// }
     		
    		}
    		}
    		
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		//Solution
   		FastReader s = new FastReader();
		StringBuilder sb = new StringBuilder();
		int num = s.nextInt();
		Two_Sets(num);
	}
}
 
 
 