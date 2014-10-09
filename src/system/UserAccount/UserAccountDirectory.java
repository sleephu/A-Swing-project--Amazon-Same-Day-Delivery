/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.UserAccount;

import java.util.ArrayList;
import system.Person.Person;
import system.Role.Role;

/**
 *
 * @author Administrator
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    // validate UserAccount

    public UserAccount validate(String userName, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUserName().equals(userName) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    // create UserAccount 
    public UserAccount creUserAccount(String username, String password, Person p, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setPerson(p);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;

    }

    public boolean checkUserName(String userName) {
        ArrayList<String> existedUserAccountUserNameList = new ArrayList<>();
        for (UserAccount u : userAccountList) {
            existedUserAccountUserNameList.add(u.getUserName());
        }
//            if(!existedUserAccountUserNameList.contains(ua.getUserName())){
//      return true;

//        }
        return existedUserAccountUserNameList.contains(userName);

    }

    public void deleUserAccount(UserAccount ua) {
        userAccountList.remove(ua);

    }
}
