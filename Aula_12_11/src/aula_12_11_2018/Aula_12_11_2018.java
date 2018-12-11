/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_12_11_2018;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ice
 */
public class Aula_12_11_2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame janela = new JFrame("Sera que o Igor vai dormir?");
        janela.setSize(1000, 900);
        
        JLabel resposta = new JLabel("Não");
        JButton botao1 = new JButton("botao1");
        JButton botao2 = new JButton("botao2");
        JButton botao3 = new JButton("botao3");
        JButton botao4 = new JButton("botao4");
        JButton botao5 = new JButton("botao5");
        JPanel painel = new JPanel();
        
        painel.setLayout(new BorderLayout());
        
        botao1.addActionListener(new ActionListener(){
            Object[] opcao = {"NAO", "Com certeza nao"};
            //JOptionPane.showOptionDialog(janela, "Não, porque blabla", "Informação",
            //        JOptionPane.YES_NO_OPTION, JOptionPane.QUENTION_MESSAGE,
            //        null,opcao, opcao[1]);
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Não, porque blavla", "Informação", 0);
                
            }
            
        });
            
        
        janela.setLocationRelativeTo(null);
        janela.getContentPane().add(painel);
        painel.add(botao1, BorderLayout.NORTH);
        painel.add(botao2, BorderLayout.SOUTH);
        painel.add(botao3, BorderLayout.EAST);
        painel.add(botao4, BorderLayout.WEST);
        painel.add(botao5, BorderLayout.CENTER);
        
        janela.pack();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
