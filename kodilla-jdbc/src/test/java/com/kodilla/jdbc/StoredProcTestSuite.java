package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateBestsellers() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=false";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);


        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);

        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=true";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(1, howMany);
    }
}
