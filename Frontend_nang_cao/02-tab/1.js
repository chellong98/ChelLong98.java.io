 $(function(){
 	//click vào nút nào thì cho nó đổi class thành class đã add
 	$('.bonNut li').click(function() { 
 		$('.bonNut li').removeClass('active');
 		$(this).addClass('active');

 		x= $(this).index();
 		x=x+1;
 		// console.log("vị trí của phần tử được clikc là: " + x);

 		//cho nội dung tương ứng hiển thị
 		$('.bonNd ul li').removeClass('hienLen'); //cho tất cả biến mất
 		$('.bonNd ul li:nth-child('+x+')').addClass('hienLen');

 	})
})  
 