package C01Basic;

import java.util.HashMap;
import java.util.Map;

public class C09Map {
    public static void main(String[] args) {

//        key, value로 이루어진 자료구조
//        key 값은 중복이 있으면 value를 덮어쓰기.
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("baseball",1);
        myMap.put("basketball",1);

//        Map은 key를 통해 value를 get
//        map에서 key값을 통한 검색 복잡도는 0(1) --- 매우중요!!

        System.out.println(myMap.get("baseball"));



    }
}
