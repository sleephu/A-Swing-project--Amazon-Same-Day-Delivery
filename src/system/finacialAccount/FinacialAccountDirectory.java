/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.finacialAccount;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class FinacialAccountDirectory {
    private ArrayList<FinacialAccount>finacialAccountList;

    public FinacialAccountDirectory() {
    finacialAccountList = new ArrayList<>();
    }

    public ArrayList<FinacialAccount> getFinacialAccountList() {
        return finacialAccountList;
    }

    public void setFinacialAccountList(ArrayList<FinacialAccount> finacialAccountList) {
        this.finacialAccountList = finacialAccountList;
    }
    public FinacialAccount creFinacialAccount(){
        FinacialAccount f = new FinacialAccount();
        finacialAccountList.add(f);
        return f;
    }
    
//     public FinacialAccount validate(String accountNo,String ssn) {
//        for (FinacialAccount fa : finacialAccountList) {
//            if (fa.getAccountNo().equals(accountNo) && fa.getPerson().getSsn().equals(ssn)) {
//                return fa;
//            }
//        }
//        return null;
//    }
}
