package lk.ijse.CurrierService.model;

import lk.ijse.CurrierService.to.Supplier;
import lk.ijse.CurrierService.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AddFormModel {
    public static Object main(String[] args) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("INSERT INTO CurrierService VALUES(?, ?, ?, ?,?,?)",
                Supplier.getId(),
                Supplier.getName(),
                Supplier.getEmail(),
                Supplier.getAge(),
                Supplier.getDob(),
                Supplier.getSalary()
        );

    }

    public static Supplier search(String id) throws SQLException, ClassNotFoundException {
        ResultSet result = CrudUtil.execute("SELECT * FROM CurrierService WHERE id = ?", id);

        if(result.next()) {
            return new Supplier(
                    result.getInt(1),
                    result.getString(2),
                    result.getString(3),
                    result.getInt(4),
                    result.getString(5),
                    result.getDouble(6)
            );
        }
        return null;
    }
}
