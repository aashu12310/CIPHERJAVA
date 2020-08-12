package Assignment;

class SavingAmount{
	int saving;
    SavingAmount(int saving)
    {
        this.saving=saving;
    }
    void setter(int a)
    {
        saving = a;
    }
    void getter()
    {
        System.out.println(saving);
    }
    void increment()
    {
        saving += 1000;
    }
    void decrement()
    {
        saving -= 100;
    }
    void checkSavings()
    {
        if(saving>=1000)
        {
            System.out.println("Congratulations! You have saved a good amount");
        }
        else if(saving<1000 && saving>=0 )
        {
            System.out.println("Insufficient Saving!");
        }
        else
        {
            System.out.println("You are in debt");
        }
    }
    void Total()
    {
        System.out.println("Your current savings are Rs "+saving);
    }
}

public class Virtual_Banking_System {
	
	public static void main(String[] args) {
		SavingAmount save= new SavingAmount(-100);
        save.decrement();
        save.increment();
        save.checkSavings();
        save.Total();
	}
}
