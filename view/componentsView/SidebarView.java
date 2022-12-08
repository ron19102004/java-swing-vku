package view.componentsView;

import actionListener.SidebarActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SidebarView extends JPanel {
    private ActionListener actionListener;
    private Font font;
    private JPanel jPanelSidebar;
    public static SidebarView getInstance(){
        return new SidebarView();
    }
    public SidebarView(){
        this.actionListener = new SidebarActionListener(this);
        this.jPanelSidebar = new JPanel();
        this.font = new Font("Cascadia", Font.BOLD, 20);
    }
    public JPanel init(){
        this.jPanelSidebar.setLayout(new BoxLayout(this.jPanelSidebar,BoxLayout.Y_AXIS));
        this.jPanelSidebar.setAlignmentY(Component.CENTER_ALIGNMENT);
        this.jPanelSidebar.setBackground(Color.GRAY);

        this.jPanelSidebar.add(this.back());
        this.jPanelSidebar.add(this.setting());
        this.jPanelSidebar.add(this.jSeparator());
        this.jPanelSidebar.add(this.logout());

        return this.jPanelSidebar;
    }
    private JSeparator jSeparator(){
        JSeparator jSeparator = new JSeparator();
        jSeparator.getOrientation();
        return jSeparator;
    }
    private JButton back(){
        ImageIcon backIcon = new ImageIcon("src/public/image/back-icon.png");
        JButton back = new JButton(backIcon);
        back.setFont(this.font);
        back.setActionCommand("Back");
        return back;
    }
    private JButton setting(){
        ImageIcon settingIcon = new ImageIcon("src/public/image/Settings-icon.png");
        JButton setting = new JButton(settingIcon);
        setting.setFont(this.font);
        setting.setActionCommand("Setting");
        return setting;
    }
    private JButton logout(){
        ImageIcon logoutIcon = new ImageIcon("src/public/image/Log-Out-icon.png");
        JButton logout = new JButton(logoutIcon);
        logout.setFont(this.font);
        logout.setActionCommand("Logout");
        logout.addActionListener(this.actionListener);
        return logout;
    }
}
