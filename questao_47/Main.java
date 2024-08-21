package lista3.questao_47;

import java.util.*;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();
        String nome = "";

        while (true) {
            System.out.print("Informe o nome do paciente: ");
            nome = scanner.next();

            if(nome.equalsIgnoreCase("fim")) break;
            pacientes.add(registrarPaciente(nome));
            System.out.println();
        }

        for (Paciente p : pacientes) System.out.println(p);
        Relatorio.imprimirRelatorio(pacientes);

        scanner.close();
    }

    public static Paciente registrarPaciente(String nome) {
        Paciente paciente = new Paciente();
        paciente.setNome(nome);

        System.out.print("Informe o sexo: ");
        paciente.setSexo(scanner.next());

        System.out.print("Informe o peso: ");
        paciente.setPeso(scanner.nextDouble());

        System.out.print("Informe a idade: ");
        paciente.setIdade(scanner.nextInt());

        System.out.print("Informe a altura: ");
        paciente.setAltura(scanner.nextDouble());

        return paciente;
    }
}
