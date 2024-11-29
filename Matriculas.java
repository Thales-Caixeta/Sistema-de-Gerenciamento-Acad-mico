import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Matriculas extends JFrame {
    
    public Matriculas() {
        setTitle("Matrículas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());
        
        JPanel panelForm = new JPanel(new GridLayout(2, 2));
        
        panelForm.add(new JLabel("Cliente:"));
        JTextField txtCliente = new JTextField();
        panelForm.add(txtCliente);
        
        panelForm.add(new JLabel("Disciplina:"));
        JTextField txtDisciplina = new JTextField();
        panelForm.add(txtDisciplina);
        
        JButton btnMatricular = new JButton("Matricular");
        
        btnMatricular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aqui você pode adicionar lógica para salvar a matrícula
                String cliente = txtCliente.getText();
                String disciplina = txtDisciplina.getText();
                
                JOptionPane.showMessageDialog(null, "Matrícula realizada:\nCliente: " + cliente + "\nDisciplina: " + disciplina);
            }
        });
        
        add(panelForm, BorderLayout.CENTER);
        add(btnMatricular, BorderLayout.SOUTH);
        
        setVisible(true);
    }
}
