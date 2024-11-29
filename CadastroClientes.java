import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroClientes extends JFrame {
    
    public CadastroClientes() {
        setTitle("Cadastro de Clientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Layout da tela de cadastro
        setLayout(new BorderLayout());
        
        JPanel panelForm = new JPanel(new GridLayout(3, 2));
        
        // Campos de entrada para o cliente
        panelForm.add(new JLabel("Nome:"));
        JTextField txtNome = new JTextField();
        panelForm.add(txtNome);
        
        panelForm.add(new JLabel("E-mail:"));
        JTextField txtEmail = new JTextField();
        panelForm.add(txtEmail);
        
        panelForm.add(new JLabel("Telefone:"));
        JTextField txtTelefone = new JTextField();
        panelForm.add(txtTelefone);
        
        JButton btnSalvar = new JButton("Salvar");
        
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aqui você pode adicionar lógica para salvar o cliente
                String nome = txtNome.getText();
                String email = txtEmail.getText();
                String telefone = txtTelefone.getText();
                
                JOptionPane.showMessageDialog(null, "Cliente salvo:\nNome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone);
            }
        });
        
        add(panelForm, BorderLayout.CENTER);
        add(btnSalvar, BorderLayout.SOUTH);
        
        setVisible(true);
    }
}
