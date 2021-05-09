/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author siraphat
 */
@XmlRootElement
public class Result {
    
    
    private double area;
    private double line;

    public double getArea() {
        return area;
    }
   
    public double getLine() {
        return line;
    }
@XmlElement
   
    public void setArea(double area) {
        this.area = area;
    }
    public void setLine(double line) {
        this.line = line;
    }

    
}
