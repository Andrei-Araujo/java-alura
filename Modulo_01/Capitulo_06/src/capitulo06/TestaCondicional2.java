package capitulo06;

public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condcionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas>=2;
		
		// if (idade >= 18 || quantidadePessoas >= 2) {
		// if (idade >= 18 && acompanhado == true) {
		if (idade >= 18 && acompanhado) {
			System.out.println("voc? tem mais de 18 anos");
		} else {
			System.out.println("infelizmente, voce nao pode entrar");
		}
	}
}
