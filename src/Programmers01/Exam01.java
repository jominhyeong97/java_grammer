package Programmers01;

public class Exam01 {
    public static void main(String[] args) {
        String s1 = "abcde";	 //"c"
        String s2 = "qwer";	//"we"

        int lt = s1.length();
        String result = "";

            if(lt%2 ==0) {
                result = s1.substring(lt/2-1,lt/2);


            } else if(s1.length()%2 !=0) {
                result = s1.substring(lt/2+1);

            }


    }
}
