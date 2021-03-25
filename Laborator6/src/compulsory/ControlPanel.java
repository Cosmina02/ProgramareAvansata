package compulsory;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import java.io.IOException;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    JButton loadBtn=new JButton("Load");
    JButton resetBtn=new JButton("Reset");
    JButton exitBtn=new JButton("Exit");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //change the default layout manager (just for fun)
        setLayout(new GridLayout(1, 4));
        saveBtn.setBounds(10,100,20,20);
        loadBtn.setBounds(10,100,20,20);
        resetBtn.setBounds(10,100,20,20);
        exitBtn.setBounds(10,100,20,20);

        //configure listeners for all buttons
        saveBtn.addActionListener(this::save);
        loadBtn.addActionListener(this::load);
        resetBtn.addActionListener(this::reset);
        exitBtn.addActionListener(this::exit);
        add(saveBtn);
        add(loadBtn);
        add(resetBtn);
        add(exitBtn);
    }
    private void save(ActionEvent e) {
        try {
            ImageIO.write(frame.canvas.image, "PNG", new File("C:\\Users\\cosmi\\OneDrive\\Desktop\\test.png"));
        } catch (IOException ex) { System.err.println( ); }
    }

    private void load(ActionEvent e) {

       frame.add(new JLabel(new ImageIcon("C:\\Users\\cosmi\\OneDrive\\Desktop\\Layer.jpg")),1);

    }


    private void reset(ActionEvent e){

        System.out.println("reset btn");
        frame.dispose();
        new MainFrame().setVisible(true);

    }

    private void exit(ActionEvent e){
        frame.dispose();
    }



}
