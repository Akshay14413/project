<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Merchant</title>
</head>
<body>

	<div class="site-name" style="color: Red; font-size: 50px">
		<b>Merchant Page</b>&nbsp; &nbsp;

	</div>



	<div align="center" style="background-color: #E6E6FA">
		<br> <br>
		<table>
			<form action="/addDetails" method="post" modelAttribute="merchantBean" enctype="multipart/form-data">
				<tr>
					<td>Merchant Email</td>
					<td><input type="text" name="emailId"></td>
				</tr>

				<tr>
					<td>Password</td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td>Merchant Name</td>
					<td><input type="text" name="merchantName"></td>
				</tr>

				<tr>
					<td>Phone Number</td>
					<td><input type="text" name="phoneNo"></td>
				</tr>

				<tr>
					<td>Merchant Type</td>
					<td><select name="type">
							<option value="direct">Direct</option>
							<option value="Third Party">Third Party</option>
					</select></td>
				</tr>


				<!-- <tr>
					<td>Order Id</td>
					<td><input type="text" name="order"></td>
				</tr> -->

				<!-- <tr>
					<td>Coupon Id</td>
					<td><input type="text" name="coupons"></td>
				</tr> -->
		</table>
		<br> <input type="submit" value="Submit" name="submit">
		<br> <br> <br> <br> <br>
		</form>
	</div>





</body>
</html>