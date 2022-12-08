package actionListener;

import view.componentsView.MenuView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuViewActionListener implements ActionListener {
    private MenuView menuView;
    public MenuViewActionListener(MenuView menuView){
        this.menuView = menuView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Exit")){
            System.exit(1);
        } else if(src.equals("Rename")){
            CardLayout cardLayout = (CardLayout) this.menuView.getContentView().getJPanelContent().getLayout();
            cardLayout.show(this.menuView.getContentView().getJPanelContent(),"editContent");
        }
    }
}
