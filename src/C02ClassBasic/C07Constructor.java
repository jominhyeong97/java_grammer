package C02ClassBasic;

public class C07Constructor {
    public static void main(String[] args) {
//        캘린더 객체 생성 : 연도, 월 ,일 세팅
//        캘린더 객체 생성 : "오늘은 xxx연도 xx월 xx일 입니다."

        Calendar cd = new Calendar("2025","06","18");

//        toString()메서드는 특별한 메서드로 객체명을 출력할 때 자동으로 실행
        System.out.println(cd.today());

    }
}
//Calendar 클래스 생성 : year, month, day 모두 String으로 구성됨 getter setter 둘다

class Calendar {
    private String year;
    private String month;
    private String day;


    //생성자를 통해 객체변수값들을 객체가 만들어지는 시점에 초기화(세팅)

    public Calendar(String year, String month, String day) {
        this.year  = year;
        this.month = month;
        this.day = day;

    }

    //별도 생성자를 추가할 경우, 초기(기본)생성자는 무시가 되므로 필요시 별도로 추가
    public Calendar() {}

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }


    public String today() {
        return "오늘은 " + this.getYear() + "년도 " + this.getMonth() + "월 " + this.getDay() + "일 입니다.";
    }
}
