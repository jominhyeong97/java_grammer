package C06EtcClass;

public class C01Math {
    public static void main(String[] args) {
//        임의의 수 반환 : Math.ranndom (0.0~1.0사이의 double형 반환

//        로또 번호 7개 뽑기 0~99까지의 7개숫자
        for(int i=0; i<7; i++) {
            int a = (int) (Math.random() * 100);
            System.out.println(a);
        }

//        절대값
        System.out.println(Math.abs(-5));


//        올림 : Math.ceil , 내림 : Math.floor, 반올림 : Math.round


//        최대값 : Math.max(a,b) , 최소값 : Math.min(a,b)

        System.out.println(Math.max(10,20));


//        제곱 : Math.pow(a,b) a의 b제곱 (b가승수)
        System.out.println(Math.pow(2,3));

//        제곱근 : Math.sqrt(a) a의 제곱근 : 소수구하기에서 응용
        System.out.println(Math.sqrt(25));






    }
}
