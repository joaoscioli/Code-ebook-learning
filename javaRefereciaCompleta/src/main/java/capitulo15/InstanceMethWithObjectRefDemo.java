package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 12

// Use uma referência de método de instância com diferentes objetos.
public class InstanceMethWithObjectRefDemo {
    // Um método que retorna o número de ocorrências
    // de um objeto para o qual alguns critérios, conforme especificado por
    // o parâmetro MyFunc é verdadeiro.
    static <T> int counter(T[] vals, MyFunc1<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], v))
                count++;

        return count;
    }

    public static void main(String[] args) {
        int count;

        // Cria um array de objetos HighTemp.
        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(82),
                                   new HighTemp(90), new HighTemp(89),
                                   new HighTemp(89), new HighTemp(91),
                                   new HighTemp(84), new HighTemp(83) };

        // Use counter() com arrays da classe HighTemp.
        // Observe que uma referência ao método de instância
        // sameTemp() é passado como o segundo argumento.
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count + " days had a high of 89");

        // Agora, crie e use outro array de objetos HighTemp.
        HighTemp[] weekDayHighs2 = {new HighTemp(32), new HighTemp(12),
                                    new HighTemp(24), new HighTemp(19),
                                    new HighTemp(18), new HighTemp(12),
                                    new HighTemp(-1), new HighTemp(13) };

        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println(count + " days had a high of 12");

        // Agora, use lessThanTemp() para encontrar os dias em que a temperatura foi menor
        // do que um valor especificado.
        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println(count + " days had a high less than 89");

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println(count + " days had a high less than 19");
    }
}
