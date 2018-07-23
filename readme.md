This is a noramal jersey web app. You can deploy the war in tomcat or any similar java Servlet container.
Then connect to the UI in the unicode-converter-ui project.
To forward the tomcat from 8080 (default) to 80 

``sudo iptables -t nat -I PREROUTING -p tcp --dport 80 -j REDIRECT --to-port 8080``
