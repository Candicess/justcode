
public class MDMode implements EncryptMode {

	@Override
	public void encrypt(String plain) {
		System.out.println("对 " + plain + " 使用 MD5 进行加密");
	}

}
