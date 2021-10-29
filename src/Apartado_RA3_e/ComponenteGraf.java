package Apartado_RA3_e;

public class ComponenteGraf {

    public double supCircunferencia(double r) {
        if (r >= 0) {
            return Math.PI * r * r;
        }
        return 0;
    }
}

