package view;

import view.componentsView.ContentView;
import view.componentsView.MenuView;
import view.componentsView.SidebarView;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    private ContentView contentView;
    public MainView(){
        this.contentView = new ContentView();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,700);
        this.setTitle("Learn GUI / V-K University");
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        JPanel jPanelContent = this.contentView.init();
        JMenuBar jMenuBar = MenuView.getInstance(this.contentView).init();
        JPanel jSidebarView = SidebarView.getInstance().init();

        this.add(jMenuBar,BorderLayout.NORTH);
        this.add(jSidebarView,BorderLayout.WEST);
        this.add(jPanelContent,BorderLayout.CENTER);
    }
}
