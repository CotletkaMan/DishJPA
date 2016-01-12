package server;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

/**
 * Created by cotletkaman on 12.01.16.
 */
@Repository
abstract public class Operation<T> {
    protected EntityManager manager;
    protected EntityTransaction transaction;


    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.manager = entityManager;
        this.transaction = entityManager.getTransaction();
    }

    abstract public T perform();
}
