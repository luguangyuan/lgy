var person = function() {
	var name = "abcde";
	return {
		getName : function() {
			return name;
		},
		setName : function(newName) {
			name = newName;
		}
	}
}();