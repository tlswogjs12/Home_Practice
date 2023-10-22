package MVC;

public class BankDTO {

    private int accountId;
    private int accountNumber;
    private String accountName;
    private double balance;
    private String branchName;
    private String lastTransactionDate;


    //기본 생성자
    public BankDTO(){

    }

    // 2. 파라미터를 추가한 생성자
    public BankDTO(int accountId,int accountNumber, String accountName,double balance, String branchName,String lastTransactionDate){
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.branchName = branchName;
        this.lastTransactionDate = lastTransactionDate;


    }

    //getter setter 메서드를 생성
    //getter setter 를 사용하는 이유는






}
