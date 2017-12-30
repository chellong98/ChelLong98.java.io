$(function() {
	console.log('đã chạy');
	console.log('tính thứ vị trí bằng hàm .offset().top');
	console.log($('.chapter2').offset().top); //tính ra vị trí các class đã selector


	$('.menuTren ul li:nth-child(1) a').on('click', function(event) { //li:nth-child(3) : n tương ứng =3
		event.preventDefault(); //chặn các sự kiện mặc địnhcủa thẻ a
		/* Act on the event */
		console.log('đã click');

		$('html, body').animate({ scrollTop: $('.chapter1').offset().top}, 1400, "easeOutExpo"); //(vị trí của class, đỗ trễ kéo chuột, tên thư viện gia tốc)
	});

	$('.menuTren ul li:nth-child(2) a').on('click', function(event) { //li:nth-child(3) : n tương ứng =3
		event.preventDefault(); //chặn các sự kiện mặc địnhcủa thẻ a
		/* Act on the event */
		console.log('đã click');

		$('html, body').animate({ scrollTop: $('.chapter2').offset().top}, 1400,"easeOutExpo"); //(vị trí của class, đỗ trễ kéo chuột, tên thư viện gia tốc)
	});

	$('.menuTren ul li:nth-child(3) a').on('click', function(event) { //li:nth-child(3) : n tương ứng =3
		event.preventDefault(); //chặn các sự kiện mặc địnhcủa thẻ a
		/* Act on the event */
		console.log('đã click');

		$('html, body').animate({ scrollTop: $('.chapter3').offset().top}, 1400,"easeOutExpo"); //(vị trí của class, đỗ trễ kéo chuột, tên thư viện gia tốc)
	});

	$('.menuTren ul li:nth-child(4) a').on('click', function(event) { //li:nth-child(3) : n tương ứng =3
		event.preventDefault(); //chặn các sự kiện mặc địnhcủa thẻ a
		/* Act on the event */
		console.log('đã click');

		$('html, body').animate({ scrollTop: $('.chapter4').offset().top}, 1400,"easeOutExpo"); //(vị trí của class, đỗ trễ kéo chuột, tên thư viện gia tốc)
	});

	$('.menuTren ul li:nth-child(5) a').on('click', function(event) { //li:nth-child(3) : n tương ứng =3
		event.preventDefault(); //chặn các sự kiện mặc địnhcủa thẻ a
		/* Act on the event */
		console.log('đã click');

		$('html, body').animate({ scrollTop: $('.chapter5').offset().top}, 1400,"easeOutExpo"); //(vị trí của class, đỗ trễ kéo chuột, tên thư viện gia tốc)
	});

	// viết cho nút lên trên
	$('.nutLenTren').on('click', function(event) { //li:nth-child(3) : n tương ứng =3
		event.preventDefault(); //chặn các sự kiện mặc địnhcủa thẻ a
		/* Act on the event */
		console.log('đã click');

		$('html, body').animate({ scrollTop: 0}, 800, "easeOutElastic"); //tốc độ cuộn chuột
	});

});