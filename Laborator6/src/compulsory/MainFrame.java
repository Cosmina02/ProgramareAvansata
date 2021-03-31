package compulsory;

import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;
    ShapePanel shapePanel;

    public MainFrame() {
        super("My Drawing Application");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configPanel=new ConfigPanel(this);
        controlPanel=new ControlPanel(this);
        shapePanel=new ShapePanel(this);
        //create the components
        canvas = new DrawingPanel(this);
        setLayout(new BorderLayout());
        // arrange the components in the container (frame)
        // JFrame uses a BorderLayout by default
        add(controlPanel,BorderLayout.SOUTH);
        add(configPanel,BorderLayout.NORTH);
        add(canvas,BorderLayout.CENTER); //this is BorderLayout.CENTER
        add(shapePanel,BorderLayout.EAST);
        //invoke the layout manager
        pack();
    }

}
