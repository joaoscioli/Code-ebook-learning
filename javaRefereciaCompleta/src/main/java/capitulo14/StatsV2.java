//package capitulo14;
//// Nesta versão do Stats, o argumento de tipo para
//// T deve ser Number ou uma classe derivada
//// do Número.
//public class StatsV2<T extends Number> {
//    T[] nums; // array de Number ou subclasse
//    // Passa ao construtor uma referência para
//    // um array do tipo Number ou subclasse.
//    StatsV2(T[] o){
//        nums = o;
//    }
//    // Retorna o tipo double em todos os casos.
//    double average(){
//        double sum = 0.0;
//        for (int i = 0; i < nums.length; i++)
//            sum += nums[i].doubleValue();
//        return sum / nums.length;
//    }
//}
