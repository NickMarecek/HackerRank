import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.HashMap;
import java.util.Arrays;
public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(pairs.containsKey(ar[i]) == false){
                pairs.put(ar[i], 1);
            }
            else{
                pairs.put(ar[i], pairs.get(ar[i])+1);
            }
        }

        double totalPairs=0;
        double ans = 0;
        for(Integer x : pairs.values()){
            ans = Math.floor(x/2.0);
            totalPairs+=ans;
        }
        return (int)totalPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
