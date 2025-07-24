
# 📗 Java Grammar Study

Java 문법과 핵심 개념을 정리한 저장소입니다.  
비전공자도 이해할 수 있도록 **예제 중심 + 단계별 구성**으로 정리했습니다.

---

## 🗓 학습 기간

- 2025.06.01 ~ 2025.06.27  
- 주 5회, 하루 평균 1시간 공부 + 커밋 기록

---

## 🎯 학습 목표

- Java 기본 문법 (변수, 연산자, 제어문) 이해  
- 함수, 배열, 컬렉션, 객체지향 개념 실습  
- 예외 처리, 파일 I/O, 쓰레드, 스트림 API 등 심화 부분 학습

---

## 🛠 폴더 구성 설명

| 파일 / 폴더               | 설명 |
|---------------------------|------|
| `1.basic_syntax/`         | 변수, 자료형, 연산자 실습 |
| `2.control_structure/`    | if, switch, for, while 등 흐름 제어 |
| `3.methods_and_scope/`    | 메서드, 매개변수, 리턴, 스코프 |
| `4.arrays_collections/`   | 배열, ArrayList, HashMap 등 사용 예 |
| `5.oop_concepts/`         | 클래스, 상속, 인터페이스 실습 |
| `6.exception_io/`         | 예외 처리, 파일 읽기/쓰기 예제 |
| `7.threads_streams/`      | Thread, Runnable, Stream 기본 흐름 |
| `README.md`               | 이 파일 (학습된 내용 한눈에 보기) |

---

## 🚀 예제 코드 스니펫

```java
// 배열 합 계산 예제
public class SumArray {
  public static int sum(int[] arr) {
    int total = 0;
    for (int n : arr) {
      total += n;
    }
    return total;
  }
}

// Stream API 예제
List<String> names = Arrays.asList("Kim", "Lee", "Park");
List<String> filtered = names.stream()
                              .filter(s -> s.startsWith("K"))
                              .collect(Collectors.toList());
```

---

## 🔧 실행 방법

1. JDK 설치 (Java 11 이상 권장)  
2. 각 폴더에서 `javac`로 컴파일 후 `java`로 실행  
3. IDE 이용 시 프로젝트별 폴더로 열어 사용 가능

---

## 📚 참고 자료

- Oracle Java 튜토리얼  
- 생활코딩 자바 입문  
- Java 공식 문서, Stack Overflow 등

---

> ✍️ 이 레포는 단일 문법 참고용이 아니라—  
> “내가 이 개념을 왜 공부했고, 어떻게 학습했는지를 보여주는 기록실”입니다.  
> 이력서나 면접에서 “이렇게 공부했다”를 말할 때,  
> **GitHub 링크 하나로 이해될 수 있도록 설계되었습니다.**
