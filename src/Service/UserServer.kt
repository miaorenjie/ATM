package Service

import idao.DAOFactory
import idao.IMoney
import idao.IUser
import model.Money
import model.User

class UserServer{
    private lateinit var currentUser:User
    private var userDAO:IUser=DAOFactory.creatUserDAO()
    private var moneyDAO:IMoney=DAOFactory.createMoneyDAO()

    fun setCurrentUser(user: User){
        this.currentUser=user
    }
    fun saveMoney(amount:Int){
        var money:Money= moneyDAO.findMoneyByName(currentUser.emp_no)!![0]
        money.balance=money.balance+amount
        moneyDAO.update(money)
    }

    fun takeMoney(amount: Int){
        var money:Money= moneyDAO.findMoneyByName(currentUser.emp_no)!![0]
        money.balance=money.balance-amount
        moneyDAO.update(money)
    }

}