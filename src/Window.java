import javax.swing.*;

public class Window extends JFrame {

    public Window(){
        this.setVisible(true);  // gör den synlig
        this.setTitle("TE21C Clicker"); // Sätter en text på rutan
        this.setBounds(100,150, 500,500); // Sätter position och storlek
        this.setResizable(false); // gör att vi inte får ändra storleken
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        addSquare();

    }

    private void addSquare() {
        Square ruta= new Square();
        this.add(ruta);
    }


}
