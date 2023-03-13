
package MVC.models;

import java.awt.Color;

public class ModelNoticeBoard {
    Color titleColor;
    String title;
    String time;
    String desc;

    public Color getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(Color titleColor) {
        this.titleColor = titleColor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ModelNoticeBoard(Color titleColor, String title, String time, String desc) {
        this.titleColor = titleColor;
        this.title = title;
        this.time = time;
        this.desc = desc;
    }
    
    
}
