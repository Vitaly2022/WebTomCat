<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WEB JAVA</title>
</head>

<body>
<div>
    <h1>INPUT Date</h1>
</div>

<div>
    <%
        if (request.getAttribute("dayOfWeek") != null) {
            out.println("<p>SubmitDate: '" + request.getAttribute("SubmitDate") + "' </p>");
            out.println("<p>Now '" + request.getAttribute("dayOfWeek") + "' </p>");
            out.println("<p>Day number '" + request.getAttribute("dayBetween") + "' </p>");
            out.println("<p>Visit Counter '" + request.getAttribute("visitCounter") + "' </p>");

        }
    %>
    <div>
        <div>
            <h2>Input date</h2>
        </div>

        <form method="post">
            <label>Day:
                <input type="text" name="day"><br />
            </label>

            <label>Month:
                <input type="text" name="month"><br />
            </label>

            <label>Year:
                <input type="text" name="year"><br />
            </label>



            <button type="submit">Submit</button>
        </form>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>
