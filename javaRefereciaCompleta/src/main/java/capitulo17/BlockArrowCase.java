package capitulo17;
//TODO capitulo 17 Switch Expressions, Records, and Other Recently Added Features Demonstracao 04

// Use blocos com uma seta.
public class BlockArrowCase {

    public static void main(String[] args) {
        boolean stopNow;

        int eventCode = 9300;

        // Use blocos de código com uma seta. Mais uma vez, observe
        // que nenhuma instrução break é necessária (ou permitida)
        // para evitar queda. Porque o alvo de um
        // a seta é um bloco, yield deve ser usado para fornecer um valor.
        int priorityLevel = switch (eventCode) {
            case 1000, 1205, 8900 -> { // usa um bloco com uma seta
                stopNow = false;
                System.out.println("Alert");
                yield 1;
            }
            case 2000, 6010, 9128 -> {
                stopNow = false;
                System.out.println("Warning");
                yield 2;
            }
            case 1002, 7023, 9300 -> {
                stopNow = true;
                System.out.println("Danger");
                yield 3;
            }
            default -> {
                stopNow = false;
                System.out.println("Normal.");
                yield 0;
            }
        };
        System.out.println("Priority level for event code " + eventCode +
                            " is " + priorityLevel);
        if (stopNow) System.out.println("Stop required.");
    }
}
