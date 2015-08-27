/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


console.log('custom JS file added');

$.fn.initList = function() {
   $("#videoList > li > a").on("click", function(e){
      e.preventDefault();
      // get the url href from the link
      var url = $(this).attr("href");
      // get a reference to the iframe element on the page
      var iframe = $('#player');
      // change the src of the iframe to the new video url
      iframe.attr('src', url);
   });
};
function writeContentToPage(id, content) {
   $("#" + id).html(content).initList();
}



function genVideoList(data) {
   console.log('genVideoList');
   var video_array = data.videos;
   var html_string = "";
   
   for(var i = 0; i < video_array.length; i++) {
      var obj = video_array[i];
     console.log(obj);
     url = "https://www.youtube.com/embed/" + obj + "?fs=1&autoplay=0&loop=0&html5=1";
     tmp = "<li><a href='" + url + "'>Video " + (i+1) + "</a></li>";
     html_string += tmp;
  }
  writeContentToPage("videoList", html_string);
}

function writeContentToPage(id, content) {
   $("#" + id).html(content);
}


 function getYouTubeVideos() {
   $.ajax({
      url: "http://gdata.youtube.com/feeds/api/standardfeeds/most_popular?v=2&alt=json",
      dataType: "jsonp",
      success: function (data) { showMyVideos(data); }
   });
}

 
function showMyVideos(data) {
   var feed = data.feed;
   var entries = feed.entry || [];
   var html = [""];
   for (var i = 0; i < entries.length; i++) {
      var entry = entries[i];
      var title = entry.title.$t;
      var id = entries[i].id.$t.split('/').reverse()[0];
      var playerUrl = entries[i].media$group.media$content[0].url + '&fs=1&autoplay=0&loop=0';
      html.push("<li><a href='", playerUrl, "'>", title, "</a></li>");
   }
   $("#videoList").html(html.join('')).changeVideo();
}        

$( document ).ready(function(){
    console.log('Custom JS file added 2');
    getYouTubeVideos();
    
});
$.fn.changeVideo = function() {
   $("#videoList > li > a").on("click", function(e){
   e.preventDefault();
   //alert("I was clicked");
   var url = $(this).attr("href");
   var iframe = $('#player');
   iframe.attr('src', url);
   getYouTubeInfo(url);
});
};