public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Carlos Lima", "Rua C, 789", "456123789", 102, 4000.0, 12.0, 500.0);
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Salário: " + administrador.calcularSalario());
    }
}
