import socket

client_socket=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
client_socket.connect(("127.0.0.1",8081))
print("conneted")
data=client_socket.recv(1024)
message=data.decode()
print(message)
message1="thank you for accepting me...!!"
data1=message1.encode()
client_socket.send(data1)