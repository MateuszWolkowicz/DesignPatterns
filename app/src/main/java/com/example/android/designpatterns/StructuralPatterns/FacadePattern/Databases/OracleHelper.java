package com.example.android.designpatterns.StructuralPatterns.FacadePattern.Databases;

/**
 * Created by MateuszW on 2018-04-18.
 */
import java.sql.Connection;
public class OracleHelper {

    public static Connection getOracleDBConnection(){
        //get Oracle DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }

    public void generateOracleHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }
}
