package view.componentsView;

import actionListener.MenuViewActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MenuView extends JFrame {
    private ActionListener actionListener;
    private Font fontMenu;
    private JMenuBar jMenuBar;
    private ContentView contentView;
    public static MenuView getInstance(ContentView contentView){
        return new MenuView(contentView);
    }
    public MenuView(ContentView contentView){
        this.contentView = contentView;
        this.fontMenu = new Font("Cascadia", Font.BOLD, 20);
        this.actionListener = new MenuViewActionListener(this);
    }
    public ContentView getContentView(){
        return this.contentView;
    }
    public JMenuBar init(){
        this.jMenuBar = new JMenuBar();
        this.jMenuBar.add(this.file());
        this.jMenuBar.add(this.edit());
        this.jMenuBar.add(this.view());
        this.jMenuBar.add(this.jSeparator());
        this.jMenuBar.add(this.refresh());

        return this.jMenuBar;
    }
    private JSeparator jSeparator(){
        JSeparator jSeparator = new JSeparator();
        jSeparator.getOrientation();
        return jSeparator;
    }
    private JMenu file(){
        JMenu file = new JMenu("File");
        file.setFont(this.fontMenu);

        JMenuItem importFile = new JMenuItem("Import File");
        importFile.setFont(this.fontMenu);

        JMenuItem exit = new JMenuItem("Exit");
        exit.setFont(this.fontMenu);
        exit.addActionListener(this.actionListener);

        file.add(importFile);
        file.add(jSeparator());
        file.add(exit);
        return file;
    }
    private JMenu edit(){
        JMenu edit =new JMenu("Edit");
        edit.setFont(this.fontMenu);

        JMenuItem rename = new JMenuItem("Rename");
        rename.setFont(this.fontMenu);
        rename.addActionListener(this.actionListener);

        edit.add(rename);
        return edit;
    }
    private JMenu view(){
        JMenu view = new JMenu("View");
        view.setFont(this.fontMenu);
        return view;
    }
    private JMenu refresh(){
        JMenu refresh = new JMenu("Refresh");
        refresh.setFont(this.fontMenu);
        return refresh;
    }
}
