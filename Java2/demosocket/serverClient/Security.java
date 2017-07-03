package demosocket.serverClient;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;

/**
 * Created by andrew on 24.06.17.
 */
public class Security {

    private Key publicKey;
    private Key privateKey;

    public Security() {

        try {
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
            kpg.initialize(1024);
            KeyPair kp = kpg.genKeyPair();
            publicKey = kp.getPublic();
            privateKey = kp.getPrivate();


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


    }

    public Key getPublicKey() {
        return publicKey;
    }

    public void decryptKey(byte[] encryptedData) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {

        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedData = cipher.doFinal(encryptedData);
        String decryptedLine = new String(decryptedData);
        System.out.println(decryptedLine);

    }

}
