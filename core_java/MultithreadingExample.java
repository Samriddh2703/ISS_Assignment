package ISSTask1;

//Point 8: Multithreading, Thread pool executor, volatile keyword, thread-safe
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Counter {
 private volatile int count = 0;

 public synchronized void increment() {
     count++;
 }

 public int getCount() {
     return count;
 }
}

public class MultithreadingExample {
 public static void main(String[] args) {
     // Thread pool executor
     ExecutorService executorService = Executors.newFixedThreadPool(2);
     Counter counter = new Counter();

     // Creating multiple threads
     Runnable task = () -> {
         for (int i = 0; i < 1000; i++) {
             counter.increment();
         }
     };

     // Submitting tasks to the executor
     executorService.submit(task);
     executorService.submit(task);

     // Shutting down the executor
     executorService.shutdown();

     // Ensuring all tasks are completed before proceeding
     while (!executorService.isTerminated()) {
     }

     // Thread-safe access
     System.out.println("Count: " + counter.getCount());
 }
}
