package models;

import javax.swing.Icon;

public class ModelCard {

    String title;
    double values;
    int percent;
    Icon icon;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getValues() {
        return values;
    }

    public void setValues(double values) {
        this.values = values;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public ModelCard(String title, double values, int percent, Icon icon) {
        this.title = title;
        this.values = values;
        this.percent = percent;
        this.icon = icon;
    }

    public ModelCard() {
    }
    
    
}
