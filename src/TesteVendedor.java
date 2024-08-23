public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Ricardo Martins", "Rua E, 202", "654321987", 104, 3500.0, 9.0, 15000.0, 6.0);
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Salário: " + vendedor.calcularSalario());
    }
}
