public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("João Silva", "Rua A, 123", "123456789", 5000.0, 1000.0);
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}
