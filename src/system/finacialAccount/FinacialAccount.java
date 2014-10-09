
package system.finacialAccount;

import system.Transcation.TranscationList;

public class FinacialAccount {
  private  double debt;
  private double credit;
  private String accountNo;
//  private Person person;

//    public Organization getO() {
//        return o;
//    }
//
//    public void setO(Organization o) {
//        this.o = o;
//    }
//  private Enterprise e;
  private TranscationList transcationList;

    //  private Organization o;
    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
  

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    //    public Person getPerson() {
    //        return person;
    //    }
    //
    //    public void setPerson(Person person) {
    //        this.person = person;
    //    }
//    public FinacialAccount() {
//   transcationList = new TranscationList();
//    }

    public TranscationList getTranscationList() {
        return transcationList;
    }

    public void setTranscationList(TranscationList transcationList) {
        this.transcationList = transcationList;
    }
    

   

}
