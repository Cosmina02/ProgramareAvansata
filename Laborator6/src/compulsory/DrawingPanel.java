package compulsory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class DrawingPanel extends JPanel {
    final MainFrame frame;
    final static int W = 800, H = 600;
    BufferedImage image; //the offscreen image
    Graphics2D graphics; //the "tools" needed to draw in the image
   List<Shape> shapes=new ArrayList<>();

    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        createOffscreenImage();
        init();

    }
    private void createOffscreenImage() {
        image = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE); //fill the image with white
        graphics.fillRect(0, 0, W, H);

    }
    private void init() {
        setPreferredSize(new Dimension(W, H)); //don’t use setSize. Why?
        setBorder(BorderFactory.createEtchedBorder()); //for fun
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                drawShape(e.getX(), e.getY()); frame.repaint();
            } //Can’t use lambdas, JavaFX does a better job in these cases
        });
    }

    private void drawShape(int x, int y) {
        int radius; //generate a random number
        radius = new Random().nextInt(40);
        int sides = (int) frame.configPanel.sidesField.getValue(); //get the value from UI (in ConfigPanel)
        Color color = (Color) frame.configPanel.colorCombo.getSelectedItem(); //create a transparent random Color.
        int delete=(int)frame.shapePanel.shapeField.getValue();
        if(frame.shapePanel.availableShapes.isSelectedIndex(0))
        {
            shapes.add(new RegularPolygon(x, y, radius, sides));
        }
        if(frame.shapePanel.availableShapes.isSelectedIndex(1)){
            shapes.add(new NodeShape(x,y,radius));
        }
        graphics.setColor(color);
        for (Shape shape:shapes) {
            graphics.fill(shape);
        }
        if(delete!=0){
            graphics.setColor(Color.WHITE);
            graphics.fill(shapes.get(delete));
            shapes.remove(delete);
            frame.shapePanel.shapeField.setValue(0);
        }

    }

    @Override
    public void update(Graphics g) {
    } //Why did I do that?

    @Override
    protected void paintComponent(Graphics g) {
            g.drawImage(image, 0, 0, this);
    }


}
