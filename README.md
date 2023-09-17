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


## 🚀 Funções Lambda no Java 8
As funções Lambda foram introduzidas no Java 8 e representam uma das maiores evoluções da linguagem. Uma função Lambda é uma função anônima (ou seja, sem nome) que pode ser usada para representar uma instância de interface funcional.

1. 🌟 Vantagens das Funções Lambda:
2. 🔥 Sintaxe Concisa: Reduz a verbosidade do código e foca na lógica principal.
3. 💡 Flexibilidade: Pode ser usado principalmente em coleções e APIs que aceitam comportamento como um dos parâmetros.
4. 🚀 Expressividade: Oferece uma maneira clara e concisa de representar um pedaço de funcionalidade.


### 📝 Exemplo Básico
Sem funções lambda:

```java

Collections.sort(words, new Comparator<String>() {
public int compare(String s1, String s2) {
return Integer.compare(s1.length(), s2.length());
}
});
```

```java
Com funções lambda:

java
words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
```
No exemplo acima, a função lambda (s1, s2) -> Integer.compare(s1.length(), s2.length()) substitui o uso de uma classe anônima, tornando o código mais legível e conciso.

As funções lambda, combinadas com os novos recursos da API de Streams do Java 8, proporcionam uma programação mais declarativa, permitindo aos desenvolvedores escrever código mais limpo e expressivo.

## 🔗 Method References no Java 8
Method References (Referências de Métodos) são uma das funcionalidades introduzidas no Java 8. Eles atuam como um tipo especial de expressão lambda, e permitem que você faça referência diretamente aos métodos ou construtores de uma classe, sem executá-los. Essencialmente, uma method reference é uma abreviação de uma expressão lambda que apenas chama um método específico.

### 🌟 Vantagens das Method References:

1. 🔥 Sintaxe Concisa: Proporciona uma forma ainda mais curta e legível de representar uma função lambda que chama um único método.
2. 💡 Clareza: Torna o código mais claro e compreensível, especialmente quando o nome do método é autoexplicativo.
3. 🚀 Reutilização: Permite reutilizar métodos existentes como expressões lambda.

### Referências a métodos estáticos: Usado para referenciar métodos estáticos em classes.
1. Referências a métodos estáticos: Usado para referenciar métodos estáticos em classes.
Exemplo: Integer::parseInt é equivalente a (x) -> Integer.parseInt(x)

2. Referências a métodos de instância de um objeto particular: Usado para referenciar um método em um objeto específico.
Exemplo: System.out::println é equivalente a x -> System.out.println(x)

3. Referências a métodos de instância de um tipo de objeto arbitrário: Usado para referenciar um método em um objeto de um tipo particular.
Exemplo: String::toLowerCase é equivalente a (s) -> s.toLowerCase()

4. Referências a construtores: Usado para referenciar um construtor.
Exemplo: ArrayList::new cria uma nova instância de ArrayList.

### 📖 Exemplo de Uso:

```java
List<String> words = Arrays.asList("Apple", "Banana", "Cherry");

// Usando expressão lambda
words.forEach(word -> System.out.println(word));

// Usando method reference
words.forEach(System.out::println);

```


Neste exemplo, a method reference System.out::println atua como uma forma abreviada da expressão lambda que imprime cada palavra na lista.

As method references oferecem uma maneira elegante e concisa de lidar com expressões lambda, tornando o código Java mais limpo e compreensível.


## 🌊 Streams no Java 8
A API de Streams, introduzida no Java 8, é uma atualização significativa na linguagem Java, permitindo processamento sequencial e paralelo de dados com expressividade. A API de Streams foi desenvolvida para trazer um novo paradigma de programação funcional para Java, tornando o processamento de dados mais intuitivo e menos verboso.

### 🌟 Vantagens dos Streams:
1. 🔥 Expressividade: A API de Streams fornece uma linguagem clara e fluente para expressar operações complexas de processamento de dados.
2. 💡 Performance: Com a possibilidade de paralelização, as operações de Streams podem ser otimizadas para uso eficiente de múltiplos núcleos da CPU.
3. 🚀 Flexibilidade: O encadeamento de operações permite a composição de transformações de dados complexas de forma legível.

### Operações com Streams:
Os Streams oferecem duas categorias principais de operações:

1. Operações Intermediárias (Intermediate): Transformam um Stream em outro Stream, como filter, map e sorted. Elas são chamadas operações "lazily evaluated", ou seja, são avaliadas apenas quando necessárias.
2. Operações Terminais (Terminal): Produzem um resultado ou um efeito colateral, como collect, forEach, reduce e sum.

### 📝 Exemplo Básico:

Vamos ver um exemplo básico de como usar Streams para filtrar e transformar uma lista:

```java
List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");

List<String> filteredFruits = fruits.stream()          // Convertendo a lista em Stream
.filter(fruit -> !fruit.equals("banana")) // Filtrando bananas
.map(String::toUpperCase)                 // Convertendo para maiúsculas
.collect(Collectors.toList());            // Coletando em uma nova lista

System.out.println(filteredFruits); // [APPLE, CHERRY, DATE]
```

No exemplo acima, primeiro convertemos a lista em um Stream. Em seguida, usamos filter para excluir "banana" e map para transformar cada string em maiúsculas. Finalmente, coletamos os resultados em uma nova lista.

A API de Streams trouxe uma revolução no estilo de programação em Java, movendo-se em direção a um estilo mais funcional. Essa abordagem não apenas torna o código mais conciso e legível, mas também oferece poderosas ferramentas para processamento de dados e manipulação de coleções. Integrado com outros recursos do Java 8, como funções Lambda e Method References, a programação com Streams é uma habilidade essencial para qualquer desenvolvedor Java moderno.