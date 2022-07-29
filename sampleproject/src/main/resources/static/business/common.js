function dataSend(){
	var data = $("#input").val();

	alert("######");
	alert("data :: " + data);

	var messageDTO = {
		result : data
	}

	$.ajax({
		url:"/home/funcTestSearch",
		data:messageDTO,
		type:"POST",
	}).done(function(fragment){
		$("#resultDiv").replaceWith(fragment);
	})
}