*Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
*/
 
 
 
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
    static String Reorder(String exp)
    {
    	HashMap<Character, Integer> hm = new HashMap<>();
    	String first_half = "";
    	for(int i = 0; i<exp.length();i++)
    	{
    		char alphabet = exp.charAt(i);
    		if(hm.containsKey(alphabet))
    		{
    			hm.put(alphabet, hm.get(alphabet) + 1);
    		}
    		else
    		{
    			hm.put(alphabet, 1);
    		}
    	}
    	int count = 0;
    	String odd_alpha = "";
    	String second_half = "";
    	int value = 0;
    	String key = "";
    	for(Map.Entry i : hm.entrySet())
    	{
    		if((int)i.getValue() % 2 != 0){
    			count++;
    			value = (int) i.getValue();
    			key = i.getKey().toString();
    			odd_alpha += key.repeat(value);
    			if(count > 1)
    				return "NO SOLUTION";
    		}
    		else{
    				value = (int) i.getValue() / 2;
    				key = i.getKey().toString();
    				first_half += key.repeat(value);
    		}
    	}
    	second_half = new StringBuilder(first_half).reverse().toString();
    	return first_half + odd_alpha + second_half;
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
		String exp = s.nextLine();
		System.out.println(Reorder(exp));
		
         
		
 
        
	}
}
 