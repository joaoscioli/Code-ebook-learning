package capitulo22;
//TODO capitulo 22 Input/Output: Exploring java.io Demonstracao 22;

//A demonstração da serializacao
import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {

        // serialização do objeto
        try (ObjectOutputStream objOStrm =
                     new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Exception during serialization: " + e);
        }

        // desserialização do objeto
        try (ObjectInputStream objIStrm =
                     new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass)objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (IOException e) {
            System.out.println("Exception during deserialization: " + e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
