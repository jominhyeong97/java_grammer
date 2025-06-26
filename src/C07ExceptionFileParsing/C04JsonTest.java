package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C04JsonTest {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("src/C07ExceptionFileParsing/myjson1.json");
        String st1 = Files.readString(filePath);

        Path filePath2 = Paths.get("src/C07ExceptionFileParsing/myjson2.json");
        String st2 = Files.readString(filePath2);

        ObjectMapper o1 = new ObjectMapper();

        StudentTest studentTest = o1.readValue(st1,StudentTest.class); //readvalue는 객체타입으로 리턴하기 떄문에 클래스 명시.

        JsonNode jsonNode = o1.readTree(st1); //readTree는 jsonNode 타입으로 리턴
        Map<String,String> myMap = new HashMap<>();

        myMap.put("name",jsonNode.get("name").asText()); //직접 넣을 수 있음. asText는 해당 키값의 value를 string으로 반환
        System.out.println(myMap);

//        실습 예제 : st2(여러 json문자열 배열)를 List<클래스> 타입으로 넣기
        List<StudentTest> list = new ArrayList<>(); //일단 클래스타입 배열 선언

        JsonNode jsonNode1 = o1.readTree(st2); //jsonNode타입으로 트리모양 가공하여 받음

        for(JsonNode jn : jsonNode1) { //트리의 요소(배열1, 배열2...)를 StudentTest 타입으로 바꿔서 생성하고 list에 add
            StudentTest studentTest1 = o1.readValue(jn.toString(), StudentTest.class); //jn은 jsonNode 타입 > String으로 변환 후 객체생성 후 readValue.
            list.add(studentTest1);
        }
        System.out.println(list);



    }
}

class StudentTest {
    private int id;
    private String name;
    private String classNumber;
    private String city;


    public StudentTest() {}


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}