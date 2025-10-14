public class Main{

    public static void main(String [] args){

        Pessoa pessoa01 = new Pessoa();

        pessoa01.setNome("Henry");
        System.out.println(pessoa01.getNome());

        pessoa01.setIdade(23);
        System.out.println(pessoa01.getIdade());

        pessoa01.setCpf("32145678");
        System.out.println(pessoa01.getCpf());

    }
}
