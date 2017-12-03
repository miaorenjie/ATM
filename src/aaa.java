import Service.UserServer;
import idao.DAOFactory;
import idao.IMoney;
import idao.IUser;
import model.Money;
import model.User;

public class aaa {
    public static void main(String[] args) {
        User user=new User("000001","1234567");
        UserServer userServer=new UserServer();
        userServer.setCurrentUser(user);
        userServer.saveMoney(1);
//        IUser userDAO=DAOFactory.creatUserDAO();
//        IMoney money=DAOFactory.createMoneyDAO();
//        int j=money.findMoneyAll().size();
//       int i= userDAO.findEmployeeAll().size();
//        Money money1=new Money("000001",456d);
//        money.insert(money1);
//        System.out.println(j);
    }
}
