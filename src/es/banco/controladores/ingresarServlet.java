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
 * Servlet implementation class ingresarServlet
 */
@WebServlet("/ingresarServlet")
public class ingresarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ingresarServlet() {
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
				String cantidadIngresar= request.getParameter("cantidadIngresar");
				
			
				
				
				MiBanco b= new MiBanco();
				String id= b.ingresar(numero,numeroComprobacion, contraseña, cantidadIngresar);
				
				String men;
				String cantidadIngresar2;
				cantidadIngresar2= "5";
				if (cantidadIngresar== cantidadIngresar2){
					men= b.noAdmitido();
					
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
