package Decorator;

public class UltraHD extends DecoradorAbstracto{
    public UltraHD(Plan plan) {
        super(plan);
    }
    @Override
    public String DescripcionPlan() {
        return plan.DescripcionPlan() + " + UltraHD";
    }
    @Override
    public Double PrecioBasico() {
        return plan.PrecioBasico() + 1000.0;
    }
}
