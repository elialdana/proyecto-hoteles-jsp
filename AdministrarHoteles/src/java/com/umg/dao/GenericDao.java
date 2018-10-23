package com.umg.dao;

import com.umg.db.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class GenericDao {

    public boolean execute(String query) {

        boolean resultado = false;
        Connection c = null;

        try {
            ConnectionDB cdb = new ConnectionDB();
            c = cdb.getConnection();

            PreparedStatement ps = c.prepareStatement(query);
            if (ps.executeUpdate() > 0) {
                resultado = true;
            }

            ps.close();
        } catch (Exception e ) {
            e.printStackTrace();
        } finally {

            try {
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return resultado;
    }

}
