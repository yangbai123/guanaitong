var userName = sessionStorage.getItem("userName");
var siteNavHTML = '<div class="site-nav">'+
          '<div class="container">'+
            '<ul class="site-nav-r fr">'+
              '<li id="usermessage">'+ '你好，'+userName+' </li>'+
              '<li><span>|</span></li>'+
              '<li><a href="#">退出</a></li>'+
            '</ul>'+
          '</div>'+
        '</div>';
document.write(siteNavHTML);