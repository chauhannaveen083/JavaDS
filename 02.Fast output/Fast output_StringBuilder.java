import java.io.*;
import java.util.*;

// Receive N and output from 1 to N
public class Fast output_StringBuilder {
    public static void main(String[] args) throws Exception{
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder declaration and creation
        StringBuilder sb = new StringBuilder();
        
        // Number of test cases in the first line T
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++)
        {
            // N input
            int N = Integer.parseInt(br.readLine());
            
            // Test case number String buffer input
            sb.append("#"+test_case);
            for(int n = 1; n <= N; n++)
            {
                // Enter a string buffer from 1 to N.
                sb.append(" "+n);
            }
            // Input newline character string buffer
            sb.append("\n");
        }
        // String print
        System.out.print(sb);
    }
}