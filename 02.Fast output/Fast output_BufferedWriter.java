import java.io.*;
import java.util.*;

// Receive N and output from 1 to N
public class Fast output_BufferedWriter {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter declaration and creation
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // Number of test cases in the first line T
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++)
        {
            // N input
            int N = Integer.parseInt(br.readLine());
            
            // Test case number output buffer input
            bw.write("#"+test_case);
            for(int n = 1; n <= N; n++)
            {
                // Input output buffer from 1 to N
                bw.write(" "+n);
            }
            // Newline character output buffer input
            bw.write("\n");
        }
        // Print
        bw.flush();
    }
    
}