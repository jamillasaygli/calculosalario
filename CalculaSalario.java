import javax.swing.JOptionPane;

class NovoSalario{
    public static void main(String[] args) {
        // Declaração das variáveis
        float salarioBruto,
                desconto,
                salarioLiquido;

        // Janela de entrada do salario bruto
        salarioBruto = Float.parseFloat(
                JOptionPane.showInputDialog("Salario Bruto (R$)"));

        // Janela de entrada do desconto
        desconto = Float.parseFloat(
                JOptionPane.showInputDialog("Desconto (R$)"));

        // Calculo do novo salário
            salarioLiquido = salarioBruto - desconto;

        // Exibição do novo salário
        JOptionPane.showMessageDialog(null,
                "Salário bruto = R$ " +salarioBruto +
                        "\nDesconto= R$ " + desconto +
                        "\nNovo Salario = R$ " + salarioLiquido);
    }
}


