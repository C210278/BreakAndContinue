public class Main {

    public static void main(String[] args) {
        System.out.println("START");
        for (int num = 0; num < 15; num++) {
            if(num == 11) { break; }
            else if(num % 4 == 0) { continue; }
            else if(num == 5) { continue; }
            System.out.println(num);
        }
        System.out.println("END");            
    }

}