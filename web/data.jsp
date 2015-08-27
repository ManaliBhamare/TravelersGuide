
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!doctype html>
<html>
<head>
	<title></title>
	<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
	<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
	<!--web-font-->
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,700,300,600,800,400' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Oleo+Script:400' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Karma:400,300' rel='stylesheet' type='text/css'>
	<!--//web-font-->
	<!-- Custom Theme files -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Viatges Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
		Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<!-- //Custom Theme files -->
	<!-- js -->
	<script src="js/jquery.min.js"></script>
	<script src="js/modernizr.custom.js"></script>
	<!-- //js -->	
	<!-- start-smoth-scrolling-->
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>	
	<script type="text/javascript" src="js/modernizr.custom.53451.js"></script>
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>
	<!--//end-smoth-scrolling-->
</head>
<body>
	<!--header-->
	<div class="header">
		<div class="container">
			<div class="header-logo">
				<a href="index.html"><h1>My Travel</h1></a>
			</div>
			<div class="top-nav">
				<span class="menu"> </span>
				<ul class="nav1">
					<li><a href="index_1.html">HOME</a></li>
					<li><a href="#places">Places To Visit</a></li>
					
					<li><a href="index.html" class="active">My Travel</a></li>
				</ul>
				<!-- script-for-menu -->
				 <script>
				   $( "span.menu" ).click(function() {
					 $( "ul.nav1" ).slideToggle( 300, function() {
					 // Animation complete.
					  });
					 });
				</script>
				<!-- /script-for-menu -->
			</div>
			<div class="clearfix"> </div>
		</div>	
	</div>
	<!--//header-->
        <br><br><br><br>
        
    <%-- start web service invocation --%><hr/>
    <%
        String place = request.getParameter("place");
        String ac = request.getParameter("activities");
        String exp = request.getParameter("experiences");
   
    String P = place;
    String A = ac;
    String E = exp;
    out.println("<b>Travel Destinations:</b>" + P + "<br> <b>Activities:</b>" + A + "<br> <b>Experiences:</b>" +E );
   %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	data.com.TravelData_Service service = new data.com.TravelData_Service();
	javax.xml.namespace.QName portQName = new javax.xml.namespace.QName("http://com.data/", "data.com.TravelData");
	String req = "<operation  xmlns=\"http://com.data/\"><places>ENTER VALUE</places><activities>ENTER VALUE</activities><experiences>ENTER VALUE</experiences></operation>";
	javax.xml.ws.Dispatch<javax.xml.transform.Source> sourceDispatch = null;
	sourceDispatch = service.createDispatch(portQName, javax.xml.transform.Source.class, javax.xml.ws.Service.Mode.PAYLOAD);
	javax.xml.transform.Source result = sourceDispatch.invoke(new javax.xml.transform.stream.StreamSource(new java.io.StringReader(req)));
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
	<!--//footer-->
	<!--smooth-scrolling-of-move-up-->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			*/
			$().UItoTop({ easingType: 'easeOutQuart' });	
		});
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	<!--//smooth-scrolling-of-move-up-->	
</body>
</html>	


