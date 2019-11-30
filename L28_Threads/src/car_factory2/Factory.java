package car_factory2;

import java.time.LocalTime;

public class Factory {
    volatile int frame = 0;
    volatile int engine = 0;
    volatile int seats = 0;
    volatile int tyres = 0;

    Thread pl1 = new Thread(()-> {
        //will make engine and frame
        engine++;
        System.out.println("Creating engine... #"+engine);
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            System.out.println("oops");
        }
        frame++;
        System.out.println("Creating frame... #"+frame);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("oops");
        }
    });
    Thread pl2 = new Thread(()-> {
        //will make seats only
        while (seats < 5){
            seats++;
            System.out.println("Creating seat... #"+seats);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("oops");
            }
        }
    });
    Thread pl3 = new Thread(()-> {
        //will make tyres and one seat
        while (seats < 5){
            while (tyres < 4){
                tyres++;
                System.out.println("Creating tyre... #"+tyres);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("oops");
                }
            }
            seats++;
            System.out.println("Creating seat... #"+seats);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("oops");
            }
        }
    });

    Thread timer = new Thread(()->{
        while (true){
            showTime();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("ops");
            }
        }
    });

    void showTime(){
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }

    void start (){
        pl1.start();
        pl2.start();
        pl3.start();
        timer.setDaemon(true);
        timer.start();
    }
}
