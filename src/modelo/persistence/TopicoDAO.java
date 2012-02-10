package modelo.persistence;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import modelo.Topico;

public class TopicoDAO implements DAO<Topico> {

	
	private Connection conn;
	private PreparedStatement pstm;
	private ResultSet rs;
	
	public TopicoDAO() {

		conn = new Conexao().conectar();
		
	}
	
	@Override
	public void inserir(Topico obj) {
		
		try {
			
			String sql = "insert into topico (titulo, post, autor, data)" + "Values (? , ? , ? , ?)";
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,obj.getTitulo());
			pstm.setString(1, obj.getPost());
			pstm.setString(1, obj.getAutor());
			pstm.setDate(4, new Date( obj.getData().getTime()));
			pstm.executeUpdate();
			
		} catch (Exception e) {

			System.out.println("Erro ao inserir" + e.getMessage());
		}
		
	}

	@Override
	public List<Topico> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
