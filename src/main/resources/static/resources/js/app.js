"use strict";
var app = app || {};
app = (() => {
	return { run : $.getScript('/resources/js/cmm/mainHome.js', () => {
		alert('...')
			mainHome.onCreate()
		}) }
})();