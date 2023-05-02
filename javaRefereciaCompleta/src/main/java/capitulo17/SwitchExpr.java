package capitulo17;
//TODO capitulo 17 Switch Expressions, Records, and Other Recently Added Features Demonstracao 02


// Neste switch tradicional, o empilhamento de caixas é usado.
public class SwitchExpr {
    public static void main(String[] args) {
        int eventCode = 6010;

        // Esta é uma expressão de troca. Observe como seu valor é atribuído
        // para a variável priorityLevel. Observe também como o valor do
        // switch é fornecido pela instrução yield.
        int priorityLevel = switch (eventCode) {
            case 1000, 1205, 8900:
                yield 1;
            case 2000, 6010, 9128:
                yield 2;
            case 1002, 7023, 9300:
                yield 3;
            default:
                yield 0;
        };
        System.out.println("Priority level for event code " + eventCode +
                            " is " + priorityLevel);
    }
}
