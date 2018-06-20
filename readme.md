To forward the tomcat from 8080 (default) to 80 

``sudo iptables -t nat -I PREROUTING -p tcp --dport 80 -j REDIRECT --to-port 8080``
