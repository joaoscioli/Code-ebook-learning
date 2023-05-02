package capitulo17;
//TODO capitulo 17 Switch Expressions, Records, and Other Recently Added Features Demonstracao 03

// Use a seta "abreviada" para fornecer o nível de prioridade.
public class SwitchExp2 {
    public static void main(String[] args) {
        int eventCode = 6010;

        // Nesta expressão switch, observe como o valor é fornecido
        // pelo uso de uma caixa de seta. Observe que nenhuma instrução break é
        // necessário (ou permitido) para evitar falhas.
        int priorityLevel = switch (eventCode) {
            case 1000, 1205, 8900 -> 1;
            case 2000, 6010, 9128 -> 2;
            case 1002, 7023, 9300 -> 3;
            default -> 0;
        };
        System.out.println("Priority level for event code " + eventCode +
                            " is " + priorityLevel);
    }
}
