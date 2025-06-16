package Programmers01;
import java.util.*;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {

        String [] participant = new String[]{"leo", "kiki", "eden"};
        String [] completion = new String[]{"eden", "kiki"};

        String answer = "";

        Map<String, Integer> pa = new HashMap<>();
        Map<String, Integer> co = new HashMap<>();

        for(int i=0; i<participant.length; i++) {
            pa.put(participant[i], pa.getOrDefault(participant[i],0)+1);
        }

        for(int i=0; i<completion.length; i++) {
            co.put(completion[i], co.getOrDefault(completion[i],0)+1);
        }

        for(String a : co.keySet()) {
            if(pa.containsKey(a)) {
                pa.put(a,pa.get(a)-1);
            }
            if(pa.get(a) == 0) {
                pa.remove(a);
            }
        }
        System.out.println(pa);
    }
}