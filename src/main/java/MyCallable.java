import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int counter = 0;
//        while (counter < 5){
//            System.out.printf("Сообщение номер %d от потока %s\n", counter + 1, Thread.currentThread().getName());
//            Thread.sleep(2000);
//            counter++;
//        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Сообщение номер %d от потока %s\n", counter + 1, Thread.currentThread().getName());
            Thread.sleep(2000);
            counter++;
        }

        return counter;
    }
}