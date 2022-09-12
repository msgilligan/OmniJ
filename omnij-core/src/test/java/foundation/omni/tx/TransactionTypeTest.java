package foundation.omni.tx;

import org.junit.Test;

import java.util.Optional;

import foundation.omni.tx.Transactions.TransactionType;
import static org.junit.Assert.assertTrue;

/**
 * Tests for {@link Transactions.TransactionType}
 */
public class TransactionTypeTest {

    // TODO: Upgrade to JUnit 5 and make this a parameterized test, like its Spock equivalent
    @Test
    public void switchTest() {
        Optional<TransactionType> optionalType = TransactionType.find(0);

        boolean isSend;
        if (optionalType.isPresent()) {
            switch (optionalType.get()) {
                case SIMPLE_SEND:
                case SEND_TO_OWNERS:
                case SEND_ALL:
                    isSend = true;
                    break;
                default:
                    isSend = false;
                    break;
            }
        } else {
            isSend = false;
        }

        assertTrue(isSend);
    }
}
