package bankingApplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VeryAccountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test

   public void testThat_account_canBeDepositedInto(){

        //given
        VeryAccount bessieAccount = new VeryAccount();

        //when
        bessieAccount.depositMoney(2500.00);

        //assert
        double bessieAccountBalance = bessieAccount.getAccountBalance();
        assertEquals(2500.00, bessieAccountBalance);

    }



    @Test
    @DisplayName("Money can be deposited twice Test")

    public void accountCanReceiveDoubleDepositName() {

        //given
        VeryAccount anthonyAccount = new VeryAccount();
        anthonyAccount.depositMoney(2500.00);
        //when
        anthonyAccount.depositMoney(3500.00);
        //assert
        assertEquals(6000, anthonyAccount.getAccountBalance());
    }

        @Test

        public void accountCannotReceiveNegativeDepositTest(){

        //given
        VeryAccount graceAccount = new VeryAccount();
        //when
        graceAccount.depositMoney(-970297372);
        //assert
        assertEquals(0, graceAccount.getAccountBalance());

    }



    @Test

    public void moneyCanBeWithdrawnFromAccountWithValidPinTest(){

        //given
        VeryAccount mitchellAccount = new VeryAccount();
        mitchellAccount.depositMoney(7000);
        mitchellAccount.setPin(1234);

        //when
        mitchellAccount.withdrawMoney(2000,1234);

        //assert
        assertTrue(mitchellAccount.getAccountBalance() == 5000);

    }

    }

