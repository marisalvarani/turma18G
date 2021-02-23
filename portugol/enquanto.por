programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro ano
		inteiro idade
		caracter resposta = 'S'


		enquanto (resposta == 'S') {
			escreva("Digite o nome: ")
			leia(nome)
			escreva("Digite ano de nascimento: ")
			leia(ano)
			idade = 2021 - ano
			escreva("Idade aproximada = ", idade, "\n")
			escreva("Deseja continuar? S/N ")
			leia(resposta)
			
			
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */