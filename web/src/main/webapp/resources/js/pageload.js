
var page_load = (function() {
	//@param selector : tag id
	//@param menu : 메뉴 주소(ex: /member/list)
	var fn_load = function(selector, menu) {
		console.log("fn_load=======selector :", selector, " menu :", menu);
		$(selector).load(menu);
	};
	
	var fn_menu_click = function(selector, menu) {
		console.log("fn_menu_click=======selector :", selector, " menu :", menu);
		$(selector).on("click", function() {
			
		});
	};
	
	return {
		fn_load : fn_load,
		fn_menu_click : fn_menu_click
	}
}());