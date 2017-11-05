<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" 
          href="style.css"></link>
  </head>
  <body>
    <div id="header">
       <#include "header.ftl">
    </div>

    <div id="content">
      <h1>Register</h1>
  
      <form method="POST" enctype="multipart/form-data">
        <label>First Name</label>: 
          <input type="text" field="firstName" /><br/>
  
        <label>Last Name</label>: 
          <input type="text" field="lastName" /><br/>
  
        <label>Email</label>: 
          <input type="text" field="email"/><br/>
  
        <label>Username</label>: 
          <input type="text" field="username" /><br/>
  
        <label>Password</label>: 
          <input type="password" field="password"  
        <label>Profile Picture</label>:
          <input type="file"
                 name="profilePicture"
                 accept="image/jpeg,image/png,image/gif" /><br/>

        <input type="submit" value="Register" />
      </form>
    </div>
    <div id="footer">
        <#include "footer.ftl">
    </div>
  </body>
</html>
