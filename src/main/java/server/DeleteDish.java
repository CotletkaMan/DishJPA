package server;

import shared.Dish;

/**
 * Created by cotletkaman on 12.01.16.
 */
public class DeleteDish extends Operation<Boolean>{
    private Dish dish;
    public DeleteDish setDish(Dish dish){
        this.dish = dish;
        return this;
    }

    public Boolean perform(){
        transaction.begin();
        manager.remove(dish);
        transaction.commit();
        return true;
    }
}
