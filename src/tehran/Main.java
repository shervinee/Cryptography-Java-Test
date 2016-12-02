package tehran;

import java.security.*;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception{
		//for RSA
		HashMap hashMap = EncoderUtil.getRSAKeys();
		PublicKey publicKey = (PublicKey) hashMap.get("PublicKey");
		PrivateKey privateKey = (PrivateKey) hashMap.get("PrivateKey");
		
		byte[] bytes = EncoderUtil.getRSAEncrypt(publicKey,"amirsam");
		System.out.println(EncoderUtil.getRSADecrypt(privateKey,bytes));
	}

}
