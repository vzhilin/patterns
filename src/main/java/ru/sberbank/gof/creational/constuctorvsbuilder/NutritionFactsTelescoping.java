package ru.sberbank.gof.creational.constuctorvsbuilder;

/**
 * Traditionally, programmers have used the telescoping constructor pattern, in
 * which you provide a constructor with only the required parameters, another with a
 * single optional parameter, a third with two optional parameters, and so on, culminating
 * in a constructor with all the optional parameters.
 * The telescoping constructor pattern works, but it is hard to write
 * client code when there are many parameters, and harder still to read it. The
 * reader is left wondering what all those values mean and must carefully count
 * parameters to find out. Long sequences of identically typed parameters can cause
 * subtle bugs.
 */
public class NutritionFactsTelescoping {
    private final int servingSize; // (mL) required
    private final int servings; // (per container) required
    private final int calories; // optional
    private final int fat; // (g) optional
    private final int sodium; // (mg) optional
    private final int carbohydrate; // (g) optional

    public NutritionFactsTelescoping(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFactsTelescoping(int servingSize, int servings,
                                     int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFactsTelescoping(int servingSize, int servings,
                                     int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFactsTelescoping(int servingSize, int servings,
                                     int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFactsTelescoping(int servingSize, int servings,
                                     int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
