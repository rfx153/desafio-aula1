import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
            Pessoa jose = new Pessoa();

            jose.setIdade(25);
            jose.setNome("josé silva");
            System.out.println(jose.toString());

    }
}