package utils;

import Essentials.Implementations.Beneficiar;
import Essentials.Implementations.summTransaction;
import Services.all.Pay.PaymentModel;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;

import static org.junit.Assert.*;

public class FreezerTest {

    @Test
    public void saveModel() {
        Freezer fr = new Freezer();
        PaymentModel pm = new PaymentModel();
        pm.summ= new summTransaction();
        pm.summ.rubles=new BigDecimal(12);
        pm.summ.cents=22;
        PaymentModel restored = fr.restoreModel(fr.saveModel(pm));
        assertEquals(pm.summ.rubles,  restored.summ.rubles);
    }

    @Test
    public void saveModelwithName() throws IOException {
        Freezer fr = new Freezer();
        PaymentModel pm = new PaymentModel();
        Beneficiar ben = new Beneficiar();
        ben.Name="Roman";
        pm.beneficiar=ben;
        FileOutputStream fos = new FileOutputStream("saved.bin");
        fos.write(fr.saveModel(pm));
        fos.close();

        PaymentModel pm2 = fr.restoreModel(Files.readAllBytes(new File("saved.bin").toPath()));
        System.out.println(pm2.beneficiar.Name);


    }
}