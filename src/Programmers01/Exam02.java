package Programmers01;

public class Exam02 {
    public static void main(String[] args) {

        String a = "hello";
        String b = "ohell";
        StringBuilder sb = new StringBuilder();
        int count = 0;
        sb.append(a);
        loop1:for(int i=0; i<a.length(); i++) {


            sb.insert(0,sb.charAt(sb.length()-1));
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
            count ++;
            if(sb.toString().equals(b)) {
                break loop1;
            }

        }
        System.out.println(count);

    }
   /* class Solution {
        public int solution(String A, String B) {

            StringBuilder sb = new StringBuilder();
            int count = 0;
            sb.append(A);
            for(int i=0; i<A.length(); i++) {

                sb.insert(0,sb.charAt(sb.length()-1);
                sb.deleteCharAt(sb.length()-1);
                count ++;
                if(sb.toString().equals(B)) {
                    break;
                }
            }
            System.out.println(count);
            return count;
        }
    }*/
}
