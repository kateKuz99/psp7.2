import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

public class FontServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String input = request.getParameter("numbers");
        String[] numberStrings = input.split(",");
        int[] numbers = new int[numberStrings.length];

        for (int i = 0; i < numberStrings.length; i++) {
            // Удаление пробелов перед числом
            String trimmedNumber = numberStrings[i].trim();
            numbers[i] = Integer.parseInt(trimmedNumber);
        }

        Arrays.sort(numbers);

        request.setAttribute("sortedNumbers", numbers);
        request.getRequestDispatcher("fontpage.jsp").forward(request, response);
    }
}
