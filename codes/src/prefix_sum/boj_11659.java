package prefix_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int[] arr=new int[N+1];
        arr[0]=0;

        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            //누적합
            arr[i]=arr[i-1]+Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            sb.append(arr[b]-arr[a-1]).append("\n");
        }
        System.out.println(sb);

    }
}
