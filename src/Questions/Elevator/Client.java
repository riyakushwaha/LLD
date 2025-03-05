package Questions.Elevator;

public class Client {

    static class Counter {
        private int c = 0;

        public void increment() {
            c++;
        }

        public void decrement() {
            c--;
        }

        public int value() {
            return c;
        }

    }

    public static void main(String[] args) throws InterruptedException {
       /* Runnable runnable = () ->{
            int i = 10;
            while(i > 0){
                System.out.println(i);
                i--;
            }
        };
        Thread t = new Thread(runnable);
        t.start();
                int j = 11;
        while(j <20){
            System.out.println(j);
            if(j == 13) t.join();
            j++;
        }
        */
        Counter c = new Counter();
        Runnable runnable = () ->{
            String name = Thread.currentThread().getName();
            c.increment();
            System.out.println(name+": "+c.value());
            c.decrement();
            System.out.println(name+": "+c.value());
        };



        for(int i = 0; i < 10; i++){
            new Thread(runnable).start();
        }


    }
}
