public class Main {
    public static void main(String[] args) {
        OddThread odd = new OddThread("OddThread");
        EvenThread even = new EvenThread("EvenThread");
        odd.start();
        try{
            System.out.println("Current thread: "+odd.getName());
            odd.join();
        } catch (InterruptedException e) {
            System.err.println("OddThread dead!!");
        }
        even.start();
        try {
            while(odd.isAlive()||even.isAlive()){
                System.out.println("Main still running lmao!");
                Thread.sleep(300);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Yo Main is dead bro!");
        }
        System.out.println("Main is over!");
    }
}
