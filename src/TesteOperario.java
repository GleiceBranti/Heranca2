public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("Ana Costa", "Rua D, 101", "321654987", 103, 2500.0, 8.0, 20000.0, 5.0);
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Salário: " + operario.calcularSalario());
    }
}
