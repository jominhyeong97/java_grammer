# 📗 Java Grammar Study

Java 문법 학습 내용을 정리한 저장소입니다.  
직접 실습하며 학습한 개념들을 폴더별로 분류했습니다.

---

## 🗓 학습 기간

- 2025.06.01 ~ 2025.06.27

---

## 📁 폴더 구성

| 폴더명 | 내용 |
|--------|------|
| `C01Basic` | 변수, 자료형, 연산자 등 기본 문법 |
| `C02ClassBasic` | 클래스와 객체 기본 개념 |
| `C03Inheritance` | 상속 개념 |
| `C04Interface` | 인터페이스와 다형성 |
| `C05AnonymousLamda` | 익명 클래스와 람다식 |
| `C06EtcClass` | 기타 클래스 개념 (Wrapper, String 등) |
| `C07ExceptionFileParsing` | 예외 처리와 파일 입출력 |
| `C08Thread` | 쓰레드 기본 |
| `C09NetWorking` | 네트워크 통신 기초 |
| `C10Annotation` | 애노테이션 사용법 |

---

## 🧪 실행 방법

1. JDK 설치 (Java 11 이상 권장)
2. IDE에서 src 폴더 열기
3. 각 챕터별 `.java` 파일 실행

---

## ✍️ 비고

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

=======
- 모든 코드는 직접 타이핑하며 실습한 내용입니다.
- 기초 문법부터 자바의 주요 기능까지 간단 명료하게 구성했습니다.

