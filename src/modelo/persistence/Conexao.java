package modelo.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	
	public static void main(String[] args) {
		new Conexao().conectar();
	}
	
	//metodo para conectar ao banco de dados
	public Connection conectar(){
		
		
		
		try {
			
			Connection conn = null;//interface do java.sql que serve para pegar a conexao com db
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/forun","root", "123456");
						
			System.out.println("Conectando com sucesso!!!");
			
			return conn;
			
		} catch (Exception e) {
			
			System.out.println("Erro ao conectar com banco!" + e.getMessage());
			return null;
			
			// TODO: handle exception
		}
		
	}
	

}
