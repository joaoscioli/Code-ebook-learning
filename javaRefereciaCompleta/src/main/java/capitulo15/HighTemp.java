package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 12

// Use uma referência de método de instância com diferentes objetos.
// Uma classe que armazena a temperatura alta por um dia.
public class HighTemp {
    private int hTemp;

    HighTemp (int ht) {
        hTemp = ht;
    }

    // Retorna verdadeiro se o objeto chamador HighTemp tiver o mesmo
    // temperatura como ht2.
    boolean sameTemp (HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    // Retorna verdadeiro se o objeto chamador HighTemp tiver uma temperatura
    // que é menor que ht2.
    boolean lessThanTemp (HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }

}
