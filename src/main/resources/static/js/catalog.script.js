$(document).ready(function () {
    // post-image   
    x = $('.oblong-img').width();
    $('.oblong-img').css('height', x * 0.7);
    y = $('.square-img').width();
    $('.square-img').css('height', y)* 1 ;
    z = $('.shop-info img').width();
    $('.shop-info img').css('height', z * 1);
    imageCoverSimpleMenu = $('.image-cover img').width();
    $('.image-cover img').css('height', imageCoverSimpleMenu * 0.78 );
    imageItemSimpleMenuV2SpecialFood = $('.simple-menu-v2 .sector .item img').width();
    $('.simple-menu-v2 .sector .item img').css('height', imageItemSimpleMenuV2SpecialFood * 0.7 );
    // top simple menu
    firstPlaceOfSimpleMenu = -$('.simple-menu').height() *2 ;
    firstPlaceOfSimpleMenuV2 = -$('.simple-menu-v2').height() * 2;
    $('.simple-menu').css('top', firstPlaceOfSimpleMenu  );
    $('.simple-menu-v2').css('top', firstPlaceOfSimpleMenuV2 );
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
// wow.js
new WOW().init();
// simple-menu 
$(".menu-button").click(function () {
    window.scroll({ top: 0, left: 0, behavior: 'smooth' });
    $('.simple-menu').css('top', 0 );
    $('header, main, footer').addClass('hidden-content').delay(2000);
});
$('.simple-menu .close-menu').click(function () {
    $('header, main, footer').removeClass('hidden-content');
    $('.simple-menu').css('top', firstPlaceOfSimpleMenu );
    document.querySelector('footer').scrollIntoView({ behavior: 'smooth' });
});
// simple-menu-v2
$(".menu-v2-button").click(function () {
    window.scroll({ top: 0, left: 0, behavior: 'smooth' });
    $('.simple-menu-v2').css('top', 0 );
    $('header, main, footer').addClass('hidden-content').delay(2000);
});
$('.simple-menu-v2 .close-menu').click(function () {
    $('header, main, footer').removeClass('hidden-content');
    $('.simple-menu-v2').css('top', firstPlaceOfSimpleMenuV2 );
    document.querySelector('footer').scrollIntoView({ behavior: 'smooth' });
});
// position top close button
$(document).ready(function () {
    if ($(window).width() >= 768 ) {
        imageItemSimpleMenuV2NormalFood = $('.simple-menu-v2 .sector2 .item img').width();
        $('.simple-menu-v2 .sector2 .item img').css('height', imageItemSimpleMenuV2NormalFood * 1 );
    }
    else {
        imageItemSimpleMenuV2NormalFood = $('.simple-menu-v2 .sector2 .item img').width();
        $('.simple-menu-v2 .sector2 .item img').css('height', imageItemSimpleMenuV2NormalFood * 0.7 );
    }
})