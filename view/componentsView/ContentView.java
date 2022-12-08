package view.componentsView;

import javax.swing.*;
import java.awt.*;

public class ContentView extends JPanel {
    private JPanel jPanelContent;
    public ContentView(){
        this.jPanelContent = new JPanel(new CardLayout());
    }
    public JPanel getJPanelContent(){
        return this.jPanelContent;
    }
    public JPanel init(){
        this.jPanelContent.add(this.mainContent(),"mainContent");
        this.jPanelContent.add(this.editContent(),"editContent");

        return this.jPanelContent;
    }
    public JPanel mainContent() {
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLUE);
        return jPanel;
    }
    public JPanel editContent(){
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.RED);
        return jPanel;
    }
}
