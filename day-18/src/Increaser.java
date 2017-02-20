public class Increaser implements Runnable {

  private final static int LIMIT = 100;
  private final static int MAX = 1000;
  private Counter c;

  public Increaser(Counter counter) {
    this.c = counter;
  }

  public static void main(String[] args) {
    Counter counter = new Counter();
    for (int i = 0; i < LIMIT; i++) {
      Increaser increaserTask = new Increaser(counter);
      Thread t = new Thread(increaserTask);
      // Thread currentThread = Thread.currentThread();
      t.start();

      // System.out.println("Current thread: " + currentThread.getId());
    }
  }

  @Override
  public void run() {
    System.out.println("Starting at " + c.getCount());
    for (int i = 0; i < MAX; i++) {
      c.increase();
    }
    System.out.println("Stopping at " + c.getCount());
  }
}
