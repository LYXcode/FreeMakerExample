<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" 
          type="text/css" 
          href="style.css"></link>
  </head>
  <body>
    <div id="header">
    	   <#include "header.ftl">
    </div>

    <div id="content">
      <h1>Your Profile</h1>
      <span>${spitter.username}</span><br/>
      <span>${spitter.firstName}</span> <span>${spitter.lastName}</span><br/>
      <span>${spitter.email}</span>
      <span><img src="\images\${spitter.id}.jpeg">
    </div>

    <div id="footer">
       <#include "footer.ftl">
    </div>
  </body>
</html>
