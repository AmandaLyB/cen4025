<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="description" content="To Do Web Application">
    <meta name="viewport" contet="width=device-width, initial-scale=1.0">
    <title>To Do List</title>
    <link rel="stylesheet" href="main.css">
</head>

<body>
    <div class="row">
        <div class="col-1 menu">
            <ul onclick="location.href='https://www.google.com/'"><li>Home</li></ul>
        </div>
        <div class="col-1 menu">
            <ul onclick="location.href='https://www.google.com/'"><li>Log</li></ul>
        </div>
        <div class="col-1 menu">
            <ul onclick="location.href='./about.html'"><li>About</li></ul>
        </div>
        <div class="col-9 menu">
            <ul><li><h3></h3></li></ul>
        </div>
    </div>

    <div class="row">
        <div class="col-1"></div>
        <div class="col-10">
            <h1>Insert Data</h1>
            <form name="insertData" action="results.jsp" method="post">
                <table>
                    <tbody>
                        <tr>
                            <td>Item: </td>
                            <td><input type="text" name="item" value="" size="50"
                                       placeholder="Required, max 45 characters" required/></td>
                        </tr>
                        <tr>
                            <td>Date Started: </td>
                            <td><input type="date" name="date_started" value="" size="50"/></td>
                        </tr>
                        <tr>
                            <td>Date Completed: </td>
                            <td><input type="date" name="date_completed" value="" size="50"/></td>
                        </tr>
                        <tr>
                            <td>Status: </td>
                            <td><input type="text" name="status" value="" size="50"/></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" name="submit" value="Submit Entry"/>
            </form>
        </div>
        <div class="col-1"></div>
    </div>
    <div class="main">
        <h1><%= "Hello World!" %></h1>
        <br/>
        <a href="hello-servlet">Hello Servlet</a>
    </div>
</body>
</html>