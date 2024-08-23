public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Maria Oliveira", "Rua B, 456", "987654321", 101, 3000.0, 10.0);
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Salário: " + empregado.calcularSalario());
    }
}
