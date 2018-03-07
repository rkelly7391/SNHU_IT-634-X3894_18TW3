import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RyanFlight Will allow the user to search for a
 * flight
 * 
 * @author ryan.kelly5
 */
@WebServlet(description = "RyanFlightSearches", urlPatterns = { "/FlightSearch" })
public class RyanFlightSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// go to the flight search
		this.showFlightSearch(response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	private void showFlightSearch(HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = this.writeHeader(response);
		// create the xml page for the form.

		writer.append("<h3>Flight Search Form:</h3>\r\n");
		writer.append("Flight Departure<br/>\r\n");
		writer.append("<input type=\"text\" name=\"departure\"/><br/><br/>\r\n");
		writer.append("Flight Destination<br/>\r\n");
		writer.append("<input type=\"text\" name=\"destination\"/><br/><br/>\r\n");
		writer.append("Travel Date<br/>\r\n");
		writer.append("<input type=\"date\" name=\"date\"/><br/><br/>\r\n");
		writer.append("Number of Passengers(max 25)<br/>\r\n");
		writer.append("<input type=\"number\" name=\"numberOfPassengers\" min=\"1\" max=\"25\"/><br/><br/>\r\n");
		writer.append("<button>");
		writer.append("<text>Submit</text>");
		writer.append("</button>");
		writer.append("</form>\r\n");

		this.writeFooter(writer);
	}

	private PrintWriter writeHeader(HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		PrintWriter writer = response.getWriter();
		writer.append("<!DOCTYPE html>\r\n").append("<html>\r\n").append("    <head>\r\n")
				.append("        <title>Customer Support</title>\r\n").append("    </head>\r\n")
				.append("    <body>\r\n");

		return writer;
	}

	private void writeFooter(PrintWriter writer) {
		writer.append("    </body>\r\n").append("</html>\r\n");
	}

}
