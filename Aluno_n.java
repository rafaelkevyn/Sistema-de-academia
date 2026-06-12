class Aluno_n extends Pessoa{
    private int matricula;

    public Aluno_n(String nome, int idade, String telefone, String cpf, int matricula){
       super(nome, idade, telefone, cpf);
       this.matricula = matricula; 
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + getCpf());
        System.out.println("Matricula: " + getMatricula());
    }
}