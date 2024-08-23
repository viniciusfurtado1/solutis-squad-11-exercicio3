package lista3.questao_47;

public class Paciente {

    private String nome;
    private String sexo;
    private double peso;
    private int idade;
    private double altura;

    public Paciente() {

    }

    public Paciente(String nome, String sexo, double peso, int idade, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("Paciente {" +
                "nome = " + nome +
                ", sexo = " + sexo +
                ", peso = %.1fkg" +
                ", idade = " + idade +
                ", altura = %.2fm" +
                '}', peso, altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
