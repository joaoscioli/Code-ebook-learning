package capitulo17;
//TODO capitulo 17 Switch Expressions, Records, and Other Recently Added Features Demonstracao 05

// Use setas case com uma instrução switch
public class StatementSwitchWithArrows {

    public static void main(String[] args) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;

        char direction = 'R';

        // Use setas com uma instrução switch. Notar que
        // nenhum valor é produzido.
        switch (direction) {
            case 'L' -> {
                System.out.println("Turning Left");
                left++;
            }
            case 'R' -> {
                System.out.println("Turning Right");
                right++;
            }
            case 'U' -> {
                System.out.println("Moving Up");
                up++;
            }
            case 'D' -> {
                System.out.println("Moving Down");
                down++;
            }
        }
        System.out.println(right);
    }
}
