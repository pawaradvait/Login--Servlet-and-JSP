<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Form</title>

</head>
<body>

<%
 
if(request.getAttribute("success") == "sucess"){
	
	out.print("successsss");
	
	request.removeAttribute("success");

};


%>

    <div class="contact-form">
        <h2>Contact Us</h2>
        <form action="contact" method="POST">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" >
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" >
            </div>
            <div class="form-group">
                <label for="subject">Subject:</label>
                <input type="text" id="subject" name="subject" >
            </div>
            <div class="form-group">
                <label for="message">Message:</label>
                <textarea id="message" name="message" ></textarea>
            </div>
            <div class="form-group">
                <button type="submit">Submit</button>
            </div>
        </form>
    </div>

</body>
</html>
    