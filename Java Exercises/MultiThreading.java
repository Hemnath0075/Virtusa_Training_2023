class Multithread implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MultiThreading {
    public static void main(String[] args) {
        int threads = 10;
        for (int i = 0; i < threads; i++) {
            Thread t = new Thread(new Multithread());
            t.start();
        }
    }
}