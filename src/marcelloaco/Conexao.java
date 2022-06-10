/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcelloaco;

import java.sql.*;
import static java.time.ZoneOffset.UTC;

public class Conexao {

		String driver = "com.mysql.jdbc.Driver"; // Driver para conexão com o banco
		String banco = "marcelloaco"; // Nome do banco
		String host = "localhost"; // Servidor
		String stringDeConexao = "jdbc:mysql://"+ localhost?serverTimezone=UTC +":3306/" + marcelloaco; // string de conexão com o banco
		String usuario = "root"; //usuario do banco
		String senha = "root";	 //Senha do banco

public Connection conexao;
    private String localhost;

public Conexao()

{
}


public Connection getConexao ()

		{ 

		try
		{ 	
			Class.forName(driver); // carrega o driver
			return DriverManager.getConnection (this.stringDeConexao, usuario, senha);
	}

		catch (Exception e)

		{
			System.out.printIn(e.getMessage());
			return conexao;

				}

		}

public ResultSet getResultSet (String sentenca)

		{

			try

			{ 
				Statement stm = new ConexaoBanco().getInstanceStatement();
				ResultSet rs = stm.executeQuery (sentenca);
				return rs ; 
		}

catch (Exception e )

		{ 
				System.out.printIn(e.getMessage());
				return null;

}
}

public String atualizarBanco (String sentenca)

	try 
  {

		Statement stm =new ConexaoBanco().getInstanceStatement();
		stm.executeUpdate(sentenca);
		return "1";
}
		catch (SQLException e)
	{
		return e.getMessage();
	}

	catch (Exception ex)
	{
		return ex.getMessage();
	}

}

