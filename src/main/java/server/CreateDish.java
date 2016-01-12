package server;

import shared.Dish;

/**
 * Created by cotletkaman on 12.01.16.
 */
public class CreateDish extends Operation<Boolean>{
    private Dish dish;

    public CreateDish setDish(Dish dish){
        this.dish = dish;
        return this;
    }

    public Boolean perform(){
        transaction.begin();
        manager.persist(dish);
        transaction.commit();
        return true;
    }

}
