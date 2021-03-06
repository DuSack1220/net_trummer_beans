/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dijkstra;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author sebas
 */
public class Node implements Serializable {
    public static final int RADIUS = 20;
    
    private int x;
    private int y;
    private String desc;
    
    private ArrayList<Node> nb;
    
    private int hop;
    private Node predecessor;
    private boolean active;
    private Node[] path;
    
    private boolean selected;

    public Node(int x, int y, String desc) {
        setX(x);
        setY(y);
        setDesc(desc);
        nb = new ArrayList<Node>();
        setHop(Integer.MAX_VALUE);
        setActive(false);
        setSelected(false);
        setPath(null);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Node[] getPath() {
        return path;
    }
    
    public boolean isSelected() {
        return selected;
    }

    public String getDesc() {
        return desc;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPath(Node path1, Node path2) {
        this.path = new Node[]{path1, path2};
    }
    
    public void setPath(Node[] path) {
        this.path = path;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public void setHop(int weight) {
        this.hop = weight;
    }

    public void setPredecessor(Node predecessor) {
        this.predecessor = predecessor;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getHop() {
        return hop;
    }

    public Node getPredecessor() {
        return predecessor;
    }

    public boolean isActive() {
        return active;
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x-RADIUS, y-RADIUS, RADIUS*2, RADIUS*2);
        g.setColor(Color.BLACK);
        if (getPath() != null)
            g.setColor(Color.GREEN);
        if (isSelected())
            g.setColor(Color.RED);
        g.drawOval(x-RADIUS, y-RADIUS, RADIUS*2, RADIUS*2);
        g.setColor(Color.BLACK);
        int width = g.getFontMetrics().stringWidth(getDesc());
        int height = g.getFontMetrics().getAscent() / 2;
        g.drawString(getDesc(), getX() - width/2, (int) (getY() + (int)height / 1.5));
    }
    
    public void paintLines (Graphics g) {
        // nb.forEach(n -> g.drawLine(x, y, n.getX(), n.getY()));
        for (Node n : nb) {
            g.setColor(Color.BLACK);
            if (getPath() != null && ((getPath()[0] != null && n == getPath()[0]) || (getPath()[1] != null && n == getPath()[1])))
                g.setColor(Color.GREEN);
            g.drawLine(x, y, n.getX(), n.getY());
        }
    }
    
    public void addNb (Node n) {
        nb.add(n);
    }
    
    public void move (int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
    
    public boolean isInNode(int x, int y) {
        return (Math.hypot(this.x - x, this.y - y) < RADIUS);
    }
    
    public boolean isNearNode(int x, int y) {
        return (Math.hypot(this.x - x, this.y - y) < RADIUS * 2.86);
    }
    
    public Node findNextSuccessor() {
        Node succer = nb.stream()
                .filter(n -> (!n.isActive() || (n.getHop() > getHop())))
                .findFirst()
                .orElse(null);
        
        if (succer == null)
            setActive(false);
        
        return succer;
    }
    
    public boolean getSuccessorsDone() {
        boolean any = false;
        for (Node n : nb) {
            if (n.getHop() > getHop()) {
                n.setActive(true);
                n.setPredecessor(this);
                n.setHop(getHop() + 1);
                any = true;
            }
        }
        setActive(false);
        return any;
    }
}
