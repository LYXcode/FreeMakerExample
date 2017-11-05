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
      <div class="spittleView">
        <div class="spittleMessage" >${spittle.message}</div>
        <div>
          <span class="spittleTime" >${(spittle.time)?string("yyyy-MM-dd")}</span>
        </div>
      </div>
    </div>
    <div id="footer">
       <#include "footer.ftl">
    </div>
    
  </body>
</html>