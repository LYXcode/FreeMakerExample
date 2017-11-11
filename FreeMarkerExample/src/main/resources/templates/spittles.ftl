<#assign base=request.contextPath />
<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" 
          type="text/css" 
          href="${base}/style.css" ></link>
  </head>
  <body>
    <div id="header">
       <#include "header.ftl">
    </div>
  
    <div id="content">
      <div class="spittleForm">
        <h1>Spit it out...</h1>
        <form method="POST" name="spittleForm">
          <textarea name="message" cols="80" rows="5"></textarea><br/>
          <input type="submit" value="Add" />
        </form>
      </div>
      <div class="listTitle">
        <h1>Recent Spittles</h1>
        <ul class="spittleList">
          <#list spittleList as spittle> 
	          <li>
	            <div class="spittleMessage">${spittle.message}</div>
	            <div>
	              <span class="spittleTime" >${(spittle.time)?string("yyyy-MM-dd")}</span>
	            </div>
	          </li>
          </#list>
        </ul>
      </div>
    </div>
    
    <div id="footer">
    	   <#include "footer.ftl">
    </div>
  </body>
</html>