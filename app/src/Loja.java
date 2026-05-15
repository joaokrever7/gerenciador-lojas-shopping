public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionario < 0) {
            return -1.0;
        }
        return salarioBaseFuncionario * quantidadeFuncionarios;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }


}
