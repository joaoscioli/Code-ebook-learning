package capitulo17;
//TODO capitulo 17 Switch Expressions, Records, and Other Recently Added Features Demonstracao 01

// Use um switch tradicional para definir um nível de prioridade com base no qual
// o código do evento é correspondido.
public class TraditionalSwitch {
    public static void main(String[] args) {
        int priorityLevel;

        int eventCode = 6010;

        // Um switch tradicional que fornece um valor associado
        // com um case.
        switch (eventCode) {
            case 1000: // Neste switch tradicional, o empilhamento de caixas é usado.
            case 1205:
            case 8900:
                priorityLevel = 1;
                break;
            case 2000,6010,9128: // Novo estilo, como empilhamento de caixas pode ser usado.
                priorityLevel = 2;
                break;
            case 1002:
            case 7023:
            case 9300:
                priorityLevel = 3;
                break;
            default:
                priorityLevel = 0;
        }
        System.out.println("Priority level for event code " + eventCode +
                            " is " + priorityLevel);
    }
}
