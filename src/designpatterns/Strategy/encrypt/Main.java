
public class Main {

	public static void main(String[] args) {
		
		Machine machine = new Machine();
		machine.setPlain("DesignPattern");
		
		// 设置使用 MD 加密的策略
		machine.setEncryptMode(new MDMode());
		machine.getEncryptText();
		
		// 设置使用 DES 加密的策略
		machine.setEncryptMode(new DESMode());
		machine.getEncryptText();

	}

}
