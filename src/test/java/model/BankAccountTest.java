package model;

import model.*;

import static org.junit.Assert.*;

/**
 * Created by damien on 26/11/15.
 */
public class BankAccountTest {

    BankAccount bankAccount;

    @org.junit.Before
    public void setUp() throws Exception {
        this.bankAccount = new BankAccount(50);
    }

    @org.junit.Test
    public void testGetAmount() throws Exception {
        assertEquals(50, this.bankAccount.getAmount());
    }

    @org.junit.Test
    public void testCredit() throws Exception {
        this.bankAccount.credit(10);
        assertEquals(60, this.bankAccount.getAmount());
    }

    @org.junit.Test
    public void testDebit() throws Exception {
        this.bankAccount.debit(10);
        assertEquals(40, this.bankAccount.getAmount());
    }
}