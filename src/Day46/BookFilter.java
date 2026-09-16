package Day46;

import java.sql.SQLException;
import javax.sql.RowSet;
import javax.sql.rowset.Predicate;

public class BookFilter implements Predicate {
    private double maxPrice;
    public BookFilter(double maxPrice) {
        this.maxPrice = maxPrice;
    }
    
    @Override
    public boolean evaluate(RowSet rs) {
        try {
            double price = rs.getDouble("price");
            return price <= maxPrice;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean evaluate(Object value, int column)
            throws SQLException {
        return true;
    }

    @Override
    public boolean evaluate(Object value, String columnName)
            throws SQLException {
        return true;
    }
}