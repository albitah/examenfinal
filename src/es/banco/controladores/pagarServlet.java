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
 * Servlet implementation class pagarServlet
 */
@WebServlet("/pagarServlet")
public class pagarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object cantidadPagar;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pagarServlet() {
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
		String cantidadPagar= request.getParameter("cantidadPagar");
		
	
		
		
		MiBanco b= new MiBanco();
		String id= b.pagar(numero,numeroComprobacion, contraseña, cantidadPagar);
		
		String men;
		String cantidadPagar2;
		cantidadPagar2= "0";
		if (cantidadPagar== cantidadPagar2){
			men= b.noAdmitido3();
			
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
