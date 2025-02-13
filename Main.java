public class Main{
public static void main(String[] args) {
   
   
//     String nome;
//    int idade;

// nome="Marta";
// idade=25;

// System.out.println("Nome"+nome);
// System.out.println("Idade"+idade);

Pessoas pessoas = new Pessoas ("Marta",25,"marta@gmai.com");

pessoas.setNome("jose");

System.out.println("Nome"+pessoas.getNome());
System.out.println("Idade"+pessoas.getIdade());
System.out.println("E-mail"+pessoas.getEmail());



}
}

