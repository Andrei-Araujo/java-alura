
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condcionais");
		int idade = 20;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voce nao tem 18, mas pode entrar");
			} else {
				System.out.println("infelizmente, voce nao pode entrar");
			}

		}
	}
}
