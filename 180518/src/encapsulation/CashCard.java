package encapsulation;

class CashCard {
    private String number;
    private int balance;
    private int bonus;
    
    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }
    
    void store(int money) {
        if(money > 0) {
            this.balance += money;
            if(money >= 1000) {
                this.bonus++;
            }
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
    
    int exchange(int bonus) {
        if(bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }

    int getBalance() {
        return balance;
    }

    int getBonus() {
        return bonus;
    }

    String getNumber() {
        return number;
    }
}
