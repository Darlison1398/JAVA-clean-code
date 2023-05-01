
package cleancode;

import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private String idade;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    public String exibir(){
        return "NOME: " + nome + "\nIDADE: " + idade;
    }
    
    public static void mostrar(){
        Pessoa p1 = new Pessoa();
        
        p1.setNome(JOptionPane.showInputDialog("Nome"));
        p1.setIdade(JOptionPane.showInputDialog("Idade"));
        
        System.out.println(p1.exibir());
    }
    
}
