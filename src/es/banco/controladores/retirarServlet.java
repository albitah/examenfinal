package es.banco.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.banco.modelo.MiBanco;

/**
 * Servlet implementation class retirarServlet
 */
@WebServlet("/retirarServlet")
public class retirarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MiBanco ab;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public retirarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//camino a la BD
		String numero= request.getParameter("numero");
		String contraseña= request.getParameter("contraseña");
		String numeroComprobacion= request.getParameter("numeroComprobacion");
		String cantidadRetirar= request.getParameter("cantidadRetirar");
		
	
		
		
		MiBanco b= new MiBanco();
		String id= b.ingresar(numero,numeroComprobacion, contraseña, cantidadRetirar);
		
		String men;
		String cantidadRetirar2;
		cantidadRetirar2= "10";
		if (cantidadRetirar== cantidadRetirar2){
			men= b.noAdmitido2();
			
			request.setAttribute("mensaje",men);
			RequestDispatcher rd= request.getRequestDispatcher("vistaMensaje.jsp");
		    rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
