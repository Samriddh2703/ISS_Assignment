// RegisterServlet.java
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String name = request.getParameter("name");

        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setUserName(userName);

        UserCache.users.put(userName, user);

        response.sendRedirect("index.jsp");
    }
}
