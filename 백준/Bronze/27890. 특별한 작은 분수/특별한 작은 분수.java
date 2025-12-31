import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int P = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int result = P;
        for(int i=0;i<N;i++){
            if(result%2==0){
                result=result/2;
            }else{
                result = result*2;
            }
            result = result^6;
        }
        System.out.println(result);
    }
}