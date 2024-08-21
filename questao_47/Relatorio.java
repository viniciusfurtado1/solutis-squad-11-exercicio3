package lista3.questao_47;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Relatorio {

    public static void imprimirRelatorio(List<Paciente> pacientes) {
        System.out.print(
                "\ni. Quantidade de Pacientes: " + obterQuantidadeDePacientes(pacientes)
                + "\nii. Media de idade dos homens: " + obterMediaDeIdadeDosHomens(pacientes)
                + "\niii. Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + obterQuantidadeDeMulheresComBaseEmAlturaPeso(pacientes)
                + "\niv. Quantidade de pessoas com idade entre 18 e 25: " + obterPacientesComBaseNaIdade(pacientes)
                + "\nv. Nome do paciente mais velho: " + obterNomeDoPacienteMaisVelho(pacientes)
                + "\nvi. O nome da mulher mais baixa: " + obterNomeMulherMaisBaixa(pacientes)
                + "\nvii. Quantidade de pacientes pelo sexo: " + obterQuantidadeDosSexos(pacientes)
                + "\n"
        );
    }

    public static boolean ehHomem(Paciente paciente) {
        return paciente != null && paciente.getSexo().equalsIgnoreCase("homem");
    }

    public static boolean ehMulher(Paciente paciente) {
        return paciente != null && paciente.getSexo().equalsIgnoreCase("mulher");
    }

    public static int obterQuantidadeDePacientes(List<Paciente> pacientes) {
        return pacientes.size();
    }

    public static String obterMediaDeIdadeDosHomens(List<Paciente> pacientes) {
        double mediaDeIdade = 0.0;
        int qtdPacientes = 0;

        for(Paciente paciente : pacientes) {
            if(ehHomem(paciente)) {
                mediaDeIdade += paciente.getIdade();
                qtdPacientes++;
            }
        }
        if(qtdPacientes == 0) return "Nenhum paciente encontrado.";

        mediaDeIdade = mediaDeIdade / qtdPacientes;
        return String.format("%.2f", mediaDeIdade);
    }

    public static int obterQuantidadeDeMulheresComBaseEmAlturaPeso(List<Paciente> pacientes) {
        int quantidade = 0;
        for(Paciente paciente : pacientes) {
            if(ehMulher(paciente)
                    && paciente.getAltura() >= 1.60 && paciente.getAltura() <= 1.70
                    && paciente.getPeso() >= 70)
                quantidade++;
        }

        return quantidade;
    }

    public static int obterPacientesComBaseNaIdade(List<Paciente> pacientes) {
        int quantidade = 0;
        for(Paciente paciente : pacientes) {
            if(paciente.getIdade() >= 18
                    && paciente.getIdade() <= 25)
                quantidade++;
        }

        return quantidade;
    }

    public static String obterNomeDoPacienteMaisVelho(List<Paciente> pacientes) {
        Paciente maisVelho = pacientes.stream()
                .max(Comparator.comparingInt(Paciente::getIdade))
                .orElse(null);

        if(maisVelho != null) return maisVelho.getNome();
        else return "Não encontrado.";
    }

    public static String obterNomeMulherMaisBaixa(List<Paciente> pacientes) {
        List<Paciente> mulheres = new ArrayList<>();
        for(Paciente paciente : pacientes) {
            if(ehMulher(paciente)) mulheres.add(paciente);
        }

        Paciente mulherMaisBaixa = mulheres.stream()
                .min(Comparator.comparingDouble(Paciente::getAltura))
                .orElse(null);

        if(mulherMaisBaixa != null) return mulherMaisBaixa.getNome();
        else return "Não encontrada.";
    }

    public static String obterQuantidadeDosSexos(List<Paciente> pacientes) {
        int homens = 0, mulheres = 0;
        for(Paciente paciente : pacientes) {
            if(ehHomem(paciente)) homens++;
            else mulheres++;
        }

        return String.format("Há %s homens e %s mulheres na lista de pacientes.", homens, mulheres);
    }
}
