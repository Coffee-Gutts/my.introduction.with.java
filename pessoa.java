//fazendo uma classe (Pessoa )com seus objetos, no caso os objetos são: nome,email e cpf 

public class pessoa {
    public class Pessoa {
        public String nome;
        public String email;
        public String cpf;  

//Em uma classe, além das características (propriedades) comuns aos objetos, temos também os comportamentos que aquele objeto pode executar. exemplo:
      
      
        public String exibirDados() {
            return "=== Dados da Pessoa ===" + "\n" +
                    "Nome: " + this.nome + "\n" +
                    "Email: " + this.email + "\n" +
                    "CPF: " + this.cpf;

                    //Então, para a utilização de objetos precisamos definir as classes, por isso alguns defendem que poderíamos chamar de “Programação Orientada a Classes”, o que daria muito certo também

        }
    }
}

//no mundo real, podemos identificar e classificar diversos objetos que compartilham um conjunto de características em comum. Por exemplo, um livro é um conceito que pode representar vários objetos com características compartilhadas, como capa, autor, número de páginas, ISBN, entre outros; assim, diante de objetos que têm em comum esse conjunto de características, conseguimos classificá-los como livros


