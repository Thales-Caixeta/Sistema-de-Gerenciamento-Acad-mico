import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroDisciplinas extends JFrame {
    
    public CadastroDisciplinas() {
        setTitle("Cadastro de Disciplinas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());
        
        JPanel panelForm = new JPanel(new GridLayout(2, 2));
        
        panelForm.add(new JLabel("Nome da Disciplina:"));
        JTextField txtNomeDisciplina = new JTextField();
        panelForm.add(txtNomeDisciplina);
        
        panelForm.add(new JLabel("Código:"));
        JTextField txtCodigo = new JTextField();
        panelForm.add(txtCodigo);
        
        JButton btnSalvar = new JButton("Salvar");
        
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aqui você pode adicionar lógica para salvar a disciplina
                String nomeDisciplina = txtNomeDisciplina.getText();
                String codigo = txtCodigo.getText();
                
                JOptionPane.showMessageDialog(null, "Disciplina salva:\nNome: " + nomeDisciplina + "\nCódigo: " + codigo);
            }
        });
        
        add(panelForm, BorderLayout.CENTER);
        add(btnSalvar, BorderLayout.SOUTH);
        
        setVisible(true);
    }
}
