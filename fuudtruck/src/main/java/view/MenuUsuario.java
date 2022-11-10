package view;

import java.util.Scanner;

import model.vo.UsuarioVO;

public class MenuUsuario {
	
	private static final int OPCAO_MENU_CADASTRAR_USUARIO = 1;
	private static final int OPCAO_MENU_CONSULTAR_USUARIO = 2;
	private static final int OPCAO_MENU_ATUALIZAR_USUARIO = 3;
	private static final int OPCAO_MENU_EXCLUIR_USUARIO = 4;
	private static final int OPCAO_MENU_USUARIO_VOLTAR = 9;
	
	private static final int OPCAO_MENU_CONSULTAR_TODOS_USUARIO = 1;
	private static final int OPCAO_MENU_CONSULTAR_UM_USUARIO = 2;
	private static final int OPCAO_MENU_CONSULTAR_USUARIO_VOLTAR = 9;
	
	Scanner teclado = new Scanner (System.in);
	
	
	private int apresentarOpoesMenu() {
		System.out.println("foodtruck");
		System.out.println("menu de usuario");
		System.out.println("opções");
		
		System.out.println(OPCAO_MENU_CADASTRAR_USUARIO+ "cadastrar usuario");
		System.out.println(OPCAO_MENU_CONSULTAR_USUARIO + "consultar usuario");
		System.out.println(OPCAO_MENU_ATUALIZAR_USUARIO + "atualizar usuario");
		System.out.println(OPCAO_MENU_EXCLUIR_USUARIO + "excluir usuario");
		System.out.println(OPCAO_MENU_USUARIO_VOLTAR + "voltar");
		System.out.println("DIgite uma opcao");
		
		
		return Integer.parseInt(teclado.nextLine());
	}

	public  void apresentarMenuUsuario() {
		
		int opcao = this.apresentarOpoesMenu();
		
	}
	
	
	
	public void cadastrarNovoUsuario(UsuarioVO usuarioVO) {
		
	}

}
