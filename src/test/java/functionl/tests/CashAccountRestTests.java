package functionl.tests;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccount;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class CashAccountRestTests {

    private RestTemplate template = new RestTemplate();

    @Test
    public void testFindAll() {
        List<CashAccount> cashAccounts = template.getForObject("http://localhost:8080/Cash Account", List.class);
        assertThat(cashAccounts.size(), greaterThan(1));

    }
}
