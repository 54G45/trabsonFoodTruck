package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.UsuarioController;
import model.vo.TipoUsuarioVO;
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
		while(opcao != OPCAO_MENU_USUARIO_VOLTAR) {
			switch(opcao) {
				case OPCAO_MENU_CADASTRAR_USUARIO: {
					UsuarioVO usuarioVO = new UsuarioVO();
					this.cadastrarUsuario(usuarioVO);
					break;
				}
				case OPCAO_MENU_CONSULTAR_USUARIO: {
					this.consultarUsuario();
					break;
				}
				case OPCAO_MENU_ATUALIZAR_USUARIO: {
					this.atualizarUsuario();
					break;
				}
				case OPCAO_MENU_EXCLUIR_USUARIO: {
					this.excluirUsuarivo();
					break;
				}
				default: {
					System.out.println("opcao invalida");
				}
			}
			opcao = this.apresentarOpoesMenu();
		}
		
	}
	
	public void cadastrarNovoUsuario(UsuarioVO usuarioVO) {
		this.cadastrarUsuario(usuarioVO);
	}
	
	private void cadastrarUsuario(UsuarioVO usuarioVO) {
		
		if(usuarioVO.getTipoUsuario() == null) {
			do {
				
				usuarioVO.setTipoUsuario(TipoUsuarioVO.getTipoUsuarioVOPorValor(this.apresentarOpcoesTipoUsuario()));
				
			}while(usuarioVO.getTipoUsuario() == null);
		}
		
	}

	private int apresentarOpcoesTipoUsuario() {
		
		UsuarioController usuarioController = new UsuarioController();
		ArrayList<TipoUsuarioVO> listaTipoUsuarioVO = usuarioController.consultarTipoUsuario();
		System.out.println("tipou suario");
		System.out.println("opcoes");
		for(int i=0;i<listaTipoUsuarioVO.size();i++) {
			System.out.println(listaTipoUsuarioVO.get(i).getValor() + " - " + listaTipoUsuarioVO.get(i));
		}
		System.out.println("digite uma opcao");
		
		
		return Integer.parseInt(teclado.nextLine());
	}

	private void consultarUsuario() {
		// TODO Auto-generated method stub
		
	}

	private void atualizarUsuario() {
		// TODO Auto-generated method stub
		
	}

	private void excluirUsuarivo() {
		// TODO Auto-generated method stub
		
	}

	

}
