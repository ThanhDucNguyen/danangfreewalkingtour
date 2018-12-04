$(document).ready(function () {
    $("img")
        .lazyload({
            event: "scroll",
            effect: "fadeIn",
            threshhold: 0,
        })
        .trigger("lazyload");
        // resize images
        articleImage = $('.article .img-contain img').width();
        $('.article .img-contain img').css('height', articleImage * 0.5 );
        bigItemImage = $('.big-item img').width();
        $('.big-item img').css('height', bigItemImage * 0.5 );
        smallItemImage = $('.small-item img').width();
        $('.small-item img').css('height', smallItemImage * 0.6 );
});
// wow.js