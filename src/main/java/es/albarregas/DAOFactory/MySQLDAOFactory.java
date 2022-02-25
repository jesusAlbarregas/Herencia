package es.albarregas.DAOFactory;

import es.albarregas.DAOs.GenericoDAO;
import es.albarregas.DAOs.IGenericoDAO;

public class MySQLDAOFactory extends DAOFactory {

    @Override
    public IGenericoDAO getGenericoDAO() {
        return new GenericoDAO();
    }

//    @Override
//    public IGenericoDAO getGenericoDAO() {
//        return new GenericoDAO();
//    }
}
