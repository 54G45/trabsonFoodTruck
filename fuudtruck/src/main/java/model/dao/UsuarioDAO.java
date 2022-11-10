package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.vo.TipoUsuarioVO;
import model.vo.UsuarioVO;

public class UsuarioDAO {

	public UsuarioVO realizarLoginDAO(UsuarioVO usuarioVO) {
		
		Connection conn = Banco.getConnection();
		Statement stat = Banco.getStatement(conn);
		ResultSet resultado = null;
		
		String query = "select u.idusuario, tipo.descricao, u.nome, u.cpf, u.email, u.telefone, u.datacadastro, u.dataexpiracao "
				+ "from usuario u, tipousuario tipo"
				+ "where u.login like ' " + usuarioVO.getLogin() + "' "
				+ "and u.isenha like ' " + usuarioVO.getSenha() + "' "
				+ "and u.idTipoUsuario = tipo.idTipoUsuario";
		
		try {
			resultado = stat.executeQuery(query);
			if(resultado.next()) {
				usuarioVO.setIdusuario(Integer.parseInt(resultado.getString(1)));
				usuarioVO.setTipoUsuario(TipoUsuarioVO.valueOf(resultado.getString(2)));
				usuarioVO.setNome(resultado.getString(3));
				usuarioVO.setCpg(resultado.getString(4));
				usuarioVO.setEmail(resultado.getString(5));
				usuarioVO.setTelefone(resultado.getString(6));
				usuarioVO.setDataCadastro(LocalDateTime.parse(resultado.getString(7),
						DateTimeFormatter.ofPattern("yyyy-MM-dd")));
				usuarioVO.setDataExpiracao(LocalDateTime.parse(resultado.getString(8),
						DateTimeFormatter.ofPattern("yyyy-MM-dd")));
				
				
			}
		}catch (SQLException erro) {
			System.out.println();
			System.out.println();
		}finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stat);
			Banco.closeConnection(conn);
		}
		
		return usuarioVO;
	}

}
