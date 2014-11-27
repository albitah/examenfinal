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
 * Servlet implementation class darAltaServlet
 */
@WebServlet("/darAlta")
public class darAltaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public darAltaServlet() {
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
		String cupoMaximo= request.getParameter("cupoMaximo");
		String cupoDisponible= request.getParameter("cupoDisponible");
		boolean tipo= Boolean.parseBoolean(request.getParameter("tipo"));
		String numeroComprobacion= request.getParameter("numeroComprobacion");
		String contraseña= request.getParameter("contraseña");
		
		MiBanco a= new MiBanco();
		int id= a.darAlta(numero, cupoMaximo,cupoDisponible, tipo,numeroComprobacion, contraseña);
		
		String men;
		if (id==0){
			men= a.noAlta();
			
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
