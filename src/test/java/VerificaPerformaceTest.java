import com.github.natalialopessilva.cs20162.aula06.VerificaPerformace;
import static com.github.natalialopessilva.cs20162.aula06.VerificaPerformace.main;
import org.junit.Test;

public class VerificaPerformaceTest {
    
    @Test(expected = UnsupportedOperationException.class)
    public void obterCoberturaCemPorCento() {
        VerificaPerformace verificaPerformace = new VerificaPerformace();
    }
    
    public void obterCoberturaCemPorCento2() {
        String[] args = null;
        main(args);
    }
}
