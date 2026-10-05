package phase2;

import javax.swing.*;
import java.awt.*;

/**
 * Programmer: Jiho Shin
 */
public class ShapeGUITester {
    private Shape[] shapeArray = new Shape[100];

    public ShapeGUITester() {
        JFrame guiFrame = new JFrame();
        CustomPanel myPanel = new CustomPanel();
        guiFrame.setTitle("Shape Polymorphism GUI");
        guiFrame.setSize(500, 500);
        guiFrame.setLocation(0, 0);
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.add(myPanel);
        guiFrame.setVisible(true);
    }

    public static void main(String[] args) {
        ShapeGUITester tester = new ShapeGUITester(); 
        tester.run();
    } 

    public void run() {
        int count = 0;
        double totalArea = 0.0;

        shapeArray[count++] = new Circle(100, 100, 130);
        shapeArray[count++] = new Circle(181, 265, 45);
        shapeArray[count++] = new Circle(209, 250, 7);
        shapeArray[count++] = new Circle(228, 250, 7);
        shapeArray[count++] = new Triangle(210, 200, 30.0, 50.0);
        shapeArray[count++] = new Rectangle(265, 150, 40.5, 60.5);
        shapeArray[count++] = new Rectangle(150, 150, 40.5, 60.5);
        shapeArray[count++] = new Rectangle(190, 180, 75, 3);
        shapeArray[count++] = new Rectangle(110, 170, 40.5, 10);
        shapeArray[count++] = new Rectangle(305, 170, 40.5, 10);
      

        for (int i = 0; i < count; i++) {
            System.out.println(shapeArray[i].toString());
        } // end for loop
       
        
        for (int i = 0; i < count; i++) {
            if (shapeArray[i] != null) {
                totalArea += shapeArray[i].getArea();
            }
        } 
        System.out.println("\nThe total area for " + count
                + " Shape objects is " + totalArea);
    } 

    public class CustomPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g); 
            
            for (Shape s : shapeArray) {
                if (s != null) {
                    s.drawShape(g);
                }
            }
        }
    }
}
