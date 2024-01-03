// LoginServlet.java

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String responsePage = "welcome.jsp";
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String message = "";

        if (UserCache.users.containsKey(userName)) {
            User user = UserCache.users.get(userName);
            if (!user.getPassword().equals(password)) {
                responsePage = "index.jsp";
                message = "Invalid Credentials";
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                message = user.getName();
            }
        } else {
            message = "User Does not exist";
            responsePage = "index.jsp";
        }

        RequestDispatcher requestDispatcher = request.getRequestDispatcher(responsePage);
        request.setAttribute("message", message);
        requestDispatcher.forward(request, response);
    }
}
