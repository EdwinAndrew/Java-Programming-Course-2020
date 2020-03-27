
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matAccount = new Account("Matthews account",1000);
        Account myAcc = new Account("My account",0);
        matAccount.withdrawal(100);
        myAcc.deposit(100);
        System.out.println(matAccount);
        System.out.println(myAcc);
    }
}
