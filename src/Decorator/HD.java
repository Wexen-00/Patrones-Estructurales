package Decorator;

public class HD extends DecoradorAbstracto{
    public HD(Plan plan) {
        super(plan);
    }
    @Override
    public String DescripcionPlan() {
        return plan.DescripcionPlan() + " + HD";
    }
    @Override
    public Double PrecioBasico() {
        return plan.PrecioBasico() + 500.0;
    }
}
