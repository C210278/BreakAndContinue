public class Main {

    public static void main(String[] args) {
        System.out.println("START");
        for (int num = 0; num < 15; num++) {
            if(num == 9) { break; }
            else if(num % 3 == 0) { continue; }
            else if(num == 6) { break; }
            System.out.println(num);
        }
        System.out.println("END");            
    }
    
}