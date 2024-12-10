import org.junit.jupiter.api.Test;

import ucu.edu.ua.task1.*;

import static org.junit.jupiter.api.Assertions.*;

 

public class testTask1 {

    @Test
    public void testATMWithExactAmount() {
        ATM atm = new ATM();
        atm.giveMoney(700);
    }

    @Test
    public void testATMWithAmountNotDivisibleByDenominations() {
        ATM atm = new ATM();
        assertThrows(IllegalArgumentException.class, () -> {
            atm.giveMoney(750); 
        });
    }

    @Test
    public void testATMWithLargeAmount() {
        ATM atm = new ATM();
        atm.giveMoney(1500); 
    }

    @Test
    public void testATMWithSingleDenomination() {
        ATM atm = new ATM();
        atm.giveMoney(500);
    }

    @Test
    public void testATMWithEdgeCaseZero() {
        ATM atm = new ATM();
        atm.giveMoney(0); 
    }
}

