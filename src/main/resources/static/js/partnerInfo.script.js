$(document).ready(function () {
    // post-image   
    $('.oblong-img').css('height', $('.oblong-img').width() * 0.7);
    $('.square-img').css('height', $('.square-img').width() * 1);
    $('.avt-cmt-img').css('height', $('.avt-cmt-img').width() * 1);
    $('.menu-list-img').css('height', $('.menu-list-img').width() * 0.875);
    $('.img-recmm').css('height', $('.img-recmm').width() * 0.5);
    $('.diary-img').css('height', $('.diary-img').width() * 0.5);
    $('.rated-avt-img').css('height', $('.rated-avt-img').width() * 1);
    a = $(window).width();
    if (a < 768) {
        b = ($('.avt img').height() / 2) + 28;
        $('.info-rated').css('top', b);
        c = b - 28;
        $('.name-text').css('top', c);
        $('.info-text').css('margin-top', b - 20);
        $('.oblong-img').css('height', $('.oblong-img').width() * 0.5);
        $('.square-img').css('height', ($('.square-img').width() * 1) + 4);
        $('.avt-cmt-img').css('height', $('.avt-cmt-img').width() * 1);
        $('.menu-list-img').css('height', $('.menu-list-img').width() * 0.875);
        $('.img-recmm').css('height', $('.img-recmm').width() * 0.5);
        $('.diary-img').css('height', $('.diary-img').width() * 0.5);
        $('.rated-avt-img').css('height', $('.rated-avt-img').width() * 1);
    };
});
// wow.js
new WOW().init();
$('.menu-list').slick({
    dots: true,
    arrows: false,
    infinite: true,
    speed: 300,
    slidesToShow: 4,
    slidesToScroll: 1,
    swipeToSlide: true,
    lazyLoad: 'ondemand',
    autoplay: true,
    autoplaySpeed: 2000,
    responsive: [{
        breakpoint: 768,
        settings: {
            slidesToShow: 2,
            slidesToScroll: 1,
            rows: 3,
            swipeToSlide: true,
        }
    }]
});
// lazy load
$(document).ready(function () {
    $("img")
        .lazyload({
            event: "scroll",
            effect: "fadeIn",
            threshhold: 0,
        })
        .trigger("lazyload");
});