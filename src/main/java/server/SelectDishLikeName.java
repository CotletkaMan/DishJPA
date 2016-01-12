package server;

import shared.Dish;

/**
 * Created by cotletkaman on 12.01.16.
 */
public class SelectDishLikeName extends Operation<Dish> {
    private String name;
    public SelectDishLikeName setName(String name){
        this.name = name;
        return this;
    }

    public Dish perform(){
        Dish dish = manager.createQuery("SELECT d FROM Dish d WHERE Name Like %" + name + "%" , Dish.class).getSingleResult();
        manager.close();
        return dish;
    }
}
