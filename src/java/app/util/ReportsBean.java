/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.util;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author chdelmas
 */
@ManagedBean(name = "reportsBean")
@SessionScoped
 
public class ReportsBean extends AbstractReportBean {
// 
//    private final String COMPILE_FILE_NAME = "productlist";
// 
//    @Override
//    protected String getCompileFileName() {
//        return COMPILE_FILE_NAME;
//    }
// 
//    @Override
//    protected Map<String, Object> getReportParameters() {
//        Map<String, Object> reportParameters = new HashMap<String, Object>();
// 
//        reportParameters.put("rtitle", "Hello JasperReports");
// 
//        return reportParameters;
//    }
// 
//    public String execute() {
//        try {
//            super.prepareReport();
//        } catch (Exception e) {
//            // make your own exception handling
//            e.printStackTrace();
//        }
// 
//        return null;
//    }
//}
//Database.java class for handling database connection
//
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12
//13
//14
//15
//16
//17
//18
//19
//20
//21
//22
//23
//24
//25
//26
//package dao;
// 
//import java.sql.Connection;
//import java.sql.DriverManager;
// 
//public class Database {
// 
//    public static Connection getConnection() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dbname",
//                    "root", "dbpass");
//            return con;
//        } catch (Exception ex) {
//            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
//            return null;
//        }
//    }
// 
//    public static void close(Connection con) {
//        try {
//            con.close();
//        } catch (Exception ex) {
//        }
//    }
}
