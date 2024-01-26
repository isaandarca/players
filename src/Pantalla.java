import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla extends JFrame {


    private JLabel Uno;
    private JTextField Dni;
    private JLabel Tres;
    private JTextField Edad;
    private JLabel Cinco;
    private JTextField Disciplina;
    private JButton boton;


    public Pantalla() {
        setLayout(new FlowLayout());
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Uno = new JLabel("Dni");
        Dni = new JTextField(10);
        Tres = new JLabel("Edad");
        Edad = new JTextField(10);
        Cinco = new JLabel("Disciplina");
        Disciplina = new JTextField(10);
        boton = new JButton("Añadir Entrenador");
        add(Uno);
        add(Dni);
        add(Tres);
        add(Edad);
        add(Cinco);
        add(Disciplina);
        add(boton);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dni = Dni.getText();
                String edad = Edad.getText();
                String disciplina = Disciplina.getText();
                JOptionPane.showMessageDialog(null, "El dni es "+dni +" "+"la edad es "+edad +" "+"la disciplina es "+""+disciplina);
            }
        });


    }



}
