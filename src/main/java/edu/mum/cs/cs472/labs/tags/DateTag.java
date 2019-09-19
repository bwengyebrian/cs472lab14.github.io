package edu.mum.cs.cs472.labs.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTag extends SimpleTagSupport {
    String color;
    String fontSize;

    // render custom tag
    public void doTag() throws JspException, IOException {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));
        JspWriter out = getJspContext().getOut();
        if (color != null && fontSize!=null ) {
            out.write("<div style='color:"+color+";font-size:" +fontSize+ "'>"+"Current Date: " + ft.format(dNow)+"</div>");
        }
        else {
            if (color != null && fontSize == null) {
                out.write("<div style='color:" + color  + "'>" + "Current Date: " + ft.format(dNow) + "</div>");
            } else {
                if (color == null && fontSize != null) {
                    out.write("<div style='font-size:" + fontSize + "'>" + "Current Date: " + ft.format(dNow) + "</div>");
                } else {
                    out.write(String.format("<span>%s</span>", "Current Date: " + ft.format(dNow)));
                }
            }
        }
    }

    // Need a setter for each attribute of custom tag
    public void setColor(String color) {
        this.color = color;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }
}