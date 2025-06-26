package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class MemberService {
//    핵심로직 구현하는 계층
    private MemberRepository memberRepository;

    public MemberService(){
        this.memberRepository = new MemberRepository();
    }

//    1. 회원가입
    public void register(String name, String email, String password) throws RuntimeException{
//        email이 list에 중복일경우 예외 발생
        if(memberRepository.findByEmail(email).isPresent()) {
            throw new RuntimeException("중복값");
        }
//        비밀번호가 너무 짧은경우 예외 발생
        if(password.length()<4) {
            throw new RuntimeException("너무짧습니다.");
        }
//        예외 없으면 객체를 조립후 repository를 통해 register
       memberRepository.register(new Member(name,email,password));


    }
//    2.회원상세조회 : optional객체를 까봤는데 !present면 에러
    public Member findById(Long id) {
//        OPtional 객체에 값이 없을경우 예외발생. 있으면 Member를 꺼내서 return

        return memberRepository.findById(id).orElseThrow(()-> new NoSuchElementException("id없습니다."));

    }


//    3. 회원 목록조회
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

//    4. 로그인
    public Member logIn(Long id, String password) throws IllegalArgumentException {
        if(!memberRepository.findById(id).isPresent()) {
            throw new IllegalArgumentException("ID없음.");
        } else {
            if(memberRepository.findById(id).get().getPassword().equals(password)) {
                return memberRepository.findById(id).get();
            } else {
                throw new IllegalArgumentException("password불일치");
            }
        }
    }

}
