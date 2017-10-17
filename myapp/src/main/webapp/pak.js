var data={
		label:"haha",
		rowlable:function(){
			alert("helllooo");
		},
};
(function(dm){
	alert(dm.label);
	dm.rowlable();
})(data);