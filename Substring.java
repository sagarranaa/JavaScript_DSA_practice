import org.jetbrains.annotations.NotNull;

public class Substring {
  public static int findIndexOfString(String s1,  String s2){
        for(int i=0;i<=s1.length()-s2.length();i++){
            int sub=1;
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i+j)!=s2.charAt(j)){
                    sub=0;
                    break;
                }
            }
            if(sub==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s1="competitive";
        String s2="pet";
        int result=findIndexOfString(s1,s2);
        System.out.println(result);
    }
}
