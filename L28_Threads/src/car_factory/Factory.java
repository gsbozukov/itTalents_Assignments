package car_factory;
class Factory {
    final Object key = new Object();
    final Object key2 = new Object();
    volatile int frame = 0;
    volatile int engine = 0;
    volatile int seats = 0;
    volatile int tyres = 0;

    Thread pl1 = new Thread(){
        @Override
        public void run() {
            startProduction();
        }
    };
    Thread pl2 = new Thread(){
        @Override
        public void run() {
            startProduction();
        }
    };
    Thread pl3 = new Thread(){
        @Override
        public void run() {
            startProduction();
        }
    };

    void start (){
        pl1.start();
        pl2.start();
        pl3.start();
    }

    private void startProduction (){
        while (true){
            if (frame >= 1 && engine >= 1 && seats >= 5 && tyres >= 4){
                synchronized (key2){
                    if (pl1.isInterrupted() || pl2.isInterrupted() || pl3.isInterrupted()){
                        Thread.currentThread().interrupt();
                        return;
                    }
                    else {
                        System.out.println("Your car has been completed.");
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
            for (int i = 0; i < 4; i++) {
                switch (i){
                    case 0: if (frame>=1){
                        continue;
                    }
                    else {
                        try {
                            synchronized (key){
                                frame++;
                                i--;
                            }
                            System.out.println("Creating a frame... #" + this.frame);
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            System.out.println("Someone interrupted me!");
                        }
                    }
                    break;
                    case 1: if (engine>=1){
                        continue;
                    }
                    else {
                        try {
                            synchronized (key){
                                engine++;
                                i--;
                            }
                            System.out.println("Creating an engine... #"+this.engine);
                            Thread.sleep(7000);
                        } catch (InterruptedException e) {
                            System.out.println("Someone interrupted me!");
                        }
                    }
                        break;
                    case 3: if (seats>=5){
                        continue;
                    }
                    else {
                        try {
                            synchronized (key){
                                seats++;
                                i--;
                            }
                            System.out.println("Creating a seat...#" + this.seats);
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            System.out.println("Someone interrupted me!");
                        }
                    }
                        break;
                    case 2: if (tyres>=4){
                        continue;
                    }
                    else {
                        try {
                            synchronized (key){
                                tyres++;
                                i--;
                            }
                            System.out.println("Creating a tyre... #"+this.tyres);
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            System.out.println("Someone interrupted me!");
                        }
                    }
                        break;
                }
            }
        }
    }

}
