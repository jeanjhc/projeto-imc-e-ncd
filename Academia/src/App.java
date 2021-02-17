import java.time.LocalDate;
import br.com.academia.model.*;
public class App {
public static void main(String[] args) {
Pessoa pessoaJean = new Pessoa ();
pessoaJean.setNome("Jean Henrique");
pessoaJean.setAltura(1.75);
pessoaJean.setPeso(85);
pessoaJean.setDataNascimento(LocalDate.of(2004, 01, 01));
pessoaJean.setGenero("Masculino");
pessoaJean.setNivelatividade("Moderado");
System.out.println(pessoaJean.getNome());
System.out.println(pessoaJean.getAltura());
System.out.println(pessoaJean.getPeso());
System.out.println(pessoaJean.getImc());
System.out.println(pessoaJean.getIdade());
System.out.println(pessoaJean.getGenero());
System.out.println(pessoaJean.getNivelatividade());

}
}

