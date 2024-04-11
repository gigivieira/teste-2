// Autor: [Seu nome completo]

// Classe base representando um Personagem
class Personagem {
    String nome;
    String tipo;
    int nivel;
    protected int id;

    // Construtor da classe Personagem
    public Personagem(int ID) {
        this.id = ID;
        this.nome = "indefinido";
        this.tipo = "indefinido";
        this.nivel = 0;
    }

    // Método para imprimir os dados do Personagem
    public void imprimeDados() {
        System.out.println("Personagem do tipo "+this.tipo+ " com ID = "+this.id);
        System.out.println("Possui nivel "+this.nivel+" e se chama "+this.nome);
    }
}

// Classe Dragao que herda de Personagem
class Dragao extends Personagem {
    int peso;
    int atividade;
    boolean ocupado;

    // Construtor da classe Dragao
    public Dragao(int ID) {
        super(ID);
        this.tipo = "dragao";
        this.nome = "indefinido";
        this.atividade = 0;
        this.ocupado = false;
    }

    // Sobrecarga do construtor para permitir a definição do nome
    public Dragao(int ID, String nome) {
        super(ID);
        this.tipo = "dragao";
        this.nome = nome;
        this.atividade = 0;
        this.ocupado = false;
    }

    // Método específico para Dragao
    public void atuar(int codigo){
        this.imprimeDados();
        System.out.println("Vai executar uma atividade do tipo "+codigo);
    }
}

// Nova classe Cavaleiro que herda de Personagem
class Cavaleiro extends Personagem {
    int forca;
    int defesa;

    // Construtor da classe Cavaleiro
    public Cavaleiro(int ID, String nome, int forca, int defesa) {
        super(ID);
        this.tipo = "cavaleiro";
        this.nome = nome;
        this.forca = forca;
        this.defesa = defesa;
    }

    // Método específico para Cavaleiro
    public void treinar() {
        System.out.println(this.nome + " está treinando para aumentar sua força e defesa.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Atividade de produção - CÓDIGO INICIAL");

        // Criação de um objeto da classe Personagem
        Personagem p = new Personagem(1);
        p.imprimeDados();

        // Criação de um objeto da classe Dragao
        Dragao d1 = new Dragao(2, "Hades");
        d1.atuar(0);

        // Criação de um objeto da classe Cavaleiro
        Cavaleiro c1 = new Cavaleiro(3, "Arthur", 20, 15);
        c1.treinar();
    }
}
