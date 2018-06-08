package ua.lviv.iot.persistence.dao;

import ua.lviv.iot.Record;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Named
@Dependent
public class RecordDaoImpl extends AbstractDao<Record> implements RecordDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Record> getEntityClass() {
        return Record.class;
    }

    //@Resource
    //private UserTransaction userTransaction;

    @PostConstruct
    public void init() {
        System.out.println("ready");
    }

}
