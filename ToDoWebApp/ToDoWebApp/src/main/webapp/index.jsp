<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="description" content="To Do Web Application">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
        <div class="col-4">
            <h1>Insert Data</h1>
            <form name="insertData" method="get">
                <table>
                    <tbody>
                        <tr>
                            <td>Item: </td>
                            <td><input type="text" name="item" value="" size="50"
                                       placeholder="Required, max 45 characters" required/></td>
                        </tr>
                        <tr>
                            <td>Date Entered: </td>
                            <td><input type="date" name="date_started" value="" size="50" required/></td>
                        </tr>
                        <tr>
                            <td>Date Completed: </td>
                            <td><input type="date" name="date_completed" value="" size="50"/></td>
                        </tr>
                        <tr>
                            <td>Status: </td>
                            <td><input type="text" name="status" value="" size="50"
                                       placeholder="Required, max 45 characters" required/></td>
                        </tr>
                    </tbody>
                </table>
                <div>
                    <p><input type="submit" name="submit" value="Submit Entry" onclick="form.action='enter-item';"/></p>
                </div>
            </form>
        </div>
        <div class="col-4">
            <h1>Delete Data</h1>
            <form name="deleteData" method="get">
                <table>
                    <tbody>
                    <tr>
                        <td>ID: </td>
                        <td><input type="text" name="id" value="" size="50"
                                   placeholder="Enter item ID to delete"/></td>
                    </tr>
                    <tr>
                        <td>Item: </td>
                        <td><input type="text" name="item" value="" size="50"
                                   placeholder="Enter item to delete"/></td>
                    </tr>
                    </tbody>
                </table>
                <div>
                    <p><input type="submit" name="submit" value="Delete Entry" onclick="form.action='delete-item';"/></p>
                </div>
            </form>
        </div>
        <div class="col-2"></div>
    </div>
    <div class="row">
        <div class="col-1"></div>
        <div class="col-4">
            <h1>Print Table</h1>
            <form name="printTable" method="get">
                <div>
                    <p><input type="submit" name="submit" value="Print Table" onclick="form.action='print-table';"/></p>
                </div>
            </form>
        </div>
        <div class="col-4"></div>
        <div class="col-2"></div>
    </div>
    <br/>
    <div class="row">
        <div class="col-5"></div>
        <div class="main col-6">
            <h1>Hello World!!!</h1>
            <br/>
            <a href="hello-servlet">Hello Servlet</a>
        </div>
        <div class="col-1"></div>
    </div>
</body>
</html>