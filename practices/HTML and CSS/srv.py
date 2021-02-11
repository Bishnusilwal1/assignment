# import socket
# s=socket.socket(socket.AF_INET,socket_SOCk_STREAM)
# host=socket.gethostname
# port=2874
# s.bind((host,port))
# s.listen(10)
# s.accept()
# socketclient,address=s.accept()
# print("Got Connection From",address)

import socket

server_socket=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
server_socket.bind(("0.0.0.0",8081))
server_socket.listen()
print("server is waiting for connection...")
socket_connection,address=server_socket.accept()
print("client is connected..")
message="thank you for connecting me.."
data=message.encode()
socket_connection.send(data)
data1=socket_connection.recv(1024)
message1=data1.decode()
print(message1)