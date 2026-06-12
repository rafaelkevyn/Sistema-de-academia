class Aluno_p extends Pessoa{
    private int matricula;
    private String personal;

    public Aluno_p(String nome, int idade, String telefone, String cpf, int matricula, String personal){
       super(nome, idade, telefone, cpf);
       this.matricula = matricula;
       this.personal = personal; 
    }
    public int getMatricula(){
        return matricula;
    }
    public String getPersonal(){
        return personal;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setPersonal(String personal){
        this.personal = personal;
    }
    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + getCpf());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Personal: " + getPersonal());
    }
}