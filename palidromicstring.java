import java.util.*;
class palindromicstring{
    static Scanner scn = new Scanner(System.in);

    public static boolean pallindrome(String str){
        char i = str.charAt(0);
        char j = str.charAt(str.length()-1);
        while(i<=j){
            if(i!=j){
                return false;
            }else{
                i++;
                j--;
            }
        } 
        return true;
    }
    public static void main(String []args){
        String str = scn.next();
        boolean ans = pallindrome(str);
        if(ans==true){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}