package org.launchcode.lesson7;

public abstract class Shape implements Geometry, Comparable {

    @Override
    public int compareTo(Object o) {
        Double areaDiff = this.area() - ((Shape) o).area();
        return areaDiff.intValue();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + String.format("%.2f", this.area());
    }
}
