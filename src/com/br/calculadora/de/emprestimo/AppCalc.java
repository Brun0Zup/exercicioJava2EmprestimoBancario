package com.br.calculadora.de.emprestimo;

import java.util.Scanner;

public class AppCalc {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Por favor digite seu nome:");
			String nomeDoUsuario = entrada.next();
			
			System.out.println("Insira sua idade:");
			int idade = entrada.nextInt();
			
			System.out.println("Por favor inira sua renda:");
			double rendaUsuario = entrada.nextDouble();
			
			System.out.println("Por favor insira o valor pedido:");
			double valorPedido = entrada.nextDouble();
			
			double rendaVezes10 = rendaUsuario * 10;
			int juros = 3;
			double valorTotal = valorPedido + (((valorPedido + juros)/100)*12);
			
			if(idade>=25 && idade <= 60 ) {
				
				System.out.println("Sua idade está aprovada");
			}else {
				
				System.out.println("Idade não permitida para realizar o empréstimo");
			}
			
			if(rendaUsuario >= 1500) {
				System.out.println("Renda aprovada");
			}else {
				System.out.println("Sua renda não foi aprovada");
			}
			
			
			if(valorPedido >= 1000 && rendaUsuario <= rendaVezes10){
				
			System.out.println("Valor pedido no valor de " + valorPedido + "Mas voce pagara no valor de " + valorTotal);
			}else {
				
				System.out.println("Valor não aprovado");
			}
		
			}
		}
