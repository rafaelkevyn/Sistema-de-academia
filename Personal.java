class Personal extends Pessoa{
    private String salario;

    public Personal(String nome, int idade, String telefone, String cpf, String salario){
       super(nome, idade, telefone, cpf);
       this.salario = salario; 
    }
    public String getSalario(){
        return salario;
    }
    public void setSalario(String salario){
        this.salario = salario;
    }
    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salario: " + getSalario());
    }
}
