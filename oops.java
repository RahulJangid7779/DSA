// Main class
public class oops {
  public static void main(String[] args) {
      Pen p1 = new Pen(); // Creating an object of the Pen class
      
      p1.setcolor("blue"); // Setting color to "blue"
      System.out.println(p1.getcolor()); // Printing the color
      
      p1.settip(5); // Setting tip size to 5
      System.out.println(p1.gettip()); // Printing the tip size
  }
}

// Pen class
class Pen {
  String color; // Variable to store color
  int tip; // Variable to store tip size

  // Corrected getter method for color (No parameters)
  String getcolor() {
      return this.color;
  }

  // Corrected getter method for tip (No parameters)
  int gettip() {
      return this.tip;
  }

  // Setter method for color
  void setcolor(String color) {
      this.color = color;
  }

  // Setter method for tip size
  void settip(int tip) {
      this.tip = tip;
  }
}
