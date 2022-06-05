window.teWatsonAssistantChatOptions = {
channel_id: ‘YOUR_Channel_ID’,
 identityToken: 'YOUR_JWT',
 // The callback function that is called after the widget instance has been created.
 onLoad: function(instance) {
 instance.render();
 }
};
setTimeout(function() {
 const t = document.createElement('script');
 t.src = 'https://<WebChat_URL>/webchat/loadTEWatsonAssistantChat.js';
 document.head.appendChild(t);
});
