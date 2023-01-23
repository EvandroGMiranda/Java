package ProjetoLanchonete;

import java.util.Scanner;

public class CadastroCliente extends Lanchonete1{
	Scanner leia = new Scanner(System.in);

	private String email;
	private long senha;

	public CadastroCliente(String nome, String endereco, String genero, int idade, int telefone, String cpf,
			String email, long senha) {
		super(nome, endereco, genero, idade, telefone, cpf);
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public long getSenha() {
		return senha;
	}

	public void setSenha(long senha) {
		this.senha = senha;
	}
	public void visualizar() {
		System.out.println("\t\t LOGIN ");

		System.out.println("\n Digite seu CPF: ");
		cpf = leia.next();

		System.out.println("\n Digite seu email: ");
		email = leia.next();		

		System.out.println("\n Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\n Qual seu genero: ");
		genero = leia.next();

		System.out.println("\n Digite sua senha: ");
		senha = leia.nextInt();	

		if(idade >= 18) {
			System.out.println("\n Cadastro Aprovado !!! ");

		}else {
			System.out.println("\n Desculpe, Voçê ainda não pode se cadastrar ! ");
		}
	}



}
package ProjetoLanchonete;

import java.util.Scanner;

public class CadastroMotoca extends Lanchonete1 {
	Scanner leia = new Scanner(System.in);
	private long crlv;
	private long cnh;
	private String placa;
	public CadastroMotoca(String nome, String endereco, String genero, int idade, int telefone, String cpf, long crlv,
			long cnh, String placa) {
		super(nome, endereco, genero, idade, telefone, cpf);
		this.crlv = crlv;
		this.cnh = cnh;
		this.placa = placa;
	}
	public long getCrlv() {
		return crlv;
	}
	public void setCrlv(long crlv) {
		this.crlv = crlv;
	}
	public long getCnh() {
		return cnh;
	}
	public void setCnh(long cnh) {
		this.cnh = cnh;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void cadastroMotoca() {
		System.out.println("\n\t\t Seja Bem vindo Entregador!");

		System.out.println("\n Digite sua idade: ");
		idade = leia.nextInt();
		if(idade >= 18) {

			System.out.println("\n Digite sua CNH: ");
			cnh = leia.nextLong();

			System.out.println("\n Digite seu CRLV: ");
			crlv = leia.nextLong();

			System.out.println("\n Digite sua Placa: ");
			placa = leia.next();
			
			System.out.println("\n Qual seu genero: ");
			genero = leia.next();

			System.out.println("Cadastro Aprovado, ja pode começar a trabalhar conosco! ");
		}else {
			System.out.println("Menor de Idade! Não podemos Continuar");
		}
	}
}
package ProjetoLanchonete;

public class Cliente {
	private String nome;
	private String endereco;
	private long telefone;
	public Cliente(String nome, String endereco, long telefone){
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public Cliente (String nome, long telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public void ImprimirCliente() {
		System.out.println("\nNome do cliente: "+getNome()+"\nEndereço: "+getEndereco()+"\nTelefone: "+getTelefone());
	}
	public void ImprimirMotoboy() {
		System.out.println("\nNome Entregador: "+getNome()+"\nTelefone: "+getTelefone());
	}
}
package ProjetoLanchonete;

import java.util.Scanner;

public class Funcionario1 extends Lanchonete1 {
	Scanner leia = new Scanner(System.in);
	private String cargo;
	private String setor;
	private double salario;
	private float imposto;

	public Funcionario1(String nome, String endereco, String genero, int idade, int telefone, String cpf, String cargo,
			String setor, double salario, float imposto) {
		super(nome, endereco, genero, idade, telefone, cpf);
		this.cargo = cargo;
		this.setor = setor;
		this.salario = salario;
		this.imposto = imposto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}



	public void imprimirInfo() {
		
		System.out.println("\n Digite seu nome: ");
		nome = leia.next();
		
		System.out.println("\n Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\n Digite seu Endereço: ");
		endereco = leia.next();
		leia.next();
		
		System.out.println("\n Qual seu Genero: ");
		genero = leia.next();
		
		System.out.println("\n Digite seu Cargo: ");
		cargo = leia.next();
		
		System.out.println("\n Digite seu Setor: ");
		setor = leia.next();
		
		System.out.println("\n Digite seu Salário: ");
		salario = leia.nextDouble();
		
		System.out.println("\n Digite seu Imposto: ");
		imposto = leia.nextFloat();
		
		
	}

	public void calcularSalario() {
		double valorTotal = salario - (salario *(imposto/100));
		System.out.println("\nO salário líquido a ser recebido pelo empregado, " +getNome()+" depois do imposto calculado, é igual a: "+valorTotal);

	}

}package ProjetoLanchonete;

public abstract class Lanchonete1 {
	protected String nome;
	protected String endereco;
	protected String genero;
	protected int idade;
	protected int telefone;
	protected String cpf;


	public Lanchonete1(String nome, String endereco, String genero, int idade, int telefone, String cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.genero = genero;
		this.idade = idade;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	 

}package ProjetoLanchonete;

import java.util.Scanner;

public  class MenuCardapio {

	
	public void cardapioLanchonete() {
		
		Cliente client2 = new Cliente("Kimberly","Rua dos PR, 774", 11969696969L);
		Cliente client3 = new Cliente("Tommy Lee","Rua dos Pé de Jaca", 11987654321L);
		Cliente client1 = new Cliente(null, null, 0);
		String lanche []= {"","","","","","","","","",""};
		String bebidas []= {"","","","","","","","","",""};
		String sobremesa []= {"","","","","","","","","",""};
		int quantlanches [] = {0,0,0,0,0,0,0,0,0,0};
		int quantsobremesas[] = {0,0,0,0,0,0,0,0,0,0};
		int quantbebidas[] = {0,0,0,0,0,0,0,0,0,0};
	    int x=0,cod=0,quant=0,veri=0;
	    float valor,total,valorTotal=0;
	    Scanner leia = new Scanner(System.in);
//-----------------------------Lanches------------------------------------------	    
	    
	    do {
	    System.out.println("\n\t\t Lanches");
	    System.out.println("\n1-XBurguer = $15,00");
	    System.out.println("\n2-Xsalada = $17,00");
	    System.out.println("\n3-Xbacon = $18,00");
	    System.out.println("\n4-Smash Burguer = $10,00");
	    System.out.println("\n5-Xtudo = $22,00");
	    System.out.println("\n0-Não vou querer");
	    	do {
	    		System.out.println("\n Digite o codigo da sua compra");

	    		cod = leia.nextInt();
	    		if (cod <0 || cod >= 6) {
	    			System.out.println("Digite uma opção válida!");
	    		}
	    	}
	    	while (cod <0 || cod >= 6);
	    if (cod >= 1 && cod<= 5){
		    System.out.println("\n Digite a quantidade desse produto");
		    quant = leia.nextInt();
		    }
		    else
		    	 System.out.println("Obrigado");
	    switch(cod){
    	case 1:
    		total = quant*15;
    		valorTotal = total + valorTotal;
    		lanche [x] = "X-Burguer";
    		quantlanches [x] = quant;
    		System.out.printf("Você comprou "+quant+" X Burguer(s)");
    		break;
    	case 2:
    		total = quant*17;
    		valorTotal = total + valorTotal;
    		lanche [x] = "X-Salada";
    		quantlanches [x] = quant;
    		System.out.printf("Você comprou "+quant+" X Salada(s)");
    		break;
    	case 3:
    		total = quant*18;
    		valorTotal = total + valorTotal;
    		lanche [x] = "X-Bacon";
    		quantlanches [x] = quant;
    		System.out.printf("Você comprou "+quant+" X Bacon(s)");
    		break;
    	case 4:
    		total = quant*10;
    		valorTotal = total + valorTotal;
    		lanche [x] = "Smash Burguer";
    		quantlanches [x] = quant;
    		System.out.printf("Você comprou "+quant+" Smash Burguer(s)");
    		break;
    	case 5:
    		total = quant*22;
    		valorTotal = total + valorTotal;
    		lanche [x] = "X-Tudo";
    		quantlanches [x] = quant;
    		System.out.printf("Você comprou "+quant+" X Tudo");
    		break;
	    }
	    if (cod >= 1 && cod < 6) {
	    System.out.println("\nDeseja Comprar mais lanches?\n1 para sim, 2 para não");
	    veri = leia.nextInt();
	    }
	    x++;
	    }
	    while(veri == 1);
//-----------------------------Bebidas----------------------------------------------
	    x=0;
	    do {
	    System.out.println("\n\t\t Bebidas");
	    System.out.println("\n1-Coca = $5,00");
	    System.out.println("\n2-Fanta Laranja = $5,00");
	    System.out.println("\n3-Fanta uva = $5,00");
	    System.out.println("\n4-Guarana = $5,00");
	    System.out.println("\n5-Suco = $6,00");
	    System.out.println("\n0-Não vou querer");
	    
	    do {
    		System.out.println("\n Digite o codigo da sua compra");

    		cod = leia.nextInt();
    		if (cod <0 || cod >= 6) {
    			System.out.println("Digite uma opção válida!");
    		}
    	}
    	while (cod <0 || cod >= 6);
	    if (cod >= 1 && cod<= 5){
	    System.out.println("\n Digite a quantidade desse produto");
	    quant = leia.nextInt();
	    }
	    else
	    	 System.out.println("Obrigado");
	switch(cod) {
	case 1:
		total = quant*5;
		valorTotal = total + valorTotal;
		bebidas[x] = "Coca";
		quantbebidas[x] = quant;
		System.out.printf("Você comprou "+quant+" Coca(s)");
		break;
	case 2:
		total = quant*5;
		valorTotal = total + valorTotal;
		bebidas[x] = "Fanta Laranja";
		quantbebidas[x] = quant;
		System.out.printf("Você comprou "+quant+" Fanta Laranja(s)");
		break;
	case 3:
		total = quant*5;
		valorTotal = total + valorTotal;
		bebidas[x] = "Fanta Uva";
		quantbebidas[x] = quant;
		System.out.printf("Você comprou "+quant+" Fanta Uva(s)");
		break;
	case 4:
		total = quant*5;
		valorTotal = total + valorTotal;
		bebidas[x] = "Guarana";
		quantbebidas[x] = quant;
		System.out.printf("Você comprou "+quant+" Guaraná(s)");
		break;
	case 5:
		total = quant*6;
		valorTotal = total + valorTotal;
		bebidas[x] = "Suco";
		quantbebidas[x] = quant;
		System.out.printf("Você comprou "+quant+" Suco(s)");	
		break;
	}
		 if (cod >= 1 && cod < 6) {
			    System.out.println("\nDeseja Comprar mais bebidas?\n 1 para sim, 2 para não");
			    veri = leia.nextInt();
			    }
		 x++;
	}
	while(veri==1);
	//-------------------------SOBREMESAS--------------------------------------
	    x=0;
	    do {
	    System.out.println("\n\t\t Sobremesas");
	    System.out.println("\n1-Pudim = $7,00");
	    System.out.println("\n2-Brownie = $10,00");
	    System.out.println("\n3-Sorvete = $8,00");
	    System.out.println("\n0-Não vou querer");
	    do {
    		System.out.println("\n Digite o codigo da sua compra");

    		cod = leia.nextInt();
    		if (cod <0 || cod >= 4) {
    			System.out.println("Digite uma opção válida!");
    		}
    	}
    	while (cod <0 || cod >= 4);
	    if (cod >= 1 && cod<= 5){
		    System.out.println("\n Digite a quantidade desse produto");
		    quant = leia.nextInt();
		    }
		    else
		    	 System.out.println("Obrigado");
	    switch(cod){
	    	case 1:
	    		total = quant*7;
	    		valorTotal = total + valorTotal;
	    		sobremesa[x] = "Pudim";
	    		quantsobremesas[x] = quant;
	    		System.out.printf("Você comprou "+quant+" Pudim(s)");
	    		break;
	    	case 2:
	    		total = quant*10;
	    		valorTotal = total + valorTotal;
	    		quantsobremesas[x] = quant;
	    		sobremesa[x] = "Brownie";
	    		System.out.printf("Você comprou "+quant+" Brownie(s)");
	    		break;
	    	case 3:
	    		total = quant*8;
	    		valorTotal = total + valorTotal;
	    		quantsobremesas[x] = quant;
	    		sobremesa[x] = "Sorvete";
	    		System.out.printf("Você comprou "+quant+" Sorvete(s)");
	    		break;
	    }
		 if (cod >= 1 && cod < 4) {
			    System.out.println("\nDeseja Comprar mais sobremesas?\n para sim, 2 para não");
			    veri = leia.nextInt();
		}
		 x++;
		}
		while(veri==1);
	    if (valorTotal != 0f) {
	    System.out.printf("O Valor total dos itens foi: R$%.2f",valorTotal);
	    
	    System.out.println("\nÉ para entrega? 1 para sim, 2 para não");
	    veri = leia.nextInt();
	    if (veri == 1) {	    
	    leia.nextLine();
		System.out.println("\nInsira o nome do cliente: ");
		client1.setNome(leia.nextLine());
		System.out.println("Insira o endereço do cliente: ");
		client1.setEndereco(leia.nextLine());
		System.out.println("Insira o telefone do cliente: ");
		client1.setTelefone(leia.nextLong());
		System.out.println("\nNome do cliente: "+client1.getNome()+"\nEndereço: "+client1.getEndereco()+"\nTelefone: "+client1.getTelefone());
		System.out.println("\n");
	    }
	    for (x=0;x<lanche.length;x++) {
	    	if (lanche[x] != "") {
	    	System.out.println(quantlanches[x]+"-"+lanche[x]);
	    	}
	    }
	    for (x=0;x<lanche.length;x++) {
	    	if (bebidas[x] != "") {
		    	System.out.println(quantbebidas[x]+"-"+bebidas[x]);
		    }
	    }
	    for (x=0;x<lanche.length;x++) {
	    	if (sobremesa[x] != "") {
		    	System.out.println(quantsobremesas[x]+"-"+sobremesa[x]);
		    }
	    	
	    }
	    System.out.printf("\nO Valor total dos itens foi: R$%.2f",valorTotal);
	    System.out.println("\n Atendemos bem para atender Sempre!");
	    }else
	    	System.out.println("\n Atendemos bem para atender Sempre!");
	}
}
package ProjetoLanchonete;

import java.io.IOException;
import java.util.Scanner;

public class TesteFinalLanchonete {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		CadastroCliente cliente = new CadastroCliente(null, null, null, 0, 0, null, null, 0);
		Funcionario1 func =  new Funcionario1(null, null, null, 0, 0, null, null, null, 0, 0);
		CadastroMotoca motoca = new CadastroMotoca(null, null, null, 0, 0, null, 0, 0, null);
		MenuCardapio menu = new MenuCardapio();

		int op;
// Sistema de menu do programa 
		while(true) {
			System.out.println("\n********* Menu Opcional ******** ");
			System.out.println("\n 1 - Pagina do Funcionário ");
			System.out.println("\n 2 - Cadastro dos Entregadores ");
			System.out.println("\n 3 - Cadastro de Cliente ");
			System.out.println("\n 4 - Menu/Cardápio ");
			System.out.println("\n 5 - Sair ");
			System.out.println("\n Digite Uma Opção:   ");
			op = leia.nextInt();
			if (op == 5) {
				System.out.println("\nSistema Finalizado com sucesso!");
				leia.close();
				System.exit(0);
			}
			
			switch(op){
			case 1:
				func.imprimirInfo();
				func.calcularSalario();
				keyPress();
				break;
				
			case 2:
				motoca.cadastroMotoca();
				keyPress();
				break;
			case 3:
				cliente.visualizar();
				keyPress();
				break;
			case 4:
				menu.cardapioLanchonete();
				keyPress();
				break;
			}

		}


	}
// Bloco para continuar o programa depois que escolher uma opção.
	private static void keyPress() {
		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}finally {
			System.out.println("\n\nPressione Enter para Continuar...");

		}

	}

}
