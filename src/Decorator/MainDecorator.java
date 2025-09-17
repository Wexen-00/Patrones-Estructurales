package Decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Plan plan = new PlanBasico();
        System.out.println(plan.DescripcionPlan() + " cuesta $" + plan.PrecioBasico());

        plan = new HD(plan);
        System.out.println(plan.DescripcionPlan() + " cuesta $" + plan.PrecioBasico());

        plan = new UltraHD(plan);
        System.out.println(plan.DescripcionPlan() + " cuesta $" + plan.PrecioBasico());

        plan = new Descargas(plan);
        System.out.println(plan.DescripcionPlan() + " cuesta $" + plan.PrecioBasico());

    }
}
