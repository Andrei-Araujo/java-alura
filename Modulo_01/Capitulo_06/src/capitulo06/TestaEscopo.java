package capitulo06;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condcionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		boolean acompanhado;		// escopo global
		
		if (quantidadePessoas >=2) {
			acompanhado = true;		// escopo local
		} else {
			acompanhado = false;	// escopo local
		}
		
		
		if (idade >= 18 && acompanhado) {
			System.out.println("você tem mais de 18 anos");
		} else {
			System.out.println("infelizmente, voce nao pode entrar");
		}
	}
}
