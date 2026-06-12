public class Main {
    public static void main(String[] args){
        Aluno_n a1 = new Aluno_n ("Rafael", 19, "(84) 9 8181-2058", "123.456.789-10", 321);
        Aluno_p a2 = new Aluno_p("Pedro", 20, "(84) 9 1234-5678", "109.876.543-21", 123, "Julio");
        Personal p1 = new Personal("Julio", 30, "(84) 9 3214-6543", "467.143.768-09", "R$3000" );
        
        System.out.println("---Alunos sem personal---");
        a1.exibirDados();
        
        System.out.println("");
        System.out.println("---Alunos com personal");
        a2.exibirDados();
        
        System.out.println("");
        System.out.println("---Personais---");
        p1.exibirDados();
        System.out.println("");
    }
}
