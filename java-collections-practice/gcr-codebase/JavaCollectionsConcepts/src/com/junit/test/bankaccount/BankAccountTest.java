package com.junit.test.bankaccount;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.junit.main.banksystem.* ;

public class BankAccountTest {

	private BankAccount account ;
	
	@BeforeEach
	void setUp() {
		account = new BankAccount(100.0) ;
	}
	
	@Test
	void testDeposit() {
		account.deposit(50.0);
		assertEquals(150.0, account.getBalance(), "Balance should increase after deposit.") ;
	}
	
	@Test
    void testWithdraw() {
        account.withdraw(40.0);
        assertEquals(60.0, account.getBalance(), "Balance should decrease after withdrawal");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200.0); // more than balance
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-10.0);
        });
    }

    @Test
    void testWithdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-5.0);
        });
    }

}
