# Java Basics
  O Porojeto visa o estudo de alguns conceitos importantes em java

## 📖 Generics em Java

Generics é um poderoso recurso introduzido no Java 5️⃣ que permite a tipificação de classes, interfaces e métodos. Usando generics, é possível criar código que opera em várias classes de objetos, mantendo a segurança do tipo em tempo de compilação.

## 🌟 Vantagens de usar Generics

1. 🔒 **Segurança de Tipo:** O compilador verifica o tipo, então você tem segurança em tempo de compilação.
2. 🔄 **Reusabilidade:** Pode-se escrever um método, uma classe ou uma interface que pode ser usada para diferentes tipos.
3. 📚 **Melhoria na Legibilidade:** Generics adicionam uma camada adicional de claridade ao código, ao indicar claramente o tipo de objeto com o qual o código está lidando.

## 📝 Exemplo Básico

Antes dos generics:

```java
List list = new ArrayList();
list.add("Hello");
String text = (String) list.get(0);  // Casting é necessário
```

Depois dos generics:
```java
List<String> list = new ArrayList<>();
list.add("Hello");
String text = list.get(0);  // Sem necessidade de casting
```
Neste exemplo, a lista está tipificada para conter apenas strings, eliminando a necessidade de fazer um casting explícito.
Os Generics oferecem uma maneira de tornar o código Java mais seguro e legível. Eles permitem aos programadores especificar, com um conjunto de "regras", o tipo de dados com o qual uma classe particular irá operar, em vez de deixar isso para o tempo de execução. Essas "regras" são então verificadas em tempo de compilação.

## 🛠 Default Methods (Métodos Padrão) no Java 8
Com a introdução do Java 8, um novo recurso foi adicionado à linguagem: os Default Methods. Este recurso é uma maneira de adicionar novos métodos a interfaces sem afetar as classes que já as implementam. Isso é especialmente útil para evolução de APIs e bibliotecas.

1. 🌟 Vantagens dos Default Methods
2. 🔄 Evolução de APIs: Permite que as bibliotecas e APIs evoluam sem quebrar o código existente. Novos métodos podem ser adicionados às interfaces sem afetar implementações existentes.
3. 📚 Flexibilidade: Oferece uma maneira de ter implementações padrão de métodos na interface, o que anteriormente era possível apenas em classes abstratas.
4. 🚀 Múltipla Herança: Java não suporta múltipla herança de classes, mas com métodos padrão, é possível herdar comportamentos de várias interfaces.

📝 Exemplo de Default Method

```java
public interface MeuInterface {
    default void meuMetodoPadrao() {
        System.out.println("Implementação padrão do método!");
    }

    void outroMetodo();
}

public class MinhaClasse implements MeuInterface {
    @Override
    public void outroMetodo() {
        System.out.println("Implementação de outroMetodo.");
    }
}

public class Teste {
    public static void main(String[] args) {
        MinhaClasse obj = new MinhaClasse();
        obj.meuMetodoPadrao();  // Irá imprimir: "Implementação padrão do método!"
        obj.outroMetodo();     // Irá imprimir: "Implementação de outroMetodo."
    }
}
```
Os Default Methods são uma ferramenta poderosa, permitindo uma evolução mais fluida e flexível das interfaces em Java.