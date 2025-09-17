package Decorator;

abstract class DecoradorAbstracto implements Plan{
    protected Plan plan;
    public DecoradorAbstracto (Plan plan){
        this.plan = plan;
    }
    @Override
    public String DescripcionPlan(){
        return plan.DescripcionPlan();
    }
    @Override
    public Double PrecioBasico(){
        return plan.PrecioBasico();
    }
}
