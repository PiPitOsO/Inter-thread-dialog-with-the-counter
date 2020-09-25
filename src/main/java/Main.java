import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        List<MyCallable> myCallableList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            myCallableList.add(new MyCallable());
        }

        Integer result = threadPool.invokeAny(myCallableList);
        System.out.println("Результат расчетов:" + result);
        threadPool.shutdown();
    }
}