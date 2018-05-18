package test;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;
    
    public CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }
    
    public void store(int money) {
        if(money > 0) {
            this.balance += money;            
            this.bonus += money/1000;            
        }
        else {
            System.out.println("�x�ȬO�t���H�A�O�Ӷê��ܡH");
        }
    }
    
    void charge(int money) {
        if(money > 0) {
            if(money <= this.balance) {
                this.balance -= money;
            }
            else {
                System.out.println("�������աI");
            }
        }
        else {
            System.out.println("���t�ơH�o���O�s���x�ȶܡH");
        }
    }
    
    public int exchange(int bonus) {
        if(bonus > 0) {
        	if(bonus <= this.bonus) {
                this.bonus -= bonus;
            }
            else {
                System.out.println("���Q�����աI");
            }
        }
        return this.bonus;
    }

    public int getBalance() {
        return balance;
    }

    public int getBonus() {
        return bonus;
    }

    public String getNumber() {
        return number;
    }
}
