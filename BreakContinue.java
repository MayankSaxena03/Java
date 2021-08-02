public class BreakContinue {
    public static void main(String[] args) {
        //break statement is used to break out of a loop or switch
        for(int i=1; i<=10; i++) {
            System.out.print(i + " ");
            if(i==5) {
                break;
            }//loop will end after printing 5
        }

        System.out.println("\n--------------------------"); // Line Break

        //Continue statement is used when you have to ignore a case in loop.
        for(int i=1; i<=10; i++) {
            if(i==5) {
                continue;
            }//for i=5 loop won't run statements below this
            System.out.print(i + " ");
        }
    }
}
