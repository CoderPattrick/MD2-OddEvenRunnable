public class EvenThread extends Thread {
    public EvenThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 11 ; i++) {
                if(i%2==0){
                    System.out.println("Even number: "+i);
                    Thread.sleep(100);
                }
            }
        } catch (InterruptedException e) {
            System.err.println("Even thread interrupted!");
        }
    }
}
