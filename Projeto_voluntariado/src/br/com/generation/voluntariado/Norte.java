package br.com.generation.voluntariado;

import java.util.Scanner;

public class Norte {
	void sul() {
		Scanner entrada =new Scanner(System.in);
		int  teste;
		System.out.println("Escolha uma das institui��es para saber mais: \n[1] Instituto Resgatando Vidas\n[2] Associa��o Tia Marly\n[3] Associa��o Cultural e Esportiva Viva ZN\r\n[4] Casa Taiguara das Expedi��es\r\n");
		teste=entrada.nextInt();
    	if(teste==1) {
    		System.out.println("Raz�o Social: Instituto Resgatando Vidas Para Vida\r\n"
    				+ "Descri��o: Tem como objetivo principal promover cidadania e transforma��o social atrav�s da educa��o e empreendedorismo junto � popula��o aos arredores do bairro da Vila Nova Cachoeirinha \r\n"
    				+ "�rea de Atua��o: Cidadania e vida \r\n"
    				+ "Rua Augusto Gil 465\r\n"
    				+ "Vila Dionisia\r\n"
    				+ "CEP  02670-070\r\n"
    				+ "(11) 3774-5981\r\n"
    				+ "contato@institutoresgatandovidas.org.br\r\n"
    				);
    	}
    	else if(teste==2) {
    		System.out.println("Raz�o Social: Associa��o Tia Marly\r\n"                		
    				+ "Descri��o: A associa��o Tia Marly � uma organiza��o social, n�o conveniada a �rg�os p�blicos, sem fins lucrativos, fundada em 27 de junho de 2007, atrav�s da iniciativa de um grupo de amigos. Na unidade s�o oferecidas 17 vagas para acolhida integral de crian�as e adolescentes de 0 a 17 anos e 11 meses. V�timas de maus tratos, abuso, viol�ncia e abandono.  \r\n"
    				+ "�rea de Atua��o: Assist�ncia a crian�as"
    				+ "Rua Duarte de Azevedo 608\r\n"
    				+ "Santana- SP\r\n"
    				+ "CEP 02036-022\r\n"
    				+ "(11) 2099-3725\r\n"
    				+ "marly@casatiamarly.org.br\r\n");
    	}
    	else if(teste==3) {
    		System.out.println("Raz�o Social: Associa��o Cultural e Esportiva Viva ZN\r\n"
    				+ "Descri��o: A Viva ZN � uma entidade sem fins lucrativos que acredita no potencial que a cultura, a educa��o e o esporte t�m para transformar a realidade social de crian�as e adolescentes que vivem em regi�es perif�ricas.\r\n"
    				+ "�rea de Atua��o: Cultura, educa��o e esportes\r\n"
    				+ "Rua Engenheiro C�sar 76\r\n"
    				+ "Santana - SP\r\n"
    				+ "CEP 02018-070\r\n"
    				+ "(11) 9989-6654\r\n"
    				+ "associacaovivazn@gmail.com\r\n");
    	}
    	else if(teste==4) {
    		System.out.println("Raz�o Social: Moradia Associa��o Civil\r\n"
    				+ "Descri��o: As Casas Taiguara s�o Casas de Acolhimento e Abrigos para crian�as e adolescentes sem moradia, principalmente aqueles que est�o nas ruas de S�o Paulo. Desde 1996, seguem uma metodologia de trabalho pioneira e atuante: o acolhimento 24 horas, oferecendo moradia segura, volta � escola, boa alimenta��o e calor humano.\r\n"
    				+ "�rea de Atua��o: Acolhimento e abrigos para moradores de rua\r\n"
    				+ "Rua Felipe Fragoso 177\r\n"
    				+ "Bairro Freguesia do �\r\n"
    				+ "CEP 02558-060\r\n"
    				+ "(11) 3951-6987\r\n"
    				+ "valeriagonpassaro@gmail.com\r\n");
    	}
    	else {
    		System.out.println("Voc� digitou um numero invalido");
    	}
    	entrada.close();

}
}
