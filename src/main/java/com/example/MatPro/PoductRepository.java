package com.example.MatPro;

import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class PoductRepository {

    String connstr = "jdbc:sqlserver://localhost;databasename=MatProject;user=dbadmin;password=123123";


    public List<Product> getAllProducts() {
        List<Product> listOfProducts = new ArrayList<>();
        String name = "", category = "";
        float price=0;
        float purchasePrice = 0;

        String sql = "SELECT name, category, price, purchasePrice\n" +
                "FROM Product\n" ;

        try (Connection conn = DriverManager.getConnection(connstr)) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                name = rs.getString(1);
                category = rs.getString(2);
                price = rs.getFloat(3);
                purchasePrice = rs.getFloat(4);
                listOfProducts.add(new Product(name, category, price, purchasePrice));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listOfProducts;
    }




}
