
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    
    public Menu() {
        setTitle("Menu Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Configurando layout e botões
        setLayout(new GridLayout(3, 1));
        
        JButton btnClientes = new JButton("Cadastro de Clientes");
        JButton btnDisciplinas = new JButton("Cadastro de Disciplinas");
        JButton btnMatriculas = new JButton("Matrículas");
        
        // Adicionando ação aos botões
        btnClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroClientes();
            }
        });
        
        btnDisciplinas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroDisciplinas();
            }
        });
        
        btnMatriculas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Matriculas();
            }
        });
        
        add(btnClientes);
        add(btnDisciplinas);
        add(btnMatriculas);
        
        setVisible(true);
    }
}
