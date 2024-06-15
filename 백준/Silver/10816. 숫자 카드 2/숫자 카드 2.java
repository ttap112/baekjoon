import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        int n1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n1];
        String[] input1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        
        int n2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[n2];
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        
        int[] countArr = new int[n2];
        for (int i = 0; i < n2; i++) {
            countArr[i] = countMap.getOrDefault(arr2[i], 0);
        }

        
        for (int i : countArr) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
