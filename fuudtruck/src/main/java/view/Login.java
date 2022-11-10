package view;

import java.util.Scanner;

import controller.UsuarioController;
import model.vo.TipoUsuarioVO;
import model.vo.UsuarioVO;

public class Login {

	Scanner teclado = new Scanner(System.in);
	
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
//					if(usuarioVO.getIdusuario() != 0 &&							
					break;
				}
	                case OPCAO_MENU_CRIAR_CONTA:{
					System.out.println("criando conta");
					this.cadastrarNovoUsuario();
					break;
				}
				default:{
					System.out.println("opçãos invalida");
					break;
				}
			}
			opcao = this.apresentarOpcoesMenu();
		}
		
	}

	public void cadastrarNovoUsuario() {
		UsuarioVO usuarioVO = new UsuarioVO();
		usuarioVO.setTipoUsuario(TipoUsuarioVO.CLIENTE);
		
		MenuUsuario menuUsuario = new MenuUsuario();
		menuUsuario.cadastrarNovoUsuario(usuarioVO);
	}

	private UsuarioVO realizarLogin() {
		
		UsuarioVO usuarioVO = new UsuarioVO();
		System.out.println("_-------------------------------");
		System.out.println("Login: ");
		usuarioVO.setLogin(teclado.nextLine());
		System.out.println("senha: ");
		usuarioVO.setSenha(teclado.nextLine());
		
		if(usuarioVO.getLogin().isEmpty() || usuarioVO.getSenha().isEmpty()) {
			System.out.println("os campos de login e senha sao obrigatorios");
		}else {
			UsuarioController usuarioController = new UsuarioController();
			usuarioVO = usuarioController.realizarLoginController(usuarioVO);
			if(usuarioVO.getIdusuario() == 0) {
				System.out.println("usuario n encontrado");
			}
			
			if(usuarioVO.getDataExpiracao() != null) {
				System.out.println("usuario expirado");
			}
		}
		
		return usuarioVO;
	}

	private int apresentarOpcoesMenu() {
		
		
		System.out.println("------------ Sistema FoodTruck --------------");
		System.out.println("\nOpções: ");
		System.out.println(OPCAO_MENU_LOGIN + " - Entrar");
		System.out.println(OPCAO_MENU_CRIAR_CONTA + " - Criar Conta");
		System.out.println(OPCAO_MENU_SAIR + " - Sair");
		System.out.println("\nDigite uma opção: ");
		return Integer.parseInt(teclado.nextLine());
		
		
	}
	
	
	
	
}
