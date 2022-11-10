package model.vo;

import java.util.Scanner;

import view.MenuProduto;
import view.MenuRelatorio;
import view.MenuUsuario;
import view.MenuVenda;

public class Menu {
	
	private static final int OPCAO_MENU_VENDA = 1;
	private static final int OPCAO_MENU_PRODUTO = 2;
	private static final int OPCAO_MENU_RELATORIO = 3;
	private static final int OPCAO_MENU_USUARIO = 4;
	private static final int OPCAO_MENU_VOLTAR = 9;
	
	Scanner teclado = new Scanner(System.in);
	
	
	public void apresentarMenu(UsuarioVO usuarioVO) {
		int opcao = this.apresentarOpcoesMenu(usuarioVO);
		
		while(opcao != OPCAO_MENU_VOLTAR) {
			
			switch(opcao) {
				case OPCAO_MENU_VENDA: {
					MenuVenda menuVenda = new MenuVenda();
					menuVenda.apresentarMenuVenda(usuarioVO);
					break;
				}
				case OPCAO_MENU_PRODUTO: {
					if(usuarioVO.getTipoUsuario().equals(TipoUsuarioVO.FUCIONARIO )
							|| usuarioVO.getTipoUsuario().equals(TipoUsuarioVO.ADIMINISTRADOR)) {
						MenuProduto menuProduto = new MenuProduto();
						menuProduto.apresentarMenuProduto();
					}
					break;
				}
				case OPCAO_MENU_RELATORIO: {
					if(usuarioVO.getTipoUsuario().equals(TipoUsuarioVO.FUCIONARIO )
							|| usuarioVO.getTipoUsuario().equals(TipoUsuarioVO.ADIMINISTRADOR)) {
						MenuRelatorio menuRelatorio = new MenuRelatorio();
						MenuRelatorio.apresentarMenuRelatorio();
					}
					break;
				}
				case OPCAO_MENU_USUARIO: {
					if(usuarioVO.getTipoUsuario().equals(TipoUsuarioVO.FUCIONARIO )
							|| usuarioVO.getTipoUsuario().equals(TipoUsuarioVO.ADIMINISTRADOR)) {
						MenuUsuario menuUsuario = new MenuUsuario();
						MenuUsuario.apresentarMenuUsuario();
					}
					break;
				}
				default: {
					System.out.println("opção invalida");
				}
			}
			opcao = this.apresentarOpcoesMenu(usuarioVO);
		}
		
		
	}
	
	private int apresentarOpcoesMenu(UsuarioVO usuarioVO) {
		
		
		
		
		System.out.println("foodtruck");
		System.out.println("menu");
		System.out.println("opções");
		System.out.println(OPCAO_MENU_VENDA + " menu de vendas");
		
		if(usuarioVO.getTipoUsuario().equals(TipoUsuarioVO.FUCIONARIO )
				|| usuarioVO.getTipoUsuario().equals(TipoUsuarioVO.ADIMINISTRADOR)) {
			System.out.println(OPCAO_MENU_PRODUTO + "menu de produto");
			System.out.println(OPCAO_MENU_RELATORIO + "menu de relatorio");
		}
		if(usuarioVO.getTipoUsuario().equals(TipoUsuarioVO.ADIMINISTRADOR)) {
			System.out.println(OPCAO_MENU_USUARIO + "menu de usuario");
			
		}
		System.out.println(OPCAO_MENU_VOLTAR + "voltar");
		System.out.println("Digite uma opcao: ");
		return Integer.parseInt(teclado.nextLine());
		
		
	}
}
