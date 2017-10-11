
public class DESMode implements EncryptMode {

	@Override
	public void encrypt(String plain) {
		System.out.println("对 " + plain + " 使用 DES 进行加密");
	}

}
