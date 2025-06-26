package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//저장소역할을 하는 계층
//DB의 CRUD를 수행하는 계층
public class MemberRepository {
    private static List<Member> list = new ArrayList<>();

//    회원가입
    public void register (Member member) {
        list.add(member);
    }

//    회원상세조회
    public Optional<Member> findById (Long id) {
        for(Member m : list) {
            if(m.getId().equals(id)) {
                return Optional.of(m);

            }
        }return Optional.empty();
//        return list.stream().filter(a -> a.equals(a.getId())).findFirst();
    }

    public Optional<Member> findByEmail (String email) {
        for(Member m : list) {
            if(m.getEmail().equals(email)) {
                return Optional.of(m);

            }
        }return Optional.empty();
    }

//    회원목록조회
    public List<Member> findAll(){
        return list;
    }


}
