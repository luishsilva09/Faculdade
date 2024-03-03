package bytebank;

public class CriarConta {
	public static void main(String[] args) {
		Conta contaUsuario =  new Conta();
		contaUsuario.titular = new Titular();

		 contaUsuario.saldo = 200;
		 
		 contaUsuario.dipositar(300);
		 
		 boolean sacou = contaUsuario.sacar(200);
	}
}
