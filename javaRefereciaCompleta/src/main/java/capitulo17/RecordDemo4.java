package capitulo17;
//TODO capitulo 17 Switch Expressions, Records, and Other Recently Added Features Demonstracao 12

// Use um método de instância em um registro.

// Esta versão de Employee fornece um método chamado lastName()
// que retorna apenas o sobrenome do componente name.
// Inclui também a versão do construtor compacto que
// verifica o formato convencional de sobrenome e nome.
record Employee (String name, int idNum) {

    // Use um construtor canônico compacto para remover qualquer líder
    // e espaços à direita no componente de nome. Também executar
    // uma verificação básica de que o formato necessário de sobrenome, nome.
    // é passado para o parâmetro name.
    public Employee {
        // Remova todos os espaços iniciais e finais.
        name = name.trim();

        // Executa uma verificação minimalista de que o nome segue o
        // sobrenome, formato do nome.
        //
        // Primeiro, confirme se o nome contém apenas uma vírgula.
        int i = name.indexOf(','); // procura nomes separados por vírgulas.
        int j = name.lastIndexOf(',');
        if (i != j) throw
                new IllegalArgumentException("Multiple commas found.");

        // Em seguida, confirme se uma vírgula está presente após
        // pelo menos um personagem principal, e pelo menos um
        // caractere segue a vírgula.
        if (i < 1 | name.length() == i + 1) throw
                new IllegalArgumentException("Required format: last, first");
    }

    // Um método de instância que retorna apenas o sobrenome
    // sem o primeiro nome.
    String lastName () {
        return name.substring(0, name.trim().indexOf(','));
    }

}

public class RecordDemo4 {
    public static void main(String[] args) {
        Employee emp = new Employee("Jones, Robert", 1048);

        // Exibe o componente de nome inalterado.
        System.out.println("Employee full name is " + emp.name());

        // Exibe apenas o sobrenome.
        System.out.println("Employee last name is " + emp.lastName());
    }
}
