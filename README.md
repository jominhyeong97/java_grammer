
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

| 파일 / 폴더 | 설명 |
|-------------|------|
| `01_variable_operator/` | 변수 선언 및 연산자 실습 |
| `02_condition_loop/` | 조건문과 반복문 제어 흐름 |
| `03_method/` | 메서드 정의와 호출, 리턴, 스코프 |
| `04_array/` | 1차원/2차원 배열 실습 |
| `05_class_inheritance/` | 클래스 선언과 상속 관계 |
| `06_polymorphism_abstract_interface/` | 다형성, 추상 클래스, 인터페이스 |
| `07_package_import/` | 패키지, 접근제어자, import 활용 |
| `08_api_wrapper/` | String, Math, Wrapper 등 자바 API |
| `09_exception/` | 예외 처리 및 try-catch 문법 |
| `10_collection/` | List, Set, Map 등 컬렉션 프레임워크 |
| `11.generic/` | 제네릭(Generic) 문법 |
| `12.innerclass/` | 중첩 클래스와 익명 클래스 |
| `13.etc/` | 기타 문법들 모음 (static, final 등) |

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

