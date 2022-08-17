<%-- 
    Document   : SignupWithAJAXhtml
    Created on : 6 May, 2022, 3:29:31 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script>
            function signup()
            {
                var username = document.getElementById("username").value;
                var password = document.getElementById("password").value;
                var email = document.getElementById("email").value;
                var phoneno = document.getElementById("phoneno").value;
                var photo = document.getElementById("photo").files[0];

                if (username == "" || password == "" || email == "" || phoneno == "" || photo == "")
                {
                    document.getElementById("errormessage").innerHTML = "Please fill all fields";
                    document.getElementById("errormessage").style.color = "red";
                } else
                {
                    var formdata = new FormData();
                    formdata.append("username", username);
                    formdata.append("password", password);
                    formdata.append("email", email);
                    formdata.append("phoneno", phoneno);
                    formdata.append("photo", photo);

                    var xml = new XMLHttpRequest();
                    xml.onreadystatechange = function () {

                        if (xml.readyState == 4 && xml.status == 200)
                        {
                            var res = xml.responseText;
                            res = res.trim();
                            if (res == "success")
                            {
                                document.getElementById("errormessage").innerHTML = "Signup Successful <a href=\"LoginWithAJAX.html\" >Login?</a>";

                                document.getElementById("errormessage").style.color = "green";

                                document.getElementById("username").value = "";
                                document.getElementById("password").value = "";
                                document.getElementById("email").value = "";
                                document.getElementById("phoneno").value = "";
                                document.getElementById("photo").value = "";


                            } else
                            {
                                document.getElementById("errormessage").innerHTML = "Username already exist";
                                document.getElementById("errormessage").style.color = "red";

                            }

                        }

                    };
                    xml.open("post", "signupwithajax", true);
                    xml.send(formdata);

                }

            }
        </script>
        
        
        
        
        
        
    </head>
    <body>
          <form >

                        <div class="form-group">
                            <input type="text" id="username" placeholder="Enter Username" class="form-control" />
                        </div>

                        <div class="form-group">
                            <input type="password" id="password" placeholder="Enter Password" class="form-control" />
                        </div>

                        <div class="form-group">
                            <input type="email" id="email" placeholder="Enter Email" class="form-control" />
                        </div>

                        <div class="form-group">
                            <input type="number" id="phoneno" placeholder="Enter Phoneno" class="form-control" />
                        </div>

                        <div class="form-group">
                            <label>Choose Photo: </label>
                            <input type="file" id="photo"  class="form-control" />
                        </div>
                        <div class="form-group">
                            <input type="button" class="btn btn-primary" value="Signup" onclick="signup()"  />
                        </div>

                    </form>
           <h5 id="errormessage"></h5>
    </body>
</html>
