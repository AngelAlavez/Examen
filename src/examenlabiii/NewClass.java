/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlabiii;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Alumno
 */
public class NewClass extends JFrame implements ActionListener{
    
    JLabel titulo = new JLabel("Convertidor");
    JTextArea cuanto = new JTextArea();
    JButton cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, puntito, convertir, limpiar, boton;
    int elegido;
    
    public void todo() {
        setTitle("Examen Laboratorio");
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        titulo.setBounds(50, 50, 200, 100);
        add(titulo);
        
        cuanto.setBounds(50, 200, 100, 50);
        cuanto.setEnabled(false);
        add(cuanto);

        uno = new JButton("1");
        uno.setBounds(50, 300, 100, 50);
        uno.addActionListener(this);
        add(uno);
        
        dos = new JButton("2");
        dos.setBounds(200, 300, 100, 50);
        dos.addActionListener(this);
        add(dos);
        
        tres = new JButton("3");
        tres.setBounds(350, 300, 100, 50);
        tres.addActionListener(this);
        add(tres);
        
        cuatro = new JButton("4");
        cuatro.setBounds(50, 400, 100, 50);
        cuatro.addActionListener(this);
        add(cuatro);
        
        cinco = new JButton("5");
        cinco.setBounds(200, 400, 100, 50);
        cinco.addActionListener(this);
        add(cinco);
        
        seis = new JButton("6");
        seis.setBounds(350, 400, 100, 50);
        seis.addActionListener(this);
        add(seis);
        
        siete = new JButton("7");
        siete.setBounds(50, 500, 100, 50);
        siete.addActionListener(this);
        add(siete);
        
        ocho = new JButton("8");
        ocho.setBounds(200, 500, 100, 50);
        ocho.addActionListener(this);
        add(ocho);
        
        nueve = new JButton("9");
        nueve.setBounds(350, 500, 100, 50);
        nueve.addActionListener(this);
        add(nueve);
        
        cero = new JButton("0");
        cero.setBounds(50, 600, 100, 50);
        cero.addActionListener(this);
        add(cero);
        
        puntito =  new JButton(".");
        puntito.setBounds(200, 600, 100, 50);
        puntito.addActionListener(this);
        add(puntito);
        
        convertir = new JButton("Convertir");
        convertir.setBounds(50, 700, 100, 50);
        convertir.addActionListener(this);
        add(convertir);
        
        limpiar = new JButton("Limpiar");
        limpiar.setBounds(250, 700, 100, 50);
        limpiar.addActionListener(this);
        add(limpiar);
        
        boton = new JButton("");
        boton.setBounds(0, 0, 1, 1);
        add(boton);
        boton.setVisible(false);
        
        
        
        setVisible(true);
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton [] todos = {cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, puntito, convertir, limpiar};
        for(int i = 0; i<todos.length; i++){
            if(e.getSource().equals(todos[i])){
                elegido = i;
            }
        }
        switch(elegido){
            case 0:
                cuanto.setText(cuanto.getText()+"0");
                break;
            case 1:
                cuanto.setText(cuanto.getText()+"1");
                break;
            case 2:
                cuanto.setText(cuanto.getText()+"2");
                break;
            case 3:
                cuanto.setText(cuanto.getText()+"3");
                break;
            case 4: 
                cuanto.setText(cuanto.getText()+"4");
                break;
            case 5:
                cuanto.setText(cuanto.getText()+"5");
                break;
            case 6:
                cuanto.setText(cuanto.getText()+"6");
                break;
            case 7:
                cuanto.setText(cuanto.getText()+"7");
                break;
            case 8:
                cuanto.setText(cuanto.getText()+"8");
                break;
            case 9:
                cuanto.setText(cuanto.getText()+"9");
                break;
            case 10:
                cuanto.setText(cuanto.getText()+".");
                break;
            case 11: 
                float number = Float.parseFloat(cuanto.getText());
                float resultado = number/17;
                cuanto.setText(String.valueOf(resultado));
                break;
            case 12:
                cuanto.setText("");
                break;
            default:
                break;
                
        }
    }
    
    
}
