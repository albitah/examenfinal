package es.banco.integracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





import es.banco.modelo.TarjetaCredito;


public class TarjetaCreditoDAO {

	private Connection cx;
	   
    private void conectar() {
      try {
           Class.forName("com.mysql.jdbc.Driver");
           cx= DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario","root","root");
           cx.setAutoCommit(false);
       } catch (SQLException e) {
          
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
    }
    private void desconectar() {
        try {
           cx.close();
       } catch (SQLException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
    
    }

	public int darAlta(TarjetaCredito tarjeta) {
		
		int idRetornar=0;
		
		try {
		
		//1. conectar
        conectar();
        
        //2.Preparar la sql (query)
		PreparedStatement ps = cx.prepareStatement("INSERT INTO TARJETACREDITO VALUES(?,?,?,?,?,?,?)");
		  // 2.1 setear los interrogantes...
		  ps.setInt(1, 0);
		  ps.setString(12, TarjetaCredito.getNumero());
		  ps.setString(7, TarjetaCredito.getNumeroComprobacion());
		  ps.setString(4, TarjetaCredito.getContraseña());
		  ps.setString(50, TarjetaCredito.getCantidadIngresar());
		  ps.setString(50, TarjetaCredito.getCantidadRetirar());
		  ps.setString(50, TarjetaCredito.getCantidadPagar());
		  ps.setBoolean(10, TarjetaCredito.isTipoTarjeta());
		
		//3. Ejecutar la consulta
        int filasAfectadas =ps.executeUpdate();
        
        //4.  hacer el commit....
        cx.commit();
        
        
             
       
        //.5.cerrar la conexiÃ³n
        desconectar();
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		       
        return idRetornar;
	}
	
	
	
	public TarjetaCredito cantidadIngresar(String cantidadIngresar) {
		
		TarjetaCredito a= new TarjetaCredito();
		try {
		
	  //1. conectar
        conectar();
      //2. preparar la consulta
        PreparedStatement ps = cx.prepareStatement("SELECT * FROM TARJETACREDITO WHERE id=?");
        // 2.1 setear los ?
            ps.setString(1, cantidadIngresar);
      // 3, ejecutar la consulta
            ResultSet rs =ps.executeQuery();  
       //4. llenar el objeto pais.. con los datos de respuesta de BBDD..
            //Nota: La respuesta viene en un objeto ResultSet
            
            if(rs.next()) {   
            	a.setId(rs.getInt("id"));
            	a.setNumero(rs.getString("numero"));
            	a.setContraseña(rs.getString("contraseña"));
            	a.setNumeroComprobacion(rs.getString("numeroComprobacion"));
            	a.setCantidadIngresar(rs.getString("cantidadIngresar"));
            	
                
             }
			
       //5.desconectar
        	 desconectar();
        	 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
public TarjetaCredito cantidadRetirar(String cantidadRetirar) {
		
		TarjetaCredito a= new TarjetaCredito();
		try {
		
	  //1. conectar
        conectar();
      //2. preparar la consulta
        PreparedStatement ps = cx.prepareStatement("SELECT * FROM TARJETACREDITO WHERE id=?");
        // 2.1 setear los ?
            ps.setString(1, cantidadRetirar);
      // 3, ejecutar la consulta
            ResultSet rs =ps.executeQuery();  
       //4. llenar el objeto pais.. con los datos de respuesta de BBDD..
            //Nota: La respuesta viene en un objeto ResultSet
            
            if(rs.next()) {   
            	a.setId(rs.getInt("id"));
            	a.setNumero(rs.getString("numero"));
            	a.setContraseña(rs.getString("contraseña"));
            	a.setNumeroComprobacion(rs.getString("numeroComprobacion"));
            	a.setCantidadRetirar(rs.getString("cantidadRetirar"));
            	
                
             }
			
       //5.desconectar
        	 desconectar();
        	 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	

public TarjetaCredito cantidadPagar(String cantidadPagar) {
	
	TarjetaCredito a= new TarjetaCredito();
	try {
	
  //1. conectar
    conectar();
  //2. preparar la consulta
    PreparedStatement ps = cx.prepareStatement("SELECT * FROM TARJETACREDITO WHERE id=?");
    // 2.1 setear los ?
        ps.setString(1, cantidadPagar);
  // 3, ejecutar la consulta
        ResultSet rs =ps.executeQuery();  
   //4. llenar el objeto pais.. con los datos de respuesta de BBDD..
        //Nota: La respuesta viene en un objeto ResultSet
        
        if(rs.next()) {   
        	a.setId(rs.getInt("id"));
        	a.setNumero(rs.getString("numero"));
        	a.setContraseña(rs.getString("contraseña"));
        	a.setNumeroComprobacion(rs.getString("numeroComprobacion"));
        	a.setCantidadPagar(rs.getString("cantidadPagar"));
        	
            
         }
		
   //5.desconectar
    	 desconectar();
    	 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return a;
}
	
}
