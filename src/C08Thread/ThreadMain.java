package C08Thread;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {


////        스레드 : 작업의 주체
////        단일 스레드 실행
//        for(int i=0; i<1000; i++) {
//            Library.borrow();
//        }
//
//        System.out.println(Library.getBookCount());


////        멀티스레드 생성 방법(안 중요하고 개념적으로 알면되고 어떻게 동시성이슈를 막을지가 더 중요)
////        방법1.스레드 클래스 상속방식
//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();
//        Thread t3 = new MyThread();
//        Thread t4 = new MyThread();
//
////        Thread클래스 안에 start메서드 내장되어있고 start메서드는 run메서드 호출하면서 스레드 생성
////        각 Thread의 실행 순서는 보장되지 않는다.
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        System.out.println("Hello world");
//


//        방법2.Runnable을 직접 구현한 객체를 thread클래스 생성자에 주입하는 방식

//        new Thread(() -> System.out.println("스레드 실행 시작1")).start();
//        new Thread(() -> System.out.println("스레드 실행 시작2")).start();
//        new Thread(() -> System.out.println("스레드 실행 시작3")).start();
//        new Thread(() -> System.out.println("스레드 실행 시작4")).start();
//        System.out.println("HelloWorld");
//

//        멀티스레드 동시성 이슈 테스트
        for(int i=0; i<1000; i++) {
            Thread t1 = new Thread(()->Library.borrow());
            t1.start();
            t1.join(); //한 스레드가 작업이 모두 완료될 때 다른 스레드 생성하여 작업 수행. -> 사실상 단일스레드처럼 동작되므로 성능 저하 발생
        }

        Thread.sleep(20000);
        System.out.println(Library.getBookCount());





    }
}
