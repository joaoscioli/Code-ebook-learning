package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 25

/* Um banco de dados simples de números de telefone que usa
  uma lista de propriedades. */
import java.io.*;
import java.util.*;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        // Tente abrir o arquivo phonebook.dat.
        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            // ignora arquivo ausente
        }

        /* Se o arquivo de agenda já existir,
        carregar números de telefone existentes. */
        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        // Permite que o usuário insira novos nomes e números.
        do {
            System.out.println("Enter new name" +
                    " ('quit' to stop): ");
            name = br.readLine();
            if (name.equals("quit")) continue;

            System.out.println("Enter number: ");
            number = br.readLine();

            ht.setProperty(name, number);
            changed = true;
        } while (!name.equals("quit"));

        // Se os dados do catálogo telefônico foram alterados, salve-os.
        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");

            ht.store(fout, "Telephone Book");
            fout.close();
        }

        // Pesquise números com um nome.
        do {
            System.out.println("Enter name to find" +
                    " ('quit' to quit): ");
            name = br.readLine();
            if (name.equals("quit")) continue;

            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("quit"));
    }
}
