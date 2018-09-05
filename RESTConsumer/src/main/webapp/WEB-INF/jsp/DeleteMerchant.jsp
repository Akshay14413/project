<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="site-name" style="color: Red; font-size: 50px">
		<b>Merchant Page</b>&nbsp; &nbsp;

	</div>



	<div align="center" style="background-color: #E6E6FA">
		<br> <br>
		<table>
			<form action="/deleteDetails" method="post" >
				<tr>
					<td>Merchant Email</td>
					<td><input type="text" name="emailId"></td>
				</tr>

		</table>
		<br> <input type="submit" value="Submit" name="submit">
		<br> <br> <br> <br> <br>
		</form>
	</div>

</body>
</html>