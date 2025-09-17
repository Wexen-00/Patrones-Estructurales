package Decorator;

public class Descargas extends DecoradorAbstracto{
    public Descargas(Plan plan) {
        super(plan);
    }
    @Override
    public String DescripcionPlan() {
        return plan.DescripcionPlan() + " + Descargas";
    }
    @Override
    public Double PrecioBasico() {
        return plan.PrecioBasico() + 700.0;
    }
}
