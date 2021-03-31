package compulsory;

import javax.swing.*;
import java.awt.*;

public class ShapePanel extends JPanel{
    final MainFrame frame;
    JLabel deleteShapeLabel;
    JSpinner shapeField;
    JList availableShapes;
    public ShapePanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        deleteShapeLabel=new JLabel("Choose which shape you want to remove:");
        shapeField=new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        shapeField.setValue(0);
        String[] shapesToChooseFrom ={"Polygon","Circle"};
       availableShapes= new JList(shapesToChooseFrom);
       setLayout(new GridLayout(4,1));
        add(deleteShapeLabel);
        add(shapeField);
        add(new JLabel("Available Shapes"));
        add(availableShapes);
    }
}
