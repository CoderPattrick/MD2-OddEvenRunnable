public class OddThread extends Thread {
    public OddThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 11 ; i++) {
                if(i%2==1){
                    System.out.println("Odd  number: "+i);
                    Thread.sleep(100);
                }
            }
        } catch (InterruptedException e) {
            System.err.println("Odd thread interrupted!");
        }
    }
}
