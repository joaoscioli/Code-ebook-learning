package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 13


// Demonstra uma referência de método para um método genérico
// Esta classe define um método chamado countMatching() que
// retorna o número de itens em um array que são iguais
// para um valor especificado. Observe que countMatching()
// é genérico, mas MyArrayOps não é.
class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for(int i=0; i < vals.length; i++)
            if(vals[i] == v) count++;
        return count;
    }

}
