public class PrimeiraClasse {

    public static void main(String args[]) {
        System.out.println("Olá Lisboa");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        String end = cliente.retornarNomeCliente();
        System.out.println(end);
        System.out.println(cliente.getValorTotal());
        // Fui elaborando junto ao professor e tirando dúvidas e aplicando elas, só
        // consigo aprender fazendo. O comentário está aqui.

    }
}
