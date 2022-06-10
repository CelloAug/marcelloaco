/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcelloaco;

public class ConexaoBanco {
	public ConexaoBanco(){


			private static Connection conn = null;
			private static Statement db_statement = null;


public static Connection getInstanceConn ()

		{ 


			try
			{   		

				if (conn == null ||conn.isClosed())
					{

					conn = null;
					Conexao conexao = new Conexao ();
					conn = conexao.getConexao();
					conn.setAutoCommit(true);
					db_Statement= conn.createStatement();
					}
			}

			catch (Exception e)
			{

				System.out.printIn("0. Erro ao conectar com o banco. Erro: " e.getMessage());

			}

		return conn;

public static statement getInstanceStatement() throws Exception

{

	if (db_statement== null)

		{
			getInstanceConn();
			}


		return db_stetement;

public static void closeInstanceConn() throws Exception

{
			if (conn !=null)
			if (!conn.isClosed())
			conn.close();

			conn = null;
			db_statement = null;
}

}