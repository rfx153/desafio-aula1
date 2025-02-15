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

            //adicionando novas pessoas
            //Mario
            Pessoa mario = new Pessoa();
            mario.setNome("Mario");
            mario.setIdade(31);
            System.out.println(mario.toString());
            //Maria
            Pessoa maria = new Pessoa();
            maria.setNome("Maria");
            maria.setIdade(45);
            System.out.println(maria.toString());
            //Sonia
            Pessoa sonia = new Pessoa();
            sonia.setNome("Sonia");
            sonia.setIdade(45);
            System.out.println(sonia.toString());

            //adicionando as pessoas a lista
            listaDePessoas.add(jose);
            listaDePessoas.add(maria);
            listaDePessoas.add(mario);
            listaDePessoas.add(sonia);
            //imprimindo o tamanho da lista
            System.out.println("o tamano da lista é:" + listaDePessoas.size());

    }
}