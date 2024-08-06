import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

interface Main{
    static void main(String[]a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count;
        String str = "", regex = "(?i)[aeiou]";
        Pattern pattern = Pattern.compile(regex);      
        str = br.readLine();
        while(!str.equals("#")) {
          Matcher matcher = pattern.matcher(str);
          count = 0;
          while(matcher.find()) {
            count++;
          }
          bw.write(count+"");
          bw.newLine();
          str = br.readLine();
        }
        bw.flush();
    }
}