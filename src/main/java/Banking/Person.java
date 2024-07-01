package Banking;

public class Person
{
    private long accNo;
    private  String name;
    private String transactionType;
    private int Tamount;
    private int bankBalance;

    public Person(long accNo, String name, String transactionType, int tamount, int bankBalance) {
        this.accNo = accNo;
        this.name = name;
        this.transactionType = transactionType;
        Tamount = tamount;
        this.bankBalance = bankBalance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "accNo=" + accNo +
                ", name='" + name + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", Tamount=" + Tamount +
                ", bankBalance=" + bankBalance +
                '}';
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getTamount() {
        return Tamount;
    }

    public void setTamount(int tamount) {
        Tamount = tamount;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }
}
