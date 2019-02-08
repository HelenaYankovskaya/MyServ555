
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Личная информация</title>
</head>

<body>
<h1>Введите ваши данные </h1>
<form action = "servlet-test" method = "GET">
    <table border = "0">

        <tr>
            <td><b>Enter your name</b></td>
            <td><input  name = "fio"
                        size = "70"/></td>
        </tr>

        <tr>
            <td><b>Phone number</b></td>
            <td><input type name = "phone"
                       size = "70"/></td>
        </tr>

        <tr>
            <td><b>E-mail</b></td>
            <td><input type name = "mail"
                       size = "70"/></td>
        </tr>

        <tr>
            <td>Select your sex</td>
            <td>
                <select name = "Your sex">
                    <option value = "Men">Men</option>
                    <option value = "Femail">Femail</option>
                </select>
            </td>
        </tr>

        <tr>
            <td colspan = "2"><input type = "submit" value = "RECORD"/></td>
        </tr>
    </table>
</form>
</body>
</html>