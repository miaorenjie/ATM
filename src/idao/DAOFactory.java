package idao;

import dao.EmployeeDAO;
import dao.MoneyDAO;
import dao.UserDAO;

public class DAOFactory
{
    public static IEmployee creatEmployeeDAO()
    {
        return new EmployeeDAO();

    }

    public static IUser creatUserDAO(){
        return new UserDAO();
    }

    public static IMoney createMoneyDAO(){
        return new MoneyDAO();
    }
}
