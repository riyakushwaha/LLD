package Patterns.Singleton;

public class DoubleCheckedLocking {
    private static volatile DoubleCheckedLocking instance;

    private DoubleCheckedLocking(){};
//does not work on earlier version of JVM
    private static DoubleCheckedLocking getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedLocking.class){
                if(instance == null){
                    instance = new DoubleCheckedLocking();
                }
            }
        }

        return  instance;
    }
}
