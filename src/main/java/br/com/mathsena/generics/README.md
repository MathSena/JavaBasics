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