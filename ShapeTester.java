package phase1;

public class Project6 {
    // Create an array to hold 100 Shape objects
    private Shape[] shapeArray = new Shape[100];

    public static void main(String[] args) {
        Project6 project6 = new Project6();
        project6.run();
    } // end of main

    public void run() {
        int count = 0;
        double totalArea = 0.0;
        /********** Fill the array region begin ***********/
        shapeArray[count++] = new Circle();
        shapeArray[count++] = new Circle(5.0);
        shapeArray[count++] = new Circle(20, 20, 40.5);
        shapeArray[count++] = new Triangle();
        shapeArray[count++] = new Triangle(30.0, 50.0);
        shapeArray[count++] = new Triangle(70, 70, 20.3, 35.4);
        shapeArray[count++] = new Rectangle();
        shapeArray[count++] = new Rectangle(100, 50);
        shapeArray[count++] = new Rectangle(150, 150, 40.5, 60.5);
        /********** Fill the array region end **********/
        /*
         * The following for loop loops through all objects in
         * shapeArray, invoking the toString() method on each
         * Shape object. This causes those objects to "display"
         * themselves as text strings.
         */
        for (int i = 0; i < count; i++) {
            System.out.println(shapeArray[i].toString());
        } // end for loop
        /*
         * The following for loop loops through all objects
         * in shapeArray, invoking the getArea() method on each
         * Shape object and adding each object's area to totalArea.
         */
        for (int i = 0; i < count; i++) {
            if (shapeArray[i] != null) {
                totalArea += shapeArray[i].getArea();
            }
        } // end for loop
        System.out.println("\nThe total area for " + count
                + " Shape objects is " + totalArea);
    } // end of run() method
} // end of class Project6