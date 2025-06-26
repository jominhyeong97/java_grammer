package C07ExceptionFileParsing.MemberException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

//사용자의 입출력을 받아 처리하는 계층
public class MemberController {
    public static void main(String[] args) throws IOException {

        MemberService memberService = new MemberService();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("1번 : 회원가입 / 2번 : 회원상세조회 / 3번 : 회원목록조회 /4번 : 로그인 ");
            String input = br.readLine();
            if(input.equals("1")) {
//                이름,이메일,패스워드 입력받아서 sevice에 전달
                System.out.println("name");
                String name = br.readLine();
                System.out.println("email");
                String email = br.readLine();
                System.out.println("password");
                String password = br.readLine();
//                예외발생시 적절한 문구를 사용자에게 출력 try catch
                try {
                    memberService.register(name,email,password);

                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }

            }
            else if(input.equals("2")) {
//                사용자에게 회원 정보를 출력
                System.out.println("id입력");
                Long id = Long.parseLong(br.readLine());

                try {
                    System.out.println(memberService.findById(id));
                } catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
//                적절한 예외처리 필요
            }
            else if(input.equals("3")) {
//                회원목록정보 출력
                System.out.println(memberService.findAll());
            }
            else if(input.equals("4")) {
//                로그인
                System.out.println("id입력");
                Long id = Long.parseLong(br.readLine());
                System.out.println("password입력");
                String password = br.readLine();
                try {
                    memberService.logIn(id,password);
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
                System.out.println("로그인성공");

            }
        }

    }
}
