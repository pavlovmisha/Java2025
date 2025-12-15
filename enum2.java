enum Planet {
    MERCURY(3.3011e23, 2.4397e6),
    VENUS(4.8675e24, 6.0518e6),
    EARTH(5.97237e24, 6.371e6),
    MARS(6.4171e23, 3.3895e6);

    private final double weight;     
    private final double radius;    
    
    Planet(double weight, double radius) {
        this.weight = weight;
        this.radius = radius;
    }

    public double gravity() {
        final double G = 6.67430e-11; 
        return G * weight / (radius * radius);
    }

    public double getWeight() {
        return weight;
    }

    public double getRadius() {
        return radius;
    }
}

public class Main {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf(
                "%s: масса = %.2e кг, радиус = %.2f м, гравитация = %.2f м/с^2%n",
                planet, planet.getWeight(), planet.getRadius(), planet.gravity());
        }
    }
}