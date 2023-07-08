import java.io.*;
public class q5 {
    public static void main(String args[])throws IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        
        String names[] = new String[11];
        int score[] =  new int[11];

        String names1[] = new String[11];
        int score1[] =  new int[11];

        for(int i=0;i<11;i++){
            names[i] = buff.readLine();
            score[i] = Integer.parseInt(buff.readLine());
            
        }
        for(int i=0;i<11;i++){
            names1[i] = buff.readLine();
            score1[i] = Integer.parseInt(buff.readLine());
        }
        for(int i=0;i<11;i++){
            System.out.println(names[i]+" "+score[i]+"\n"+names1[i]+" "+score1[i]);
        }
    }
}
