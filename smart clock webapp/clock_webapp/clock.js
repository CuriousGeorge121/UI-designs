function clock(){
	var ct = new Date();
	var ch = ct.getHours();
	var cm = ct.getMinutes();
	var cs = ct.getSeconds();

	var weekday = new Array(7);
	weekday[0] =  "Sun";
	weekday[1] = "Mon";
	weekday[2] = "Tue";
	weekday[3] = "Wed";
	weekday[4] = "Thu";
	weekday[5] = "Fri";
	weekday[6] = "Sat";
	var n = weekday[ct.getDay()];
	var month = new Array();
	month[0] = "Jan";
	month[1] = "Feb";
	month[2] = "Mar";
	month[3] = "Apr";
	month[4] = "May";
	month[5] = "Jun";
	month[6] = "Jul";
	month[7] = "Aug";
	month[8] = "Sep";
	month[9] = "Oct";
	month[10] = "No";
	month[11] = "De";
	var m = month[ct.getMonth()];

	var date = ct.getDate();
	var year = ct.getFullYear();

	var week = date + "-"  + m+ "-"+year+"\t\t"+ n;

	cm = (cm < 10? "0" : "") + cm;
	cs = (cs < 10 ? "0" : "") + cs;

	var timeOfDay = (ch < 12) ? "  AM" : "  PM";
	ch = (ch >12) ? ch -12 : ch;
	ch =(ch ==0) ? 12 :ch;

	var currentTimeString = ch + ": " + cm + ": " + cs + " ";

	document.getElementById("clock").innerHTML = currentTimeString;
	document.getElementById("ma").innerHTML = timeOfDay;
	
	document.getElementById("day").innerHTML = week;
	
}

</script>

<script type="text/javascript">
$(document).ready(function() {  
  getWeather(); //Get the initial weather.
  setInterval(getWeather, 1000); //Update the weather every 10 minutes.
});

function getWeather() {

  $.simpleWeather({
    location: 'Auckland Ack',
    unit: 'c',
    success: function(weather) {
	var temp = weather.temp+'&deg;'+weather.units.temp+'<br>'+ weather.region;
	document.getElementById("weather").innerHTML = temp;
	
      //html = '<h1>'+weather.temp+'&deg;'+weather.units.temp+'</h1>';
      //html += '<ul><li>'+weather.city+', '+weather.region+'</li>';
      //html += '<li class="currently">'+weather.currently+'</li>';
  
      //$("#weather").html(html);
    },
    error: function(error) {
      $("#weather").html('<p>'+error+'</p>');
    }
  });
}

