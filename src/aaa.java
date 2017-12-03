import idao.DAOFactory;
import idao.IMoney;
import idao.IUser;
import model.Money;

public class aaa {
    public static void main(String[] args) {
        IUser user=DAOFactory.creatUserDAO();
        IMoney money=DAOFactory.createMoneyDAO();
        int j=money.findMoneyAll().size();
       int i= user.findEmployeeAll().size();
        Money money1=new Money("1234",456d);
        money.update(money1);
        System.out.println(j);
    }
}
