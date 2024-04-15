package br.edu.up.models;

public class Ponto {

 private Double x;
 private Double y;


public Ponto(Double x, Double y) {
    this.x = x;
    this.y = y;
}

public Ponto() {
    this.x = 0.0;
    this.y = 0.0;
}

public Double getX() {
    return x;
}
public void setX(Double x) {
    this.x = x;
}
public Double getY() {
    return y;
}
public void setY(Double y) {
    this.y = y;
}

 

}
