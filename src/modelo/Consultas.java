package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Consultas extends Conexion {
/*
	public boolean registrar(Cliente clie) {
		PreparedStatement ps = null;
		Connection con = getConexion();

		String sql = "INSERT INTO Cliente (IdPersona, Usuario , Password) VALUES(?,?,?)";

		try {
			ps = con.prepareStatement(sql);
			ps.setLong(1, clie.getIdPersona().getIdPersona());
			ps.setString(2, clie.getUsuario());
			ps.setString(3, clie.getPassword());
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.err.println("C�digo de Error: " + e.getErrorCode() + "\n" +
					"SLQState: " + e.getSQLState() + "\n" +
					"Mensaje: " + e.getMessage() + "\n");
			return false;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}
	/*
    public boolean modificar(Cliente clie) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE Cliente SET IdCliente=?, IdPersona=?, Usuario=?, Password=? WHERE IdCliente=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, clie.getIdCliente());
            ps.setLong(2, clie.getIdPersona().getIdPersona());
            ps.setString(3, clie.getUsuario());
            ps.setString(4, clie.getPassword());
            ps.setInt(5, clie.getIdCliente());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminar(Producto pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM producto WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
	

	public boolean buscarUsuario(Cliente clie) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConexion();

		String sql = "SELECT * FROM Cliente WHERE Usuario=?";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, clie.getUsuario());
			rs = ps.executeQuery();
			if(rs.next())
			{clie.setIdCliente(rs.getLong("IdCliente"));
			clie.setIdPersona(new Persona(rs.getLong("IdPersona")));;
			clie.setUsuario(rs.getString("Usuario"));
			clie.setPassword(rs.getString("Password"));
			return true;
			}
			return false;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}
*/
	public boolean validacionSesion(String Email, String Contrasena) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConexion();

		String sql = "SELECT * FROM miembros WHERE Email=? AND Contrasena=? ";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, Email);
			ps.setString(2, Contrasena);
			rs = ps.executeQuery();
			ClarPadMiembro miem = new ClarPadMiembro();
			if(rs.next()) {
				miem.actualizarMiembroId((int) rs.getLong("idMiembro"));
			}
			return false;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}
	
}
