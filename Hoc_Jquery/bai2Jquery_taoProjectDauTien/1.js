 $(function(){//ready tab
 	//cho tất cả nội dung thu lại
 	$('.ndMotKhoi').slideUp(); //thu lại

 	//click vào h3
 	$('.moiKhoi h3').click(function(event) {
 		/* Act on the event */
 		console.log('Da click roi !');
 		$(this).next().slideToggle(); //tiếp theo của h3 sẽ slide down
 		$(this).toggleClass('mauXanh') //kich vào thì thêm class, kích thêm nữa thì bỏ class
 		

 	});
});
 
 	
 