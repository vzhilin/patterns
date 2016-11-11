package ru.sberbank.gof.creational.constuctorvsbuilder;

public class Application {
    private void telescoping() {
        /*
         * Typically this constructor invocation will require many parameters that you don’t
         * want to set, but you’re forced to pass a value for them anyway. In this case, we
         * passed a value of 0 for fat. With “only” six parameters this may not seem so bad,
         * but it quickly gets out of hand as the number of parameters increases.
         */
        NutritionFactsTelescoping cocaCola = new NutritionFactsTelescoping(240, 8, 100, 0, 35, 27);
    }

    private void javaBean() {
        NutritionFactsJavaBean cocaCola = new NutritionFactsJavaBean();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }

    private void builderPattern() {
        /*
         * The build method can check invariants. It is critical that they be checked after
         * copying the parameters from the builder to the object, and that they be checked on
         * the object fields rather than the builder fields. If any invariants are violated,
         * the build method should throw an IllegalStateException. The
         * exception’s detail method should indicate which invariant is violated.
         */
        NutritionFactsBuilderPattern cocaCola = new NutritionFactsBuilderPattern.Builder(240, 8).
                calories(100).sodium(35).carbohydrate(27).build();
    }

    public static void main(String[] args) {


    }
}
