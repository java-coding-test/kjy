package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long n=Integer.parseInt(br.readLine());

        //123456
        //654321
        System.out.println((n*(n-1))/2);
        System.out.println(2);
    }
}
