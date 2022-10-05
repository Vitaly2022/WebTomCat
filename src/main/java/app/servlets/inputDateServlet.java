package app.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class inputDateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/inputDate.jsp");
        HttpSession session = req.getSession();
        Integer visitCounter = (Integer) session.getAttribute("visitCounter");
        if (visitCounter == null) {
            visitCounter = 1;
        } else {
            visitCounter++;
        }
        req.setAttribute("visitCounter", visitCounter);

        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        String day = req.getParameter("day");
        String month = req.getParameter("month");
        String year = req.getParameter("year");
        String SubmitDate = day+" "+month+" "+year;

        int d = Integer.parseInt (day);
        int m = Integer.parseInt (month);
        int y = Integer.parseInt (year);

        LocalDate date = LocalDate.of(y, m, d);
        DayOfWeek day_week = date.getDayOfWeek();
        Long dayBetween = DAYS.between(LocalDate.of(y, 1, 1), date)+1;

        req.setAttribute("SubmitDate", SubmitDate);
        req.setAttribute("dayOfWeek", day_week);
        req.setAttribute("dayBetween", dayBetween);
        doGet(req, resp);
    }
}
