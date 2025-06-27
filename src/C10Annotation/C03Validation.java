package C10Annotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class C03Validation {
    public static void main(String[] args) throws IOException, IllegalAccessException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Member> memberList = new ArrayList<>();
        while (true) {
            System.out.println("회원가입입니다.");
            System.out.println("이름" );
            String name = br.readLine();
            System.out.println("이메일");
            String email = br.readLine();

            Member member = new Member(name,email);
            validate(member);
            memberList.add(member);
            System.out.println(memberList);
        }
    }

    static void validate(Object object) throws IllegalAccessException {

        Field[] fields = object.getClass().getDeclaredFields();
        for (Field f : fields) { //리플렉션은 기본적으로 런타임에 동작하므로, 어노테이션을 사용시 기본적으로 런타임 세팅 필요
            if(f.isAnnotationPresent(NotEmpty.class)) {
                f.setAccessible(true);
                String value = (String) f.get(object);
                if(value==null || value.isEmpty()) {
                    NotEmpty n1 = f.getAnnotation(NotEmpty.class);
                    throw new IllegalAccessException(n1.massage());
                }
            }
        }
    }

}

class Member {
    @NotEmpty
    private String name;
    @NotEmpty
    private String email;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Member() {
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

//어노테이션은 선언적 표시이고 , 어떠한 기능도 수행하지 않음
//어노테이션의 속성정의 방식

@Retention(RetentionPolicy.RUNTIME) //어노테이션은 default는 컴파일타임 > 일반적으로 런타임때 동작
@interface NotEmpty {
    String massage() default "this field cannot be empty!!";
}

