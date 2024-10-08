package bitmasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] a=new int[N];

        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                int m=Integer.parseInt(st.nextToken());
                if(i==j) continue;
                a[i]=a[i]|m;
            }
        }
        for(int ans:a){
            System.out.print(ans+" ");
        }

    }
}
