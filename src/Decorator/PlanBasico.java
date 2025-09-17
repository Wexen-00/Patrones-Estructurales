package Decorator;

public class PlanBasico implements Plan {
    @Override
    public String DescripcionPlan() {
        return "Plan Basico";
    }
    @Override
    public Double PrecioBasico() {
        return 1000.0;
    }

}
