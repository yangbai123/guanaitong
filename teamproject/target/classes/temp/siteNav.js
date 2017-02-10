var siteNavHTML = '<div class="site-nav">'+
          '<div class="container">'+
            '<ul class="site-nav-r fr">'+
              '<li>您好, ${sessionScope.Session_UserName}</li>'+
              '<li><span>|</span></li>'+
              '<li><a href="#">退出</a></li>'+
            '</ul>'+
          '</div>'+
        '</div>';
document.write(siteNavHTML);