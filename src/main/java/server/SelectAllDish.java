package server;

import shared.Dish;

import java.util.List;

/**
 * Created by cotletkaman on 12.01.16.
 */
public class SelectAllDish extends Operation<List<Dish>> {
    public List<Dish> perform(){
        List<Dish> dishes = manager.createQuery("SELECT d FROM Dish d").getResultList();
        manager.close();
        return dishes;
    }
}
