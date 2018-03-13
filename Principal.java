import java.util.Random;

public class Principal {
	
	public static void main(String[] args) {
			Random ran = new Random();
			for (int i = 0; i < 100; i++) {
				 Pessoa p = new Pessoa("Nome"+i,
					ran.nextInt(100)
				 );
				System.out.printf("Olá eu sou %s, tenho %d anos\r\n",
				p.nome,p.idade);
			}
		
	}
	
}