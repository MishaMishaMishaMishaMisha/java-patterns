public class Director {

    Pizza makePizza() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        DoughBuilder doughBuilder = new DoughBuilder();
        ToppingBuilder toppingBuilder = new ToppingBuilder();

        return  pizzaBuilder
                        .setName("My Pizza")
                        .setDough(doughBuilder
                                .setDoughType(Dough.DoughType.THICK)
                                .setFlour(Dough.Flour.RYE)
                                .setCost(15)
                                .build())
                        .addTopping(toppingBuilder.setToppingType(Topping.ToppingType.CHEESE)
                                .setToppingName("mazarella")
                                .setCost(5)
                                .build())
                        .addTopping(toppingBuilder.setToppingType(Topping.ToppingType.SAUSAGES)
                                .setToppingName("hunters")
                                .setCost(8)
                                .build())
                        .build();
    }

}
