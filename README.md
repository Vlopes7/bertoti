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

```
package cadastro_livro;

public class Livro {
    private int id;
    private String titulo;
    private String autor;

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor;
    }
}
```



```
package cadastro_livro;

import java.util.List;
import java.util.LinkedList;

public class Biblioteca {
    private List<Livro> livros = new LinkedList<>();

    public void adicionarLivro(Livro novoLivro) {
        livros.add(novoLivro);
    }

    public Livro buscarPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public List<Livro> buscarPorTitulo(String titulo) {
        List<Livro> encontrados = new LinkedList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                encontrados.add(livro);
            }
        }
        return encontrados;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
```



```
package cadastro_livro;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro(2, "1984", "George Orwell");
        Livro livro3 = new Livro(3, "O Senhor dos Anéis", "J.R.R. Tolkien");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        Livro livroBuscadoID = biblioteca.buscarPorId(2);
        if (livroBuscadoID != null) {
            System.out.println("Livro encontrado pelo ID: " + livroBuscadoID);
        } else {
            System.out.println("Livro não encontrado pelo ID.");
        }

        List<Livro> livrosEncontrados = biblioteca.buscarPorTitulo("O Senhor dos Anéis");
        System.out.println("Livros encontrados pelo título 'O Senhor dos Anéis':");
        for (Livro livro : livrosEncontrados) {
            System.out.println(livro);
        }
    }
}
```
