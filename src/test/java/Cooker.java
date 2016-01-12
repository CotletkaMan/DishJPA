import shared.Dish;
import shared.Ingredients;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by cotletkaman on 12.01.16.
 */
public class Cooker {
    public static Dish createBasicDish(){
        Dish dish = new Dish();
        dish.setName("Tasty");
        dish.setImage(new byte[2]);
        ArrayList<String> cook = new ArrayList<String>();
        cook.add("Begin cook");
        dish.setRecipe(cook);
        HashMap<Ingredients , Integer> ingredientsIntegerHashMap = new HashMap<Ingredients, Integer>();
        ingredientsIntegerHashMap.put(Ingredients.Carrot , 1);
        dish.setListIngredients(ingredientsIntegerHashMap);
        return dish;
    }
}
