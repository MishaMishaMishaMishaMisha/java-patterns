public class DoughBuilder {

    private Dough.DoughType doughType = Dough.DoughType.STANDARD;
    private Dough.Flour flour = Dough.Flour.WHEAT;
    private int cost = 20;

    public DoughBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }
    public DoughBuilder setDoughType(Dough.DoughType doughType) {
        this.doughType = doughType;
        return this;
    }
    public DoughBuilder setFlour(Dough.Flour flour) {
        this.flour = flour;
        return this;
    }

    Dough build() {
        return new Dough(doughType, flour, cost);
    }

}
