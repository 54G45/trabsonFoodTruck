package view;

import java.util.Scanner;

import model.vo.UsuarioVO;

public class Login {

	private static final int OPCAO_MENU_LOGIN = 1;
	private static final int OPCAO_MENU_CRIAR_CONTA = 2;
	private static final int OPCAO_MENU_SAIR = 9;
	
	public void apresentarMenuLogin() {
		int opcao = this.apresentarOpcoesMenu();
		while(opcao != OPCAO_MENU_SAIR) {
			switch(opcao) {
				case OPCAO_MENU_LOGIN:{
					UsuarioVO usuarioVO = this.realizarLogin();
					System.out.println("Realizando o Login");
					if(usuarioVO.getIdusuario() != 0 && usuarioVO.getDataExpiracao() == null ){
					System.out.println("usuario logado" + usuarioVO.getLogin());
					System.out.println("perfil" + usuarioVO.getTipoUsuario());
					} 
							
					break;
				}
	                case OPCAO_MENU_CRIAR_CONTA:{
					System.out.println("criando conta");
					break;
				}
				default:{
					System.out.println("opçãos invalida");
					break;
				}
			}
			//opcao = this.apresentarOpcoesMenu();
		}
		
	}

	private UsuarioVO realizarLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	private int apresentarOpcoesMenu() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("------------ Sistema FoodTruck --------------");
		System.out.println("\nOpções: ");
		System.out.println(OPCAO_MENU_LOGIN + " - Entrar");
		System.out.println(OPCAO_MENU_CRIAR_CONTA + " - Criar Conta");
		System.out.println(OPCAO_MENU_SAIR + " - Sair");
		System.out.println("\nDigite uma opção: ");
		return Integer.parseInt(teclado.nextLine());
		
		
	}
	
	
	
	
}
