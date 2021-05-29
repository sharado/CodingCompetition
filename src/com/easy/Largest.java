import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Largest {
    public static boolean IsFirstLarger(String s1,String s2){
        if(s1.length()>s2.length())
            return true;
        else if(s1.length()<s2.length())
            return false;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) > s2.charAt(i))
                return true;
        }
        return false;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split("\\s");
        String s2[] = br.readLine().split("\\s");
        boolean ans = IsFirstLarger(s1[0], s2[0]);
        System.out.println(ans);
    }
}
