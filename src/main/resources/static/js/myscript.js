// SLICK JS
if ($(window).width() < 769) {
    $('.small-picture').slick({
        responsive: [{
            breakpoint: 768,
            settings: {
                slidesToShow: 2,
                slidesToScroll: 1,
                arrows: false,
                infinite: true,
                speed: 300,
                slidesToScroll: 1,
                lazyLoad: 'ondemand',
                autoplay: true,
                autoplaySpeed: 2000,
                dots: false,
            }
        }]
    });
}
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
// wow.js
new WOW().init();

// IMAGE SIZE CHANGED
$('.route-img img').css('height', $('.route-img img').width() * 0.5);
$('.big-video iframe').css('height', $('.big-video iframe').width() * 0.56);
$('.small-img img').css('height', $('.small-img img').width() * 0.65);
$('.avt img').css('height', $('.avt img').width() * 1);
$('.logo-img img').css('height', $('.logo-img img').width() * 1);
$('.news .big-item .article img').css('height', $('.news .big-item .article img').width() * 0.6);
$('.news .normal-items .article img').css('height', $('.news .normal-items .article img').width() * 0.6);