$(document).ready(function(){

	$("#banner").css({"height":$(window).height() + "px"});

	var flag = false;
	var scroll;

	$(window).scroll(function(){
		scroll = $(window).scrollTop();

		if(scroll > 150){
			if(!flag){
				$("#logo").css({"margin-top": "-5px", "width": "60px","height":"60px"});

				$("header").css({"background-color": "#3FBFBF"});
				flag = true;
			}
		}else{
			if(flag){
				$("#logo").css({"margin-top": "120px", "width": "200px","height":"200px"});

				$("header").css({"background-color": "transparent"});
				flag = false;
			}
		}


	});

});
