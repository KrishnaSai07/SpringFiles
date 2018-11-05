package com.verizon.dao;

public interface IQueryMapper {

    public static final String INS_EMP_QRY=
            "INSERT INTO employee VALUES (?,?,?,?,?)";
    public static final String UPDATE_EMP_QRY=
            "UPDATE employee SET empName=?, basic=?, hra=?, dept=? WHERE empId=?";
    public static final String DEL_EMP_QRY=
            "DELETE FROM employee WHERE empId=?";
    public static final String GET_EMPLOYEE_QRY=
            "SELECT * FROM employee WHERE empId=?";
    public static final String GET_ALL_EMPLOYEE_QRY=
            "SELECT *FROM employee";

    
}

