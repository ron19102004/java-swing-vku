package actionListener;

import view.componentsView.SidebarView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SidebarActionListener implements ActionListener {
    private SidebarView sidebarView;
    public SidebarActionListener(SidebarView sidebarView){
        this.sidebarView = sidebarView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Logout")){
            System.exit(1);
        }
    }
}
