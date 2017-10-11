
public class Machine {
	
	private String plain;
	private EncryptMode encryptMode;
	
	public void setPlain(String plain) {
		this.plain = plain;
	}
	
	public void setEncryptMode(EncryptMode encryptMode) {
		this.encryptMode = encryptMode;
	}
	
	public void getEncryptText(){
		encryptMode.encrypt(plain);
	}

}
