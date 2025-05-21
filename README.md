# Resumo e Comentários

## Trecho 1 - **Comentário**
O trecho destaca a diferença fundamental entre "engenharia de software" e "programação". Enquanto a programação envolve escrever código, a engenharia de software vai além, aplicando conhecimentos teóricos para criar soluções práticas, embora intangíveis. Ao comparar com outras engenharias, como a aeronáutica, o autor observa que, ao contrário de áreas como essas, onde erros podem ser fatais, a engenharia de software ainda carece de um rigor similar. O autor acredita que, com o aumento da presença do software no cotidiano, é essencial adotar práticas mais confiáveis e rigorosas. O livro visa contribuir para o desenvolvimento dessas práticas.

## Trecho 2 - **Comentário**
Este trecho propõe que a engenharia de software não se limita à escrita de código, mas envolve também as ferramentas e processos necessários para manter esse código ao longo do tempo. A ideia central é que a engenharia de software deve ser vista como "programação integrada ao longo do tempo", ou seja, como tornar o código sustentável e flexível para se adaptar às mudanças durante seu ciclo de vida. O livro destaca três princípios cruciais para o desenvolvimento e manutenção do código:  Tempo e mudança, escala e crescimento e compromissos e custos.

## Exemplos de **Trade-offs** em Engenharia de Software

1. **Simplicidade vs. Funcionalidade**  
   A escolha entre manter o código simples e fácil de entender ou adicionar funcionalidades mais complexas. Embora funcionalidades adicionais ofereçam mais recursos ao usuário, elas podem tornar o código mais difícil de manter.

2. **Desempenho vs. Manutenibilidade**  
   Optar por um código altamente otimizado para desempenho, mas que pode ser difícil de modificar no futuro, ou por uma solução mais simples, com código legível e fácil de manter, porém com desempenho ligeiramente inferior.

3. **Tempo de Desenvolvimento vs. Qualidade do Código**  
   A decisão entre priorizar uma entrega rápida com código menos limpo e com menos testes, ou investir mais tempo para garantir um código bem estruturado, testado e com menos probabilidade de falhas.

## Comentário do **Slide 57**
No slide 57, é enfatizado que a construção do produto deve estar alinhada com o valor definido pelo cliente ao longo das Sprints. Nesse contexto, a entrega de partes do produto sem funcionalidade plena não pode ser considerada uma entrega real. No entanto, ao fornecer protótipos que, mesmo não sendo idênticos ao produto final, resolvem eficazmente o problema do cliente, é possível entregar valor real. Ao final, o produto completo estará conforme a ideia original.


---

## Exemplo de Código Java – Cadastro de Clientes

```java
// Cadastro_cliente.java
package cadastro_cliente;

public class Cadastro_cliente {
    private int id;
    private String nome;
    private String email;

    public Cadastro_cliente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getid() {
        return id;
    }

    public String getnome() {
        return nome;
    }

    public String getemail() {
        return email;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setemail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Email: " + email;
    }
}



// Loja.java
package cadastro_cliente;

import java.util.List;
import java.util.LinkedList;

public class Loja {
    private List<Cadastro_cliente> cadastro_Clientes = new LinkedList<Cadastro_cliente>();

    public void addCadastro_cliente(Cadastro_cliente novoCadastro) {
        cadastro_Clientes.add(novoCadastro);
    }

    public Cadastro_cliente buscarID(int id) {
        for (Cadastro_cliente cliente : cadastro_Clientes) {
            if (cliente.getid() == id) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cadastro_cliente> buscarNome(String nome) {
        List<Cadastro_cliente> encontrados = new LinkedList<Cadastro_cliente>();
        for (Cadastro_cliente Cadastro_cliente : cadastro_Clientes) {
            if (Cadastro_cliente.getnome().equals(nome))
                encontrados.add(Cadastro_cliente);
        }
        return encontrados;
    }

    public List<Cadastro_cliente> getCadastro_cliente() {
        return cadastro_Clientes;
    }
}



// Main.java
package cadastro_cliente;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        Cadastro_cliente cliente1 = new Cadastro_cliente(1, "João", "joao@gmail.com");
        Cadastro_cliente cliente2 = new Cadastro_cliente(2, "Maria", "maria@gmail.com");

        loja.addCadastro_cliente(cliente1);
        loja.addCadastro_cliente(cliente2);

        Cadastro_cliente clienteBuscadoID = loja.buscarID(1);
        if (clienteBuscadoID != null) {
            System.out.println("Cliente encontrado pelo ID: " + clienteBuscadoID);
        } else {
            System.out.println("Cliente não encontrado pelo ID.");
        }

        List<Cadastro_cliente> clientesEncontrados = loja.buscarNome("João");
        System.out.println("Clientes encontrados pelo nome 'João':");
        for (Cadastro_cliente cliente : clientesEncontrados) {
            System.out.println(cliente);
        }
    }
}

```
