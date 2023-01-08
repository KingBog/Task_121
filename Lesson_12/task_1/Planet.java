package Lesson_12.task_1;

public class Planet implements Comparable<Planet> {
    private String namePlanet;
    private double diameter;

    public Planet(String namePlanet, double diameter) {
        this.namePlanet = namePlanet;
        this.diameter = diameter;
    }

    @Override
    public int compareTo(Planet o) {
        return (int) (getDiameter()-o.getDiameter());
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    public void setNamePlanet(String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "namePlanet='" + namePlanet + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
