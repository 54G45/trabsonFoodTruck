package controller;

import java.util.ArrayList;

import model.bo.UsuarioBO;
import model.vo.TipoUsuarioVO;
import model.vo.UsuarioVO;

public class UsuarioController {

	public UsuarioVO realizarLoginController(UsuarioVO usuarioVO) {
		
		UsuarioBO usuarioBO = new UsuarioBO();
		
		
		return usuarioBO.realizarLoginBO(usuarioVO);
	}

	public ArrayList<TipoUsuarioVO> consultarTipoUsuario() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
