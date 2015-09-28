
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;
 
public class TestProblem {
 
	public static void main(String[] args) throws IOException  {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
     
         for (int i= 1; i <=T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                while(!st.hasMoreTokens()) {
                       st = new StringTokenizer(br.readLine());
                }
                StringBuffer one = new StringBuffer(st.nextToken()); 
                StringBuffer two = new StringBuffer(st.nextToken());
                Integer number = Integer.valueOf(one.reverse().toString()) + Integer.valueOf(two.reverse().toString());
                StringBuffer result = new StringBuffer(number.toString()) ; 
                System.out.println(Integer.valueOf(result.reverse().toString()));
               // System.out.println(new BigDecimal(ans).toPlainString());    
         }       
	}
}
       
